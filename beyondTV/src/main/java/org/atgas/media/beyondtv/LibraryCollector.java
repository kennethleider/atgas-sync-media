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

import com.google.common.collect.Lists;
import org.atgas.core.Description;
import org.atgas.core.impl.ChangeImpl;
import org.atgas.core.impl.DeepRelationship;
import org.atgas.core.impl.MutableDescription;
import org.atgas.core.impl.MutableThing;
import org.atgas.media.beyondtv.webservices.BTVLibrary;
import org.atgas.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.atgas.core.Change;
import org.atgas.core.Thing;
import org.atgas.media.standards.IDs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ken
 */
@Component
public class LibraryCollector implements Callable<Change> {
    private static final Logger LOG = Logger.getLogger(LibraryCollector.class.getName());
    private static final String SOURCE_ID = "6dbb5efa-7cf4-4b12-8799-f0176f09b5db";

    private final BTVSession session;
    private final PropertyConverter converter;

    @Autowired
    public LibraryCollector(BTVSession session, PropertyConverter converter) {
        this.session = session;
        this.converter = converter;
    }

    @Override
    public Change call() throws Exception {
        BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
        ChangeImpl retval = new ChangeImpl();

        for (PVSPropertyBag bag : library.getSeries(session.ticket).getPVSPropertyBag()) {
            Map<String, String> props = converter.convert(bag);
            final MutableThing series = new MutableThing(createSeriesDescription(props), createSeriesID(props));

            ArrayOfPVSPropertyBag episodeBags = library.getItemsBySeries(session.ticket, props.get("Name"));
            retval.add(createEpisodeThings(episodeBags, series));
        }

        return retval;
    }

    private Collection<Thing> createEpisodeThings(ArrayOfPVSPropertyBag episodeBags, Thing series) {
        Collection<Thing> retval = new ArrayList<>();

        for (PVSPropertyBag bag : episodeBags.getPVSPropertyBag()) {
            Map<String, String> props = converter.convert(bag);
            MutableThing episode = new MutableThing(createEpisodeDescription(props));
            MutableThing file = new MutableThing(createFileDescription(props));
            Thing recording = new MutableThing(createRecordingDescription(props));

            episode.addRelationship(new DeepRelationship("series", episode, series));
            episode.addRelationship(new DeepRelationship("location", episode, file));

            retval.addAll(Lists.newArrayList(episode, file, recording));
        }

        return retval;
    }

    private Description createSeriesDescription(Map<String, String> props) {
        MutableDescription retval = new MutableDescription(IDs.SERIES_STANDARD_ID, SOURCE_ID);
        retval.setProperty("title", props.get("Name"));
        retval.setProperty("description", props.get("SeriesDescription"));  // TODO check that value exists
        retval.setProperty("original-air-date", props.get("OriginalAirDate"));

        return retval;

    }

    private Description createSeriesID(Map<String, String> props) {
        MutableDescription retval = new MutableDescription(IDs.ZAP2IT_STANDARD_ID, SOURCE_ID);

        retval.setProperty("id", "EP00" + props.get("SeriesKey"));
        retval.setProperty("type", "series");

        return retval;
    }

    private Description createEpisodeDescription(Map<String, String> props) {
        MutableDescription retval = new MutableDescription(IDs.EPISODE_STANDARD_ID, SOURCE_ID);

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

    private Description createFileDescription(Map<String, String> props) {
        MutableDescription retval = new MutableDescription(IDs.FILE_STANDARD_ID, SOURCE_ID);
        retval.setProperty("path", props.get("FullName"));
        return retval;
    }

    private Description createRecordingDescription(Map<String, String> props) {
        MutableDescription retval = new MutableDescription(IDs.RECORDING_STANDARD_ID, SOURCE_ID);
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
