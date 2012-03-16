package org.atgas.sync.media.beyondtv.commands;

import java.util.Map;
import java.util.logging.Logger;

import org.atgas.sync.media.beyondtv.BTVSession;
import org.atgas.sync.media.beyondtv.PropertyConverter;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrary;
import org.atgas.sync.media.beyondtv.webservices.BTVLibrarySoap;
import org.atgas.sync.media.beyondtv.webservices.btvlibrary.ArrayOfPVSPropertyBag;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;

public abstract class AbstractSeriesCommand<T> implements Command<PVSPropertyBag> {
	private static final Logger LOG = Logger.getLogger(AbstractSeriesCommand.class.getName());

	protected final BTVSession session;

	public AbstractSeriesCommand(BTVSession session) {
		this.session = session;		
	}
	
	@Override
	public void invoke(PVSPropertyBag item) throws Exception {
		Map<String, String> series = PropertyConverter.convert(item);
		T result = performSeriesOperation(series);
		BTVLibrarySoap library = new BTVLibrary().getBTVLibrarySoap();
	      
		ArrayOfPVSPropertyBag episodes = library.getItemsBySeries(session.ticket, series.get("Name"));
		
		for (PVSPropertyBag episode : episodes.getPVSPropertyBag()) {
  		  try {
  			performEpisodeOperation(result, PropertyConverter.convert(episode));
          } catch (Exception e) {
             LOG.warning("Unable to perform operation on " + episode + ": " + e);
             e.printStackTrace();
          }
       }
	}

	protected abstract void performEpisodeOperation(T seriesResult, Map<String, String> convert) throws Exception;

	protected abstract T performSeriesOperation(Map<String, String> item) throws Exception;

}
