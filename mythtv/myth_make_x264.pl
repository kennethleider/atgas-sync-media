#!/usr/bin/perl

######################################################################################################
######################################################################################################
###                                                                                                ###
### User Job for MythTV                                                                            ###
### Mythtranscode + cutlist + encode to x264 with handbrake (mkv)                                  ###
###                                                                                                ###
### Start this script with these parameters                                                        ###
###                                                                                                ###
### ../myth_make_x264.pl --input=%DIR%/%FILE%                                                      ###
###                                                                                                ###
######################################################################################################
######################################################################################################

use utf8;
use strict;
use warnings;

use DBI;
use File::Spec;
use File::Touch;
use Getopt::Long;
use File::Basename;
use Date::Calc qw(Add_Delta_DHMS Day_of_Week);
use Data::Dumper;

our (@startArguments, $chanId, $startTime, $fileDir, $fileName, $input, $quality, $verbose, $noCrop, $threads);

@startArguments = @ARGV;

## Startparams
GetOptions( "input=s"       => \$input,
            "quality:i"     => \$quality,
            "verbose"       => \$verbose,
            "noCrop"        => \$noCrop,
            "threads:s"     => \$threads
        );

if (!$threads || $threads eq '')
{
    $threads = 'auto';
}
else
{
    $threads = "--threads=$threads";
}

####################################################################################################
##############################################  Config  ############################################
####################################################################################################

## mythtv database connection
use constant MYTHHOST       => "localhost";
use constant MYTHDB         => "mythconverg";
use constant MYTHUSER       => "mythtv";
use constant MYTHPASS       => "LahQ9YKD";

## owner of file after successful run
## works only if mythtv user has sufficient permissions to do this
## set a valid value /bin/chown would accept, eg. "reznor:users"
## setting ownership after encoding will be skipped if this variable is empty
my $fileOwner       = "";

## directory to store temp files in
## if it does not exist it will be created
my $tempDir         = "/belegost/video/tmp";

## target directory to store encoded files in
my $targetDir       = "/belegost/video/Recorded/mythtv";

## Video

## Video constant quality encoding option
## Check handbrake manual for valid values
my %videoQualityHash = ( 19000000 => 22,
                         80000000 => 28 );

# have to add 1 second to keyframe times
# for HD-PVR recordings, because ffmpeg
# makes up PTS values in that context,
# and they start at 1 second, rather
# than at zero!  To be safe, we insert
# two keyframes, one for PTS offset 0,
# and another for offset 1.
my $pts_time_offset = 1.00;

## Audio

## preferred audio language
## comma separated list
## check the list at
## http://www.loc.gov/standards/iso639-2/php/code_list.php
## for the correct iso639-1 codes
my $prefLang        = 'en';

## audio languages you wish to skip
## comma separated list
## mis = miscellaneous language
my $skipLang        = 'mul,mis,fr';

## The following filetypes are mapped to integer values
##
## 1 => ac3
## 2 => mp2
## 3 => any other filetypes

## Preferred way of handbrake treating audio tracks by codec.
## Here the usual used codecs for dvb are listed as keys
## and the values represent the corresponding way how
## handbrake shall treat them.
## Since I don't know what I would choose if I had HD-tuners,
## I don't assume any values ... this is up to you :)
our $audioCodecMap = {  1 => 'copy', # ac3 streams will be copied as they are
                        2 => 'lame', # mp2 streams will be converted to mp3
                        3 => 'lame'  # unknown filetypes are going to be converted to mp3
                     };

## Encoding priority
my $niceValue       = 15;

## Maximum allowed parallel executions of this script
my $maxExec         = 3;

## If $maxExec would exceed the allowed value, the amount of seconds to wait
## for other encoding processes to finish which were startet by this script
my $sleepInterval   = 240;

## Maximum allowed time to sleep in seconds before aborting when waiting for other
## encodings started by this script
## If set to 0, it will wait forever
my $maxSleepTime    = 0;

## If set to 1, daylight savings time is considered
my $DST = 1;

####################################################################################################
##############################################  Start  #############################################
####################################################################################################

