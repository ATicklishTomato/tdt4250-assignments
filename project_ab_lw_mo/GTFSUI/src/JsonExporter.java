import java.io.File;
import java.io.IOException;


import GTFS.GTFSFactory;
import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.GTFSRawPackagesFactory;

public class JsonExporter {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CollectionRaw testcol = GTFSRawPackagesFactory.eINSTANCE.createCollectionRaw();
		System.out.println("HEY, i am starting!");
		File path = new File("./");
		if(args.length == 1)
		{
			path = new File(args[0]);
		}
		else
		{
			System.out.println("arguments not correctly (1 argument: path to GTFS missing)!");
			throw new IOException();
		}
		System.out.println(path);
		
		System.out.println("abs path: "+ path.getAbsolutePath());
		testcol.readGTFSFiles(path.getAbsolutePath(), ",");

		GTFS.Collection gtfs = GTFSFactory.eINSTANCE.createCollection();
		try {
			gtfs.importRaw(testcol, true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gtfsJSONCreator.GTFSJsonGenerator.generateJSON(gtfs, new File("webpage/timetable.json"));
	}

}
