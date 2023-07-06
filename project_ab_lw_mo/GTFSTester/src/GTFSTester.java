import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import GTFS.Collection;
import GTFS.GTFSFactory;
import GTFSM2T.main.Generate;
import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.GTFSRawPackagesFactory;

public class GTFSTester {

	public static void main(String[] args) {
		CollectionRaw testcol = GTFSRawPackagesFactory.eINSTANCE.createCollectionRaw();
		System.out.println("HEY, i am starting!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the name of the data set directory to use (in the '/Data/GTFS' directory):");
		String dataSetDirectoryName = sc.nextLine();
		
		if(dataSetDirectoryName == null || dataSetDirectoryName == "") {
			System.err.println("Cannot submit empty data set directory name!");
			System.exit(1);
		}
		File path = new File("../Data/GTFS/" + dataSetDirectoryName);
		
		if(path.listFiles() == null || path.listFiles().length <= 0) {
			System.err.println("Submitted data set directory is empty!");
			System.exit(1);
		}
		
		if(args.length == 1)
		{
			path = new File(args[0]);
		}
		
		System.out.println("abs path: "+ path.getAbsolutePath());
		testcol.readGTFSFiles(path.getAbsolutePath(), ",");

		GTFS.Collection gtfs = GTFSFactory.eINSTANCE.createCollection();
		try {
			gtfs.importRaw(testcol, true);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		System.out.println("Do you want to generate a Model-to-Text conversion? (Y/N)");
		String answer = sc.nextLine();
		if(answer.toLowerCase().equals("y")) {
			System.out.println("Give file name, ending in .txt, in which the conversion should be stored (in output directory):");
			String fileName = sc.nextLine();
			assert fileName != null && fileName != "";
			List<Object> argList = new ArrayList<>();
			argList.add(fileName);
			File folder = new File("./output");
			try {
				Generate gen = new Generate(gtfs, folder, argList);
				gen.doGenerate(null);
			} catch (IOException e) {
				System.out.println("M2T generation failed: " + e.getMessage());
			}
		} else {
			System.out.println("Skipping M2T...");
		}
		
		System.out.println("Everything worked!!!");
	}

}
