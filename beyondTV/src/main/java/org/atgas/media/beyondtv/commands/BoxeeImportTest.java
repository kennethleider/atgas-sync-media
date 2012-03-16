package org.atgas.sync.media.beyondtv.commands;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.junit.Test;

public class BoxeeImportTest {

	@Test
	public void testInvoke() throws Exception {
//		Actors,Vincent D'Onofrio, Kathryn Erbe, Christopher Noth, Julianne Nicholson, Eric Bogosian
//		
//		MovieYear,
//		OriginalStart,
//		ReadOnly,True
//		Recommendation,False
//		ShowSqueeze,True
//		SortableName,Law & Order: Criminal Intent
//		SortableTime,129529186832309611
//		SrtExists,False
//		StationCallsign,BRAVO
//		TZBias,360
//		TargetStart,129529404000000000
//		Title,Law & Order: Criminal Intent
//		UniqueChannelID,800830000800180000000010057
//		UserID,cca9147a-bdf1-456d-aa40-73e392759146
//		Added,129529667359799718
//		AddedBias,360
//		Channel,180
//		Clip,
//		ClipTitle,
//		Editable,TRUE
//		Folder,BeyondTV
//		InProgress,False
//		LastPosition,
//		LastExistsTime,129529668125303502

//		Managed,False
//		Name,Law & Order_ Criminal Intent-(Ten Count)-2011-06-19-0.mp4
//		OriginalFileSize,876609536		
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("DisplayTitle","Law & Order: Criminal Intent");
		properties.put("Duration", "38350000000");
		properties.put("EPGID", "EP4461730157");
		properties.put("EpisodeTitle", "Foo bar");
		properties.put("EpisodeDescription","Logan and Wheeler investigate the world of amateur boxing when the brother of a young man Logan used to mentor is shot outside a nightclub.");
		properties.put("Added","129529667359799718");
		properties.put("ActualStart","129529402832309611");
		properties.put("LastWriteTime","129529666969999999");
//		FileFormat,H.264/MPEG-4
		properties.put("FullName","\\\\BELEGOST\\video\\Recorded\\BeyondTV\\Law & Order_ Criminal Intent-(Ten Count)-2011-06-19-0.mp4");
		properties.put("Genre","Crime drama / Drama");
//		Rating,
		properties.put("OriginalAirDate", "20080727");
//		Watched,
		properties.put("Length", "3341096340");
		
		//new BoxeeImport().invoke(PropertyConverter.convert(properties));
	}

}
