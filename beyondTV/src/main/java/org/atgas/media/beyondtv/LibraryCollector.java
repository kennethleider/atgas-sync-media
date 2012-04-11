/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.beyondtv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import org.atgas.media.beyondtv.webservices.BTVLibrary;
import org.atgas.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.atgas.store.Change;
import org.atgas.store.ProxyRelationship;
import org.atgas.store.Thing;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ken
 */
public class LibraryCollector implements Callable<Change> {
    private static final Logger LOG = Logger.getLogger(LibraryCollector.class.getName());

    private static final String SERIES_STANDARD_ID = "c7fb8441-d5db-4113-8af0-e4ba0c3f51fd";
    private static final String EPISODE_STANDARD_ID = "a99a8588-93df-4811-8403-fe22c70fa00a";
    private static final String SOURCE_ID = "6dbb5efa-7cf4-4b12-8799-f0176f09b5db";
    private static final String FILE_STANDARD_ID= "c5919cbf-fbf3-4250-96e6-3fefae51ffc5";
    private static final String RECORDING_STANDARD_ID = "4a40811d-c067-467f-8ff6-89f37eddb933";
    @Autowired
    private final BTVSession session;


    public LibraryCollector(BTVSession session) {
        this.session = session;
    }

    @Override
    public Change call() throws Exception {
        BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
        Change retval = new Change();

        for (PVSPropertyBag bag : library.getSeries(session.ticket).getPVSPropertyBag()) {
            final Thing series = createSeries(bag);
            retval.add(series);

            ArrayOfPVSPropertyBag episodeBags = library.getItemsBySeries(session.ticket, series.getString("title"));
            retval.add(createEpisodeThings(episodeBags, series));
        }

        return retval;
    }

    private Collection<Thing> createEpisodeThings(ArrayOfPVSPropertyBag episodeBags, Thing series) {
        Collection<Thing> retval = new ArrayList<>();

        for (PVSPropertyBag bag : episodeBags.getPVSPropertyBag()) {
            Map<String, String> props = PropertyConverter.convert(bag);
            Thing episode = createEpisode(props);
            Thing file = createFileThing(props);
            Thing recording = createRecordingThing(props);
            episode.addRelationship(new ProxyRelationship("series", series));
            episode.addRelationship(new ProxyRelationship("location", file));
            retval.add(episode);
            retval.add(file);
            retval.add(recording);
        }

        return retval;
    }

    private Thing createSeries(PVSPropertyBag bag) {
        Thing retval = new Thing(SERIES_STANDARD_ID, SOURCE_ID);
        Map<String, String> props = PropertyConverter.convert(bag);

        retval.setProperty("title", props.get("Name"));
        retval.setProperty("zap2it-id", "EP00" + props.get("SeriesKey"));

        return retval;
    }

    private Thing createEpisode(Map<String, String> props) {
        Thing retval = new Thing(EPISODE_STANDARD_ID, SOURCE_ID);

        retval.setProperty("actors", props.get("Actors"));
        retval.setProperty("zap2it-id", props.get("EPGID"));
        retval.setProperty("description", props.get("EpisodeDescription"));
        retval.setProperty("title", props.get("EpisodeTitle"));
        retval.setProperty("genre", props.get("Genre"));
        retval.setProperty("original-air-date", props.get("OriginalAirDate"));
        retval.setProperty("rating", props.get("Rating"));
        retval.setProperty("recommendation", props.get("Recommendation"));
        retval.setProperty("watched", props.get("Watched"));

        return retval;
    }

    private Thing createFileThing(Map<String, String> props) {
        Thing retval = new Thing(FILE_STANDARD_ID, SOURCE_ID);
        retval.setProperty("path", props.get("FullName"));
        return retval;
    }

    private Thing createRecordingThing(Map<String, String> props) {
        Thing retval = new Thing(RECORDING_STANDARD_ID, SOURCE_ID);
        /*
         "ActualStart": "128940804041590000",
         "Added": "129785012346602128",
         "AddedBias": "360",
         "Channel": "653",
         "Duration": "17940000000",
         "Editable": "TRUE",
         "LastExistsTime": "129785023376312991",
         "LastPosition": "",
         "LastWriteTime": "128941119064740000",
         "Length": "260104706",
         "Managed": "True",
         "MovieYear": "",
         "OriginalFileSize": "2747662336",
         "OriginalStart": "",
         "ReadOnly": "True",
         "ShowSqueeze": "True",
         "SortableTime": "128940588041590000",
         "StationCallsign": "KUSADT",
         "TZBias": "360",
         "TargetStart": "128940804000000000",
         "UniqueChannelID": "800990000200653000000021298",
         "Watched": "",
         "Clip": "",
         "ClipTitle": "",
         "SrtExists": "False",
         "FileFormat": "H.264/MPEG-4",
         "Watched": "",
         * */

        return retval;
    }
}
