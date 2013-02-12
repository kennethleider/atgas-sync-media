package org.atgas.media.beyondtv;

import org.atgas.core.impl.MutableThing;
import org.atgas.core.json.JSON;
import org.atgas.media.beyondtv.webservices.BTVLibrary;
import org.atgas.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: Ken Leider Date: 2/12/13 Time: 4:07 PM To change this template use File | Settings
 * | File Templates.
 */
public class DownloadBeyondTVData {

    public static void main(String... args) throws JSONException, FileNotFoundException {
        BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
        BTVSession session = BTVSession.connect("4a57cb5f-2031-4c01-9a08-9194559d111a-7fb9fcba", "root", "pie=3.15");
        PropertyConverter converter = new PropertyConverter();


        Collection<JSONObject> allSeries = new ArrayList<>();
        for (PVSPropertyBag bag : library.getSeries(session.ticket).getPVSPropertyBag()) {
            Map<String, String> props = converter.convert(bag);
            JSONObject series = new JSONObject(props);
            allSeries.add(series);

            ArrayOfPVSPropertyBag episodeBags = library.getItemsBySeries(session.ticket, props.get("Name"));
            Collection<JSONObject> episodes = new ArrayList<>();
            for (PVSPropertyBag episodeBag : episodeBags.getPVSPropertyBag()) {
                episodes.add(new JSONObject(converter.convert(bag)));
            }
            series.put("episodes", episodes);
        }

        JSONObject output = new JSONObject();
        output.put("series", allSeries);
        PrintStream out = new PrintStream(new FileOutputStream("beyondtv_dump.json"));
        out.println(output.toString(3));
        session.close();
    }
}
