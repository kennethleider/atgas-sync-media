package org.atgas.sync.media.beyondtv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.atgas.sync.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.sync.media.beyondtv.webservices.types.ObjectFactory;
import org.atgas.sync.media.beyondtv.webservices.types.PVSProperty;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public class PropertyConverter {
   public static Map<String, String> convert(PVSPropertyBag bag) {
      Map<String, String> retval = new HashMap<String, String>();
      for (PVSProperty pvsProperty : bag.getProperties().getPVSProperty()) {
         retval.put(pvsProperty.getName(), pvsProperty.getValue());
      }
      
      return retval;
   }

public static PVSPropertyBag convert(Map<String, String> properties) {
	ObjectFactory objectFactory = new ObjectFactory();
	PVSPropertyBag bag = objectFactory.createPVSPropertyBag();
	bag.setProperties(objectFactory.createArrayOfPVSProperty());
	for (Map.Entry<String, String> entry : properties.entrySet()) {
		PVSProperty property = objectFactory.createPVSProperty();
		property.setName(entry.getKey());
		property.setValue(entry.getValue());
		bag.getProperties().getPVSProperty().add(property);
	}
	return bag;
}

	public static List<Map<String, String>> convert(
			ArrayOfPVSPropertyBag itemsBySeries) {
		List<Map<String, String>> retval = new ArrayList<Map<String, String>>();
		for (PVSPropertyBag bag : itemsBySeries.getPVSPropertyBag()) {
			retval.add(convert(bag));
		}
	
		return retval;
	}
}