## What is my name?
my $scriptName = basename($0);

$fileName = basename($input, '.mpg');

## Directory where all the work is done
my $workDir = "$tempDir/$fileName";

if (! -d $workDir)
{
    system("mkdir -p $workDir");
    abnormalExit("Could not create " . $workDir . " : " . $!) if ($? != 0);
}

## Logfile
our $logFile = "$workDir/${scriptName}.log";

## Open logfile
open (LOG, ">> $logFile");

## Check command line options
checkOptions($input, $quality, $verbose, $scriptName);

## Gather information about recording's title, subtitle, season and episode data
toLog("Gather information about recording's title, subtitle, season and episode", "INFO");
my $recordingInfo = getRecordingInfo($fileDir, $fileName);

## Cut list file
our $cutListFile = "$workDir/${scriptName}.cut";

## If called interactively, log to STDOUT and logfile
our $hasTty = -t STDIN && -t STDOUT;

## Switch off output buffering
$| = 1;

my $ncr = '';
my $ver = '';

$ncr = '--noCrop' if ($noCrop);
$ver = '--verbose' if ($verbose);

my $completeTitle = computeOutputName($recordingInfo);

print $completeTitle;
## Echo start of script
toLog("Start encoding $fileName", "INFO");
toLog("Script started with " . join(' ', @startArguments), "INFO");;


## Return code
my $rc = 0;

## Output of command line tools
my $output;

## Required programs for this script
my $requiredPrograms = {    "mythtranscode"     => "media-video/mythtv",
                            "mythutil"          => "media-video/mythtv",
                            "HandBrakeCLI"      => "media-video/handbrake",
                            "mkvmerge"          => "media-video/mkvtoolnix",
                            "mediainfo"         => "media-video/mediainfo",
                            "avconv"            => "media-video/avcodec"
                        };

## Check for required programs and replace package names by absolute path to program
toLog("Checking requirements", "INFO");
requirements($requiredPrograms);

## Check if maximum value of simultaneous encodings will exceed
toLog("Check if other instances are running", "INFO");
checkRunning($scriptName, $workDir, $maxExec, $sleepInterval, $maxSleepTime);





## Gather info about recording's tracks
toLog("Gather information about recording's tracks", "INFO");
my $mediaInfo = getMediaInfo($fileDir, $fileName);

## Start processing
my $cmd;

## Get audio channel numbers, codecs and bitrates
my (@channelLanguages, @channelNumbers, @channelCodecs, @channelBitrates, @channelFilenames, $videoFilename, @channelTrackPos, @channelAvconvTrackPos);
my $channelCounter = 0;

toLog(Dumper($mediaInfo->{'audio'}), "VERB") if ($verbose);

my $utcStartTime = 'foo';

