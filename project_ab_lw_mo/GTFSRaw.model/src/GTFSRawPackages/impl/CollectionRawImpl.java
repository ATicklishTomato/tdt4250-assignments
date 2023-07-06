/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.AgencyRaw;
import GTFSRawPackages.CalenderRaw;
import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.GTFSRawPackagesFactory;
import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalTableRaw;
import GTFSRawPackages.RouteRaw;
import GTFSRawPackages.StopRaw;
import GTFSRawPackages.StopTimeRaw;
import GTFSRawPackages.TripRaw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getAgency <em>Agency</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getTrips <em>Trips</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getStopTimes <em>Stop Times</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getStops <em>Stops</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getCalender <em>Calender</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CollectionRawImpl#getOptionalTable <em>Optional Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionRawImpl extends MinimalEObjectImpl.Container implements CollectionRaw {
	/**
	 * The cached value of the '{@link #getAgency() <em>Agency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgency()
	 * @generated
	 * @ordered
	 */
	protected EList<AgencyRaw> agency;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteRaw> routes;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected EList<TripRaw> trips;

	/**
	 * The cached value of the '{@link #getStopTimes() <em>Stop Times</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<StopTimeRaw> stopTimes;

	/**
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<StopRaw> stops;

	/**
	 * The cached value of the '{@link #getCalender() <em>Calender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalender()
	 * @generated
	 * @ordered
	 */
	protected EList<CalenderRaw> calender;

	/**
	 * The cached value of the '{@link #getOptionalTable() <em>Optional Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalTable()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionalTableRaw> optionalTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.COLLECTION_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgencyRaw> getAgency() {
		if (agency == null) {
			agency = new EObjectResolvingEList<AgencyRaw>(AgencyRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__AGENCY);
		}
		return agency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteRaw> getRoutes() {
		if (routes == null) {
			routes = new EObjectResolvingEList<RouteRaw>(RouteRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TripRaw> getTrips() {
		if (trips == null) {
			trips = new EObjectResolvingEList<TripRaw>(TripRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__TRIPS);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopTimeRaw> getStopTimes() {
		if (stopTimes == null) {
			stopTimes = new EObjectResolvingEList<StopTimeRaw>(StopTimeRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__STOP_TIMES);
		}
		return stopTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopRaw> getStops() {
		if (stops == null) {
			stops = new EObjectResolvingEList<StopRaw>(StopRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__STOPS);
		}
		return stops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalenderRaw> getCalender() {
		if (calender == null) {
			calender = new EObjectResolvingEList<CalenderRaw>(CalenderRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__CALENDER);
		}
		return calender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalTableRaw> getOptionalTable() {
		if (optionalTable == null) {
			optionalTable = new EObjectResolvingEList<OptionalTableRaw>(OptionalTableRaw.class, this, GTFSRawPackagesPackage.COLLECTION_RAW__OPTIONAL_TABLE);
		}
		return optionalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readGTFSFiles(String pathToFolder, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		File folder = new File(pathToFolder);
		
		for(File file : folder.listFiles())
		{
			switch(file.getName())
			{
			case "agency.txt":
				readAgencyFile(file.getAbsolutePath(), csvCommaChar);
				break;
			case "routes.txt":
				readRoutesFile(file.getAbsolutePath(), csvCommaChar);
				break;
			case "calendar.txt":
				readCalendarFile(file.getAbsolutePath(), csvCommaChar);
				break;
			case "trips.txt":
				readTripsFile(file.getAbsolutePath(), csvCommaChar);
				break;
			case "stops.txt":
				readStopsFile(file.getAbsolutePath(), csvCommaChar);
				break;
			case "stop_times.txt":
				readStopTimesFile(file.getAbsolutePath(), csvCommaChar);
				break;
			default:
				readOptionalFile(file.getAbsolutePath(), csvCommaChar);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readAgencyFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		try {
			  int namePos = -1;
			  int urlPos = -1;
			  int timezonePos = -1;
			
			  File file = new File(absolutePathToFile);
		      FileReader fr = new FileReader(file);
		      BufferedReader br = new BufferedReader(fr);
		      String line = " ";
		      String[] tempArr;
		      line = br.readLine();
	    	  line = fixSubstrings(line,csvCommaChar);
		      tempArr = line.split(csvCommaChar);

		      for(int i = 0; i < tempArr.length; i++)
		      {
		    	  if(tempArr[i].equals("agency_name"))
		    	  {
		    		  namePos = i;
		    	  }
		    	  else if(tempArr[i].equals("agency_url"))
		    	  {
		    		  urlPos = i;
		    	  } 
		    	  else if(tempArr[i].equals("agency_timezone"))
		    	  {
		    		  timezonePos = i;
		    	  }
		      }
		      
		      while ((line = br.readLine()) != null) {
	    	    line = fixSubstrings(line,csvCommaChar);
		        tempArr = line.split(csvCommaChar);
		        AgencyRaw agency = GTFSRawPackagesFactory.eINSTANCE.createAgencyRaw();
		        agency.setName(tempArr[namePos]);
		        agency.setURL(tempArr[urlPos]);
		        agency.setTimezone(tempArr[timezonePos]);
		        this.getAgency().add(agency);
		      }
		      br.close();
		    }
		    catch(IOException ioe) {
		      ioe.printStackTrace();
		    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readRoutesFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			  int IDPos = -1;
			  int shortNamePos = -1;
			  int longNamePos = -1;
			  int typePos = -1;
			
			  File file = new File(absolutePathToFile);
		      FileReader fr = new FileReader(file);
		      BufferedReader br = new BufferedReader(fr);
		      String line = " ";
		      String[] tempArr;
		      line = br.readLine();
	    	  line = fixSubstrings(line,csvCommaChar);
		      tempArr = line.split(csvCommaChar);
		      for(int i = 0; i < tempArr.length; i++)
		      {
		    	  if(tempArr[i].equals("route_id"))
		    	  {
		    		  IDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("route_type"))
		    	  {
		    		  typePos = i;
		    	  }
		    	  else if(tempArr[i].equals("route_short_name"))
		    	  {
		    		  shortNamePos = i;
		    	  } 
		    	  else if(tempArr[i].equals("route_long_name"))
		    	  {
		    		  longNamePos = i;
		    	  }
		      }
		      
		      while ((line = br.readLine()) != null) {
		    	line = fixSubstrings(line,csvCommaChar);
		        tempArr = line.split(csvCommaChar);
		        RouteRaw route = GTFSRawPackagesFactory.eINSTANCE.createRouteRaw();
		        route.setRouteID(tempArr[IDPos]);
		        route.setRouteType(Integer.valueOf(tempArr[typePos]));
		        route.setShortName(tempArr[shortNamePos]);
		        route.setLongName(tempArr[longNamePos]);
		        this.getRoutes().add(route);
		      }
		      br.close();
		    }
		    catch(IOException ioe) {
		      ioe.printStackTrace();
		    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readTripsFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			  int IDPos = -1;
			  int routeIDPos = -1;
			  int serviceIDPos = -1;
			
			  File file = new File(absolutePathToFile);
		      FileReader fr = new FileReader(file);
		      BufferedReader br = new BufferedReader(fr);
		      String line = " ";
		      String[] tempArr;
		      line = br.readLine();
	    	  line = fixSubstrings(line,csvCommaChar);
		      tempArr = line.split(csvCommaChar);
		      for(int i = 0; i < tempArr.length; i++)
		      {
		    	  if(tempArr[i].equals("route_id"))
		    	  {
		    		  routeIDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("trip_id"))
		    	  {
		    		  IDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("service_id"))
		    	  {
		    		  serviceIDPos = i;
		    	  } 
		      }
		      
		      while ((line = br.readLine()) != null) {
		    	line = fixSubstrings(line,csvCommaChar);
		        tempArr = line.split(csvCommaChar);
		        TripRaw trip = GTFSRawPackagesFactory.eINSTANCE.createTripRaw();
		        trip.setRouteID(tempArr[routeIDPos]);
		        trip.setTripID(tempArr[IDPos]);
		        trip.setServiceID(tempArr[serviceIDPos]);
		        this.getTrips().add(trip);
		      }
		      br.close();
		    }
		    catch(IOException ioe) {
		      ioe.printStackTrace();
		    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readStopTimesFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			  int IDPos = -1;
			  int tripIDPos = -1;
			  int arrivalTimePos = -1;
			  int depatureTimePos = -1;
			  int stopSequencePos = -1;

			
			  File file = new File(absolutePathToFile);
		      FileReader fr = new FileReader(file);
		      BufferedReader br = new BufferedReader(fr);
		      String line = " ";
		      String[] tempArr;
		      line = br.readLine();
	    	  line = fixSubstrings(line,csvCommaChar);
		      tempArr = line.split(csvCommaChar);
		      for(int i = 0; i < tempArr.length; i++)
		      {
		    	  if(tempArr[i].equals("stop_id"))
		    	  {
		    		  IDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("trip_id"))
		    	  {
		    		  tripIDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("arrival_time"))
		    	  {
		    		  arrivalTimePos = i;
		    	  }
		    	  else if(tempArr[i].equals("departure_time"))
		    	  {
		    		  depatureTimePos = i;
		    	  }
		    	  else if(tempArr[i].equals("stop_sequence"))
		    	  {
		    		  stopSequencePos = i;
		    	  } 
		      }
		      
		      while ((line = br.readLine()) != null) {
		    	line = fixSubstrings(line,csvCommaChar);

		        tempArr = line.split(csvCommaChar);
		        StopTimeRaw stopTime = GTFSRawPackagesFactory.eINSTANCE.createStopTimeRaw();
		        stopTime.setStopID(tempArr[IDPos]);
		        stopTime.setTripID(tempArr[tripIDPos]);
		        stopTime.setArrivalTime(tempArr[arrivalTimePos]);
		        stopTime.setDepatureTime(tempArr[depatureTimePos]);
		        stopTime.setStopSequence(Integer.valueOf(tempArr[stopSequencePos]));

		        this.getStopTimes().add(stopTime);
		        
		      }
		      br.close();
		    }
		    catch(IOException ioe) {
		      ioe.printStackTrace();
		    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readStopsFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			  int IDPos = -1;
			  int namePos = -1;
			  int lonPos = -1;
			  int latPos = -1;

			
			  File file = new File(absolutePathToFile);
		      FileReader fr = new FileReader(file);
		      BufferedReader br = new BufferedReader(fr);
		      String line = " ";
		      String[] tempArr;
		      line = br.readLine();
	    	  line = fixSubstrings(line,csvCommaChar);
		      tempArr = line.split(csvCommaChar);
		      for(int i = 0; i < tempArr.length; i++)
		      {
		    	  if(tempArr[i].equals("stop_id"))
		    	  {
		    		  IDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("stop_name"))
		    	  {
		    		  namePos = i;
		    	  }
		    	  else if(tempArr[i].equals("stop_lat"))
		    	  {
		    		  lonPos = i;
		    	  }
		    	  else if(tempArr[i].equals("stop_lon"))
		    	  {
		    		  latPos = i;
		    	  }
		      }
		      
		      while ((line = br.readLine()) != null) {
		    	line = fixSubstrings(line,csvCommaChar);
		    	  
		        tempArr = line.split(csvCommaChar);
		        StopRaw stopTime = GTFSRawPackagesFactory.eINSTANCE.createStopRaw();
		        stopTime.setStopID(tempArr[IDPos]);
		        stopTime.setName(tempArr[namePos]);
		        stopTime.setLongitude(Float.valueOf(tempArr[lonPos]));
		        stopTime.setLatitude(Float.valueOf(tempArr[latPos]));;
		        this.getStops().add(stopTime);
		      }
		      br.close();
		    }
		    catch(IOException ioe) {
		      ioe.printStackTrace();
		    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readCalendarFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			  String datePattern = "yyyyMMdd";
			  SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);

			  int IDPos = -1;
			  int startPos = -1;
			  int endPos = -1;
			  int mondayPos = -1;
			  int tuesdayPos = -1;
			  int wednesdayPos = -1;
			  int thursdayPos = -1;
			  int fridayPos = -1;
			  int saturdayPos = -1;
			  int sundayPos = -1;

			
			  File file = new File(absolutePathToFile);
		      FileReader fr = new FileReader(file);
		      BufferedReader br = new BufferedReader(fr);
		      String line = " ";
		      String[] tempArr;
		      line = br.readLine();
	    	  line = fixSubstrings(line,csvCommaChar);
		      tempArr = line.split(csvCommaChar);
		      for(int i = 0; i < tempArr.length; i++)
		      {
		    	  if(tempArr[i].equals("service_id"))
		    	  {
		    		  IDPos = i;
		    	  }
		    	  else if(tempArr[i].equals("start_date"))
		    	  {
		    		  startPos = i;
		    	  }
		    	  else if(tempArr[i].equals("end_date"))
		    	  {
		    		  endPos = i;
		    	  }
		    	  else if(tempArr[i].equals("monday"))
		    	  {
		    		  mondayPos = i;
		    	  }
		    	  else if(tempArr[i].equals("tuesday"))
		    	  {
		    		  tuesdayPos = i;
		    	  }
		    	  else if(tempArr[i].equals("wednesday"))
		    	  {
		    		  wednesdayPos = i;
		    	  }
		    	  else if(tempArr[i].equals("thursday"))
		    	  {
		    		  thursdayPos = i;
		    	  }
		    	  else if(tempArr[i].equals("friday"))
		    	  {
		    		  fridayPos = i;
		    	  }
		    	  else if(tempArr[i].equals("saturday"))
		    	  {
		    		  saturdayPos = i;
		    	  }
		    	  else if(tempArr[i].equals("sunday"))
		    	  {
		    		  sundayPos = i;
		    	  }
		      }
		      
		      while ((line = br.readLine()) != null) {
		    	line = fixSubstrings(line,csvCommaChar);
		    	  
		        tempArr = line.split(csvCommaChar);
		        CalenderRaw calender = GTFSRawPackagesFactory.eINSTANCE.createCalenderRaw();
		        calender.setServiceID(tempArr[IDPos]);
		        calender.setStartDate(simpleDateFormat.parse(tempArr[startPos]));
		        calender.setStopDate(simpleDateFormat.parse(tempArr[endPos]));

		        calender.setMonday(tempArr[mondayPos].equals("1"));
		        calender.setTuesday(tempArr[tuesdayPos].equals("1"));
		        calender.setWednesday(tempArr[wednesdayPos].equals("1"));
		        calender.setThursday(tempArr[thursdayPos].equals("1"));
		        calender.setFriday(tempArr[fridayPos].equals("1"));
		        calender.setSaturday(tempArr[saturdayPos].equals("1"));
		        calender.setSunday(tempArr[sundayPos].equals("1"));

		        this.getCalender().add(calender);
		      }
		      br.close();
		    }
		    catch(IOException ioe) {
		      ioe.printStackTrace();
		    } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readOptionalFile(String absolutePathToFile, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.print("readOptionalFile is not suported in this implementation!!!!!!!\n\n");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String fixSubstrings(String inputString, String csvCommaChar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		char replacement = ' ';
		if(csvCommaChar.equals(";"))
		{
			replacement = ',';
		}
		else
		{
			replacement = ';';
		}
	    StringBuilder myString = new StringBuilder(inputString);

	    Boolean inSubString = false;
	    for(int i = 0; i<myString.length(); i++)
	    {
	    	if(myString.charAt(i) == '"')
	    	{
	    		myString.setCharAt(i, ' ');
	    		inSubString = !inSubString;
	    	}
	    	if(inSubString && myString.charAt(i) == csvCommaChar.charAt(0))
	    	{
	    		myString.setCharAt(i, replacement);
	    	}
	    }
		return myString.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSRawPackagesPackage.COLLECTION_RAW__AGENCY:
				return getAgency();
			case GTFSRawPackagesPackage.COLLECTION_RAW__ROUTES:
				return getRoutes();
			case GTFSRawPackagesPackage.COLLECTION_RAW__TRIPS:
				return getTrips();
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOP_TIMES:
				return getStopTimes();
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOPS:
				return getStops();
			case GTFSRawPackagesPackage.COLLECTION_RAW__CALENDER:
				return getCalender();
			case GTFSRawPackagesPackage.COLLECTION_RAW__OPTIONAL_TABLE:
				return getOptionalTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GTFSRawPackagesPackage.COLLECTION_RAW__AGENCY:
				getAgency().clear();
				getAgency().addAll((Collection<? extends AgencyRaw>)newValue);
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends RouteRaw>)newValue);
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__TRIPS:
				getTrips().clear();
				getTrips().addAll((Collection<? extends TripRaw>)newValue);
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOP_TIMES:
				getStopTimes().clear();
				getStopTimes().addAll((Collection<? extends StopTimeRaw>)newValue);
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends StopRaw>)newValue);
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__CALENDER:
				getCalender().clear();
				getCalender().addAll((Collection<? extends CalenderRaw>)newValue);
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__OPTIONAL_TABLE:
				getOptionalTable().clear();
				getOptionalTable().addAll((Collection<? extends OptionalTableRaw>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GTFSRawPackagesPackage.COLLECTION_RAW__AGENCY:
				getAgency().clear();
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__ROUTES:
				getRoutes().clear();
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__TRIPS:
				getTrips().clear();
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOP_TIMES:
				getStopTimes().clear();
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOPS:
				getStops().clear();
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__CALENDER:
				getCalender().clear();
				return;
			case GTFSRawPackagesPackage.COLLECTION_RAW__OPTIONAL_TABLE:
				getOptionalTable().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GTFSRawPackagesPackage.COLLECTION_RAW__AGENCY:
				return agency != null && !agency.isEmpty();
			case GTFSRawPackagesPackage.COLLECTION_RAW__ROUTES:
				return routes != null && !routes.isEmpty();
			case GTFSRawPackagesPackage.COLLECTION_RAW__TRIPS:
				return trips != null && !trips.isEmpty();
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOP_TIMES:
				return stopTimes != null && !stopTimes.isEmpty();
			case GTFSRawPackagesPackage.COLLECTION_RAW__STOPS:
				return stops != null && !stops.isEmpty();
			case GTFSRawPackagesPackage.COLLECTION_RAW__CALENDER:
				return calender != null && !calender.isEmpty();
			case GTFSRawPackagesPackage.COLLECTION_RAW__OPTIONAL_TABLE:
				return optionalTable != null && !optionalTable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_GTFS_FILES__STRING_STRING:
				readGTFSFiles((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_AGENCY_FILE__STRING_STRING:
				readAgencyFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_ROUTES_FILE__STRING_STRING:
				readRoutesFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_TRIPS_FILE__STRING_STRING:
				readTripsFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_STOP_TIMES_FILE__STRING_STRING:
				readStopTimesFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_STOPS_FILE__STRING_STRING:
				readStopsFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_CALENDAR_FILE__STRING_STRING:
				readCalendarFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___READ_OPTIONAL_FILE__STRING_STRING:
				readOptionalFile((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GTFSRawPackagesPackage.COLLECTION_RAW___FIX_SUBSTRINGS__STRING_STRING:
				return fixSubstrings((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CollectionRawImpl
