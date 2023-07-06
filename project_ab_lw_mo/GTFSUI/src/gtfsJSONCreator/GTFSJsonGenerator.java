package gtfsJSONCreator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import GTFS.Route;
import GTFS.Stop;
import GTFS.Collection;
import GTFS.Agency;
import GTFS.Calender;
import GTFS.StopTime;
import GTFS.Trip;


/*
 * We did not figure out why this has to be in a dedicated package
 * instead of a different file/class to use it from other projects!
 */

public class GTFSJsonGenerator {
	private static String[] day_names=new String[]{"monday","tuesday","wendesday","thursday","friday","saturday","sunday"};
	
	private static class TTRoute{
		public String id;
		public String name;
		public List<TTStop> stops;
		
		public TTRoute(String id, String name) {
			this.id=id;
			this.name=name;
			this.stops=new ArrayList<TTStop>();
		}
		
	}
	
	private static class TTStop{
		public String name;
		public List<TTDay> days;
		public String id;
		
		public TTStop(String id, String name) {
			this.id=id;
			this.name=name;
			this.days=new ArrayList<TTDay>();
			for(var dn:day_names) {
				this.days.add(new TTDay(dn));
			}
		}
	}
	
	private static class TTDay{
		public String day_name;
		public List<String> stop_times;
		
		public TTDay(String name) {
			this.day_name=name;
			this.stop_times=new ArrayList<String>();
		}
	}
	
	public static void generateJSON(GTFS.Collection gtfs, File file) throws IOException
	{
		List<Route> routes = gtfs.getRoutes();
		
		var tt=new ArrayList<TTRoute>();
		
		for(var route:routes) {
			var name=route.getShortName();
			var id=route.getRouteID();
			var ttr=new TTRoute(name,id);
			List<Trip> trips=route.getTripsC();
			if(trips.size()==0) {
				continue;
			}
			for(StopTime st:trips.get(0).getStopTimesC()) {
				var tts=new TTStop(st.getStop().getStopID(),st.getStop().getName());
				ttr.stops.add(tts);
			}
		
			for(var trip:trips) {
				var sr=trip.getService();
				if(sr==null) {
					continue;
				}
				var is_operating=new Boolean[] {sr.isMonday(),sr.isTuesday(),sr.isWednesday(),sr.isThursday(),sr.isFriday(),sr.isSaturday(),sr.isSunday()};
				var stop_times=trip.getStopTimesC();
				for(var st:stop_times) {
					var tmp = ttr.stops.stream().filter(s->s.id==st.getStop().getStopID()).findFirst();
					TTStop tts;
					if(tmp.isEmpty()) {
						System.out.println("Inconsistent stop %s".formatted(st.getStop().getName()));
						continue;
						// tts=new TTStop(st.getStop().getStopID(),st.getStop().getName());
						// ttr.stops.add(tts);
					}else {
						tts=tmp.get();
					}
					for(int i=0;i<7;i++) {
						if(is_operating[i]) {
							tts.days.get(i).stop_times.add(st.getArrivalTime());
						}
					}
					
				}
				
			}
			tt.add(ttr);
		}
		
		GsonBuilder builder = new GsonBuilder(); 
	    builder.setPrettyPrinting(); 
	      
	    Gson gson = builder.create(); 
	    var jsonString = gson.toJson(tt); 
	    var sr=new FileWriter(file);
	    sr.write(jsonString);
	    sr.close();
	    System.out.println("Ended");
	}
}
