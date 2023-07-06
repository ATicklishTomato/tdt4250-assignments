import java.io.Console;
import java.io.File;

import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.GTFSRawPackagesFactory;

public class RawTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionRaw testcol = GTFSRawPackagesFactory.eINSTANCE.createCollectionRaw();
		System.out.println("HEY, i am starting!");
		File path = new File("/.");
		if(args.length == 1)
		{
			path = new File(args[0]);
		}
		
		System.out.println("abs path: "+ path.getAbsolutePath());
		testcol.readGTFSFiles(path.getAbsolutePath(), ",");

		return;
	}

}