foreach (sort {$mediaInfo->{'audio'}{$a}->{'streamPriority'} <=> $mediaInfo->{'audio'}{$b}->{'streamPriority'}} keys %{$mediaInfo->{'audio'}})
{
    # print $mediaInfo->{'audio'}{$_}{'streamPriority'} . "\n";
    push(@channelLanguages, $mediaInfo->{'audio'}{$_}->{'language'});
    push(@channelNumbers, $mediaInfo->{'audio'}{$_}->{'channels'});
    push(@channelCodecs, $mediaInfo->{'audio'}{$_}->{'streamType'});
    push(@channelBitrates, $mediaInfo->{'audio'}{$_}->{'bitrate'});
    push(@channelAvconvTrackPos, '-codec:a:0:' . $mediaInfo->{'audio'}{$_}->{'trackPos'} . ' copy');
    push(@channelTrackPos, $mediaInfo->{'audio'}{$_}->{'trackPos'});

    if ($channelCounter > 0 && $mediaInfo->{'Codec'} ne 'AVC')
    {
        if (-e $workDir . '/' . sprintf("%s-%02d", $chanId . '_' . $startTime, $channelCounter) . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'})
        {
            push(@channelFilenames, $workDir . '/' . sprintf("%s-%02d", $chanId . '_' . $startTime, $channelCounter) . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'});
        }
        elsif (-e $workDir . '/' . sprintf("%s-%02d", $chanId . '_' . $utcStartTime, $channelCounter) . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'})
        {
            push(@channelFilenames, $workDir . '/' . sprintf("%s-%02d", $chanId . '_' . $utcStartTime, $channelCounter) . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'});
        }
    }
    else
    {
        if (-e $workDir . '/' . $chanId . '_' . $startTime . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'})
        {
            push(@channelFilenames, $workDir . '/' . $chanId . '_' . $startTime . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'});
        }
        elsif (-e $workDir . '/' . $chanId . '_' . $utcStartTime . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'})
        {
            push(@channelFilenames, $workDir . '/' . $chanId . '_' . $utcStartTime . '.' . $mediaInfo->{'audio'}{$_}->{'streamType'});
        }
    }
}

my $audioLanguages      = join (',', @channelLanguages);
my $audioNumbers        = join (',', @channelNumbers);
my $audioCodecs         = join (',', @channelCodecs);
my $audioBitrates       = join (',', @channelBitrates);
my $audioFilenames      = join (' ', @channelFilenames);
my $avconvAudioTracks   = join (' ', @channelAvconvTrackPos);
my $audioTracks         = join (',', 1 .. ($#channelAvconvTrackPos + 1));

toLog("audio tracks: " . $avconvAudioTracks . "\n", "VERB") if ($verbose);

my $videoQuality = -1;
foreach my $key ( keys %videoQualityHash )
{
  if ($$mediaInfo{'height'} * $$mediaInfo{'width'} < $key) {
     $videoQuality = $videoQualityHash{$key};
     print "videoQuality set to $videoQuality";
  }
}

## Now that we have all information we need, let's get to encode it with handbrake
toLog("Starting handbrake", "INFO");
$cmd = "time nice -n $niceValue $$requiredPrograms{'HandBrakeCLI'} -i $input -o $workDir/$fileName.handbrake.mkv -a $audioTracks -E $audioCodecs -B $audioBitrates -A $audioLanguages -f mkv -e x264 -q $videoQuality -x ref=2:bframes=2:subme=6:mixed-refs=0:weightb=0:8x8dct=0:trellis=0:threads=$threads -5 -s scan -F";
$cmd    .= ' --crop 0:0:0:0' if ($noCrop);
$cmd    .= ' -N ' . $prefLang . ' --native-dub 2>&1';
toLog("Executing: $cmd", "VERB") if ($verbose);

$output = `$cmd`;
toLog($output, 'VERB') if ($verbose);
abnormalExit("handbrake exited with errors, run " . $scriptName . " --verbose and check logfile " . $logFile . " for errors.") if ($? != 0);

toLog("handbrake finished", "INFO");


## Create audio language names by muxed audio tracks
## Audio TrackId will start at 2 (1 is video track)
my $mkvmergeAudio;
my $mkvmergeAudioTrackId = 1;
foreach (@channelLanguages)
{
    $mkvmergeAudio .= " --language " . $mkvmergeAudioTrackId . ":" . $_;
    $mkvmergeAudioTrackId++;
}

## Check if target file already exists
## If so, append a timestamp to the target filename
if (-e $targetDir . "/" . $completeTitle . ".mkv")
{
    (my $sec, my $min, my $hour, my $day, my $month, my $year) = (localtime)[0,1,2,3,4,5];
    my $timeStamp = sprintf("%04d%02d%02d%02d%02d%02d", $year+1900, $month+1, $day, $hour, $min, $sec);
    $completeTitle = $completeTitle . "_" . $timeStamp;
}

## Put all information we gathered into the .mkv file/name
## And let mkvmerge write the finished file to the target directory
toLog("Starting mkvmerge", "INFO");

my $metaTitle = $$recordingInfo{'subtitle'} = '' ? $$recordingInfo{'title'} : $$recordingInfo{'subtitle'};
$cmd = 'nice -n ' . $niceValue . ' ' . $$requiredPrograms{'mkvmerge'} . ' -o ' . $targetDir . '/' . '"' . $completeTitle . '.mkv"'
        . ' --title "$metaTitle" ' . $mkvmergeAudio . ' --default-track 1:yes'
        . ' ' . $workDir . '/' . $fileName . '.handbrake.mkv 2>&1';
toLog("Executing: $cmd", "VERB") if ($verbose);

$output = `$cmd`;
toLog($output, 'VERB') if ($verbose);
abnormalExit("mkvmerge exited with errors, run " . $scriptName . " --verbose and check logfile " . $logFile . " for errors.") if ($? != 0);

toLog("mkvmerge finished", "INFO");

toLog("Cleaning up temporary files", "INFO");
cleanup($workDir, $fileOwner, $targetDir . "/" . $completeTitle . ".mkv");

toLog("Finished encoding to file '$completeTitle.mkv' ($fileName)", "INFO");
close(LOG);

exit 0;

####################################################################################################
##############################################  Functions ##########################################
####################################################################################################

sub toLog
{
    my ($message, $type) = @_;

    $type = 'INFO' if ( ! $type );

    my ($sec, $min, $hour, $day, $month, $year) = (localtime)[0,1,2,3,4,5];

    my $timeStamp = sprintf("%04d-%02d-%02d %02d:%02d:%02d", $year+1900, $month+1, $day, $hour, $min, $sec);

    my $formattedMessage = sprintf("%s %-5s %s\n", $timeStamp, $type, $message);

    print $formattedMessage if ($hasTty);

    print LOG $formattedMessage;
}

sub abnormalExit
{
    my $message = $_[0];

    toLog($message, 'FATAL');
    closeDBConnection();
    close(LOG);

    exit 1;
}

sub requirements
{
    my $requiredPrograms = $_[0];
    my $wrc = 0;

    foreach my $program (keys %$requiredPrograms)
    {
        my $absolutePath = `which $program`;
        chomp($absolutePath);

        if ($? != 0)
        {
            toLog("Required program " . $program . " (" . $$requiredPrograms{$program} . ") not found.", "FATAL");
            $wrc = 1;
        } else {
            @$requiredPrograms{$program} = $absolutePath;
        }
    }
}

sub checkRunning
{
    my ($scriptName, $workDir, $maxExec, $sleepInterval, $maxSleepTime) = @_;
    my @pids = ();
    my $slept = 0;

    my $curProcs = `ps aux | grep $scriptName | grep -v grep | wc -l`;
    chomp($curProcs);

    ## Check if encoding of this recording has already been started.
    ## If so, abort.
    if (-e "$workDir/running")
    {
        abnormalExit("Encoding of this recording already running in directory " . $workDir . ". Or an error occurred in previous attempt to encode this recording. Aborting.");
    }


    while ($curProcs > $maxExec)
    {
        $curProcs = `ps aux | grep $scriptName | grep -v grep | wc -l`;
        chomp($curProcs);

        toLog($scriptName . " maximum amount of simultaneous executions reached. Waiting " . $sleepInterval . " seconds before trying again.", "INFO");
        sleep($sleepInterval);
        $slept += $sleepInterval;

        if ($maxSleepTime > 0 && $slept > $maxSleepTime)
        {
            toLog("Maximum waiting time of " . $maxSleepTime . " seconds exceeded.", "FATAL");
            abnormalExit("Something might be wrong, please check unfinished encoding jobs. Aborting.");
        }
    }

   touch("$workDir/running");
}

sub in_array
{
    my ($item, $array) = @_;
    my %hash = map { $_ => 1 } @$array;
    if ($hash{$item}) { return 1; } else { return 0; }
}

sub getDBConnection
{
    our $dbh;

    if (!$dbh)
    {
        ## Establish DB connection
        $dbh = DBI->connect("DBI:mysql:" . MYTHDB . ":" . MYTHHOST, MYTHUSER, MYTHPASS);

        if (!$dbh)
        {
            abnormalExit("Can't connect to database.");
        }
    }

    return $dbh;
}

sub execSQL
{
    my $sql = $_[0];

    my @sqlResults;
    my %results;

    my $db = getDBConnection();

    my $sqlQuery  = $db->prepare($sql)
    or abnormalExit("Can't prepare $sql: $db->errstr\n");
    $sqlQuery->execute
    or abnormalExit("can't execute the query: $sqlQuery->errstr\n");

    my $rows        = $sqlQuery->rows;

    if ($rows == 0)
    {
        $sqlQuery->finish;
        $results{'rc'} = 0;

        return \%results;
    }

    for ( my $i = 0; $i < $rows; $i++)
    {
        $sqlResults[$i] = $sqlQuery->fetchrow_hashref;
    }

    $sqlQuery->finish;

    $results{'rc'} = 1;
    $results{'rs'} = \@sqlResults;

    return \%results;
}

sub closeDBConnection
{
    my $db = getDBConnection();
    $db->disconnect or abnormalExit("Can't disconnect from database.");
}

sub getRecordingInfo
{ 
    ## Establish DB connection
    my $db = getDBConnection();

    my $baseName = basename($input);
    ## Fetch recorded info
    my $sql             = <<"SQL";
SELECT title, subtitle, season, episode, seriesid, programid
FROM recorded
WHERE basename = '$baseName'
SQL

    my $recordingInfo   = execSQL($sql);

    if (! $$recordingInfo{'rc'} )
    {
        abnormalExit("RC: " . $$recordingInfo{'rc'} . " - No recording Info for $input found!");
    }
    
    my $record = $$recordingInfo{'rs'}[0];
    $$record{'title'} =~ s#[<>\*\?\|:\"\\/]##g;
    $$record{'subtitle'} =~ s#[<>\*\?\|:\"\\/]##g;
    toLog("\n\tTitle: $${record{'title'}}\n\tSubtitle: $${record{'subtitle'}}\n\tSeason: $$record{'season'}\n\tEpisode: $$record{'episode'}", "INFO");

    return $record;
}

sub computeOutputName
{
    my $postfix = ($$recordingInfo{'title'} =~ m/^$$recordingInfo{'subtitle'}$/ || $$recordingInfo{'subtitle'} eq '') ? '' : ' - ' . $$recordingInfo{'subtitle'};

    my $episode = ($$recordingInfo{'season'} != 0 && $$recordingInfo{'season'} ne ''
            && $$recordingInfo{'episode'} != 0 && $$recordingInfo{'episode'} ne '') ?
            sprintf(" - S%02dE%02d", $$recordingInfo{'season'}, $$recordingInfo{'episode'}) : '';

    return "$$recordingInfo{'title'}/$episode$postfix";
}

sub getMediaInfo
{
    my (%mediaInfo, $cmd);

    my %commands = ( 'video'   => '"Video;%ID%"',
                     'fps'     => '"Video;%FrameRate%"',
                     'Codec'   => '"Video;%Codec%"',
                     'Track'   => '"Audio;%ID%,%Format%,%Channel(s)%,%BitRate%,%Language%\n"',
                     'height'  => '"Video;%Height%"',
                     'width'   => '"Video;%Width%"',
                     'bitrate' => '"Video;%BitRate%"',
);

    my $baseCmd = "nice -n $niceValue $$requiredPrograms{'mediainfo'}";
    foreach my $key ( keys %commands )
    {
       toLog("Starting mediainfo to retrieve $key info", "INFO");	
       $cmd = "$baseCmd --Output=$commands{$key} $input 2>&1";
       toLog("Executing: $cmd", "VERB") if ($verbose);

       $output = `$cmd`;
       chomp($output);
       toLog($output, 'VERB') if ($verbose);
       abnormalExit("mediainfo exited with errors on fetching $key, run $scriptName --verbose and check $logFile for errors.") if ($? != 0);

       $mediaInfo{$key} = $output;

    }

    my $trackPos = 0;

    foreach (split /\n/, $mediaInfo{'Track'})
    {
        my ($id, $streamType, $channels, $bitrate, $language) = split /,/, $_;

        $trackPos++;

        $streamType = 'unknown' if ($streamType !~ m/MPEG Audio|AC-3/);
        $streamType = 'ac3'     if ($streamType =~ m/AC-3/);
        $streamType = 'mp2'     if ($streamType =~ m/MPEG Audio/);

        ## Set audio stream priority
        my $streamPriority;
        $streamPriority     = 1 if ($streamType =~ m/ac3/);     # ac3 priority 1
        $streamPriority     = 2 if ($streamType =~ m/mp2/);     # mp2 priority 2 (if equal amount of channels, prefer mp2)
        $streamPriority     = 3 if ($streamType !~ m/ac3|mp2/); # any other filetype I don't know has priority 0 :)

        ## Only add stream to audio list if all variables are set
        if ($id && $streamType && $channels && $bitrate && $language)
        {
            $mediaInfo{'audio'}{$id} = {    'streamType'        => $streamType,
                                            'channels'          => $channels,
                                            'bitrate'           => ($bitrate / 1000), # we need a kbit value
                                            'language'          => $language,
                                            'trackPos'          => $trackPos,
                                            'streamPriority'    => $streamPriority
                                        };
            toLog($id . " --> " . 'streamType: ' . $streamType . ' streamPriority: ' . $streamPriority . "\n\n", 'VERB') if ($verbose);
        }
    }

    ## Boil down to the really needed audio streams in the encoded file
    ##
    ## Prefer 2 channel mp2 over 2 channel ac3.
    ## Prefer 6 channel audio over 2 channel audio.
    ## Prefer 8 channel audio over 6 channel audio.
    ## Keep languages as well by still following rules above.

    my @skipLanguages = split /,/, $skipLang;

    foreach my $streamId (keys %{$mediaInfo{'audio'}})
    {
        ## Check if streamId was deleted before
        next if ( ! exists $mediaInfo{'audio'}{$streamId} );

        # Delete audio track from list if this language shall be skipped
        if (in_array($mediaInfo{'audio'}{$streamId}{'language'}, \@skipLanguages))
        {
            delete $mediaInfo{'audio'}{$streamId};
            next;
        }

        foreach my $cStreamId (keys %{$mediaInfo{'audio'}})
        {
            ## Skip if comparing with itself
            next if ($cStreamId == $streamId);

            ## Check if streamId was deleted before
            next if ( ! exists $mediaInfo{'audio'}{$cStreamId} || ! exists $mediaInfo{'audio'}{$streamId} );

            if ($mediaInfo{'audio'}{$streamId}{'streamPriority'} > $mediaInfo{'audio'}{$cStreamId}{'streamPriority'} &&
                $mediaInfo{'audio'}{$streamId}{'language'} eq  $mediaInfo{'audio'}{$cStreamId}{'language'}
            )
            {
                if ($mediaInfo{'audio'}{$streamId}{'channels'} >= $mediaInfo{'audio'}{$cStreamId}{'channels'})
                {
                    delete $mediaInfo{'audio'}{$cStreamId};
                }
                else
                {
                    delete $mediaInfo{'audio'}{$streamId};
                }
            }
        }
    }

    return \%mediaInfo;
}


sub cleanup
{
    my ($workDir, $fileOwner, $targetFile) = @_;

    ## Delete working directory
    if ($workDir ne '')
    {
        $output = `rm -r $workDir 2>&1`;

        if ($? != 0)
        {
            toLog("Failed to delete " . $workDir ." : " . $!, "ERROR");
        }
    } else
    {
        toLog("Not deleting empty \$workdir variable. There's something wrong.. :(", "ERROR");
    }

    ## Set ownership
    if ($fileOwner ne '')
    {
        my $execUser = `whoami`;
        chomp($execUser);

        if ($execUser !~ m/root/)
        {
            my $chownCommand = `which chown`;
            chomp($chownCommand);

            $output = `sudo -ln $chownCommand $fileOwner "$targetFile" >/dev/null 2>&1`;

            if ($? == 0)
            {
                $output = `sudo $chownCommand $fileOwner "$targetFile" 2>&1`;

                if ($? != 0)
                {
                    toLog("Failed to set preferred file owner: " . $!, "ERROR");
                }
            } else
            {
                toLog("Failed to set preferred file owner '$fileOwner'.", "ERROR");
                toLog("The user '$execUser' executing this script is neither root nor the use of \"sudo $chownCommand $fileOwner '$targetFile'\" is allowd by sudoers.", "ERROR");
            }
        } else
        {
            toLog("Setting preferred file owner '$fileOwner' to encoded file", "INFO");
            $output = `chown $fileOwner "$targetFile" 2>&1`;

            if ($? != 0)
            {
                toLog("Failed to set preferred file owner: " . $!, "ERROR");
            }
        }
    }
}

sub checkOptions
{
    my ($input, $quality, $verbose, $scriptName) = @_;
    my $failedChecks = 0;


    if ($input eq '')
    {
        toLog("input not set or invalid", "FATAL");
        $failedChecks++;
    }

    if ($quality && ($quality =~ /\D/ || $quality < 0 || $quality > 51))
    {
        toLog("constant quality value invalid", "FATAL");
        $failedChecks++;
    }

    if ($threads ne 'auto')
    {
        if ($threads ne '' && $threads !~ /[0-9]*\.?[0-9]*/)
        {
            toLog("thread value invalid", "FATAL");
            $failedChecks++;
        }

        if ($threads ne '' && $threads =~ /[0-9]*\.?[0-9]*/ && $threads > 128)
        {
            toLog("thread value invalid, a max. of 128 is allowed, but really ... you would not go that high :)", "FATAL");
            toLog("if unsure about which thread value to set, leave it unset. This will set this value to 'auto'.", "FATAL");
            $failedChecks++;
        }
    }

    if ($failedChecks > 0)
    {
        usage($scriptName);
        exit 1;
    }
}

sub usage
{
    my ($scriptName) = @_;

    my $usage = <<EOL;

Usage:  $scriptName --input=[string value] --quality=[int value] --verbose

        --file          Absolute path of recording [REQUIRED]
        --quality       Constant Quality factor [51..0] used by handbrake
                        Look up 'https://trac.handbrake.fr/wiki/ConstantQuality'
                        for more information
                        [OPTIONAL] quality selected based on video definition if not specified
        --threads       Number of threads x264 will utilize for encoding
                        Look up 'http://mewiki.project357.com/wiki/X264_Settings#threads'
                        for more information
                        [OPTIONAL] integer / floating point number, defaults to 'auto'
        --noCrop        Disable auto image cropping by handbrake
                        [OPTIONAL] toggle
        --verbose       Write output of mythtranscode, handbrake and mkvmerge to logfile
                        [OPTIONAL] toggle

        For installation as mythtv user job, it may be called like this:
        ../myth_make_x264.pl --input=%DIR%/%FILE% --threads=1

EOL

    toLog($usage, "USAGE");
}

sub checkDaylightSavingsTime
{
    my $day     = $_[0];
    my $month   = $_[1];
    my $weekday = $_[2];

    # Check to see if the daylight savings time is currently in effect.
    # It starts the first Sunday in April and ends the last Sunday in October.

    # Initialize variables
    my ($daylightSavingsTime,$apr,$oct) = (0,3,9);

    if ($month > $apr && $month < $oct) {
        $daylightSavingsTime = 1;
    }
    elsif ($month == $apr)
    {
        $daylightSavingsTime = 1 if ($day - $weekday) >= 1;
    }
    elsif ($month == $oct)
    {
        my $daysUntilSunday = (7 - $weekday);
        $daylightSavingsTime = 1 if ($day + $daysUntilSunday) <= 31;
    } # end if

    return ($daylightSavingsTime);
}

sub seconds_to_hms
{
    my $timestamp = shift;

    my $hours = int($timestamp / 3600);
    $timestamp -= $hours * 3600;
    my $minutes = int($timestamp / 60);
    $timestamp -= $minutes * 60;
    my $whole_seconds = int($timestamp);
    my $milliseconds = 1000 * ($timestamp - $whole_seconds);

    return sprintf("%02d:%02d:%02d.%03d", $hours, $minutes, $whole_seconds, $milliseconds);
}

