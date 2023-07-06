package gtfsplugin.parts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import GTFS.GTFSFactory;
import GTFS.Route;
import GTFS.Stop;
import GTFSM2T.main.Generate;
import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.GTFSRawPackagesFactory;

public class GTFSView {	
	private Text outputText;
	private Label myLabelInView;
	
	private Text pathInput;
	
	private GTFS.Collection gtfs;
	private enum GTFSStateEnum {notloaded, loaded};
	private GTFSStateEnum gtfsState;
	
	private List previewList;
	private Combo previewSelector;
	
	public void createLoadGTFSGUI(Composite parent)
	{	
		Label intro = new Label(parent, SWT.None);
		intro.setText("Absolute Path of GTFS files (folder):");
		
		Composite textComp = new Composite(parent, SWT.BACKGROUND);
		FillLayout textlayout = new FillLayout();
		textlayout.type = SWT.VERTICAL;
		textComp.setLayout(textlayout);
		
	    pathInput = new Text(textComp, SWT.SINGLE);
		pathInput.setText("<path>");
		
		Label selector = new Label(parent, SWT.None);
		selector.setText("CSV seperator selector: (\",\" should be default):");
		
		Composite buttonGroup = new Composite(parent, SWT.NO_BACKGROUND);
		RowLayout buttonLayout = new RowLayout();
		buttonLayout.type = SWT.HORIZONTAL;
		buttonGroup.setLayout(buttonLayout);
		
		Combo splitSelector = new Combo(buttonGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		splitSelector.setLayoutData(new RowData(50, 30));
		splitSelector.add(";", 0);
		splitSelector.add(",", 1);

		
		splitSelector.select(1);
		
		Button button = new Button(buttonGroup, SWT.PUSH);
		button.setText("Import GTFS");
		button.setLayoutData(new RowData(300, 30));
		

		
		button.addListener(SWT.Selection, new Listener()
		{
		    @Override
		    public void handleEvent(Event event)
		    {
		    	ReadGTFSFiles(splitSelector.getItem(splitSelector.getSelectionIndex()));  
		    }
		});
	}
	
	private void ReadGTFSFiles(String seperator)
	{
		String text = pathInput.getText();
    	if(text.length()> 0)
    	{
    		File path;
    		path = new File(text);
			
			if(path == null || !path.isDirectory() || path.listFiles() == null || path.listFiles().length <= 3) {
				System.err.println("Submitted data set directory is empty or not valid!");
				outputText.setText("Submitted data set directory is empty or not valid!");
			}
			
			CollectionRaw testcol = GTFSRawPackagesFactory.eINSTANCE.createCollectionRaw();
			
			
			try {
				outputText.setText("reading...");
				outputText.update();

				testcol.readGTFSFiles(path.getAbsolutePath(), seperator);
				outputText.setText("reading... (raw finished)");
				outputText.update();

				
				gtfs.importRaw(testcol, true);
				if(gtfs.getRoutes().size()<=2)
				{
					outputText.setText("Less than 2 routes found! There might be an error with the GTFS files! (Wrong path?)");
				}
				else
				{
					gtfsState = GTFSStateEnum.loaded;
					outputText.setText("GTFS loaded!");
					updateList();
				}
			} catch (Exception e) {
				outputText.setText("Submitted data set directory is empty or not valid!");
			}
    	}
	}
	
	
	public void createGTFSActionGUI(Composite parent)
	{
		Composite buttonGroup = new Composite(parent, SWT.NO_BACKGROUND);
		FillLayout layout = new FillLayout();
		layout.type = SWT.HORIZONTAL;
		buttonGroup.setLayout(layout);
		
		Button buttonWEB = new Button(buttonGroup, SWT.PUSH);
		buttonWEB.setText("Create Webapp");
		
		buttonWEB.addListener(SWT.Selection, new Listener()
		{
		    @Override
		    public void handleEvent(Event event)
		    {
		    	if(gtfsState != GTFSStateEnum.loaded)
				{
		        	outputText.setText("Data not loaded!");
					return;
				}
		        
		        String text = pathInput.getText();
		    	if(text.length()> 0)
		    	{
		    		File path = new File(text);
		    		if(!path.isDirectory())
		    		{
		    			outputText.setText("Cant generate text file because path is a file and not a directory");
		    			return;
		    		}
		    		File file = new File(path.getAbsolutePath()+"/timetable.json");
		    		try {
		    			outputText.setText("generating...");
						outputText.update();
						gtfsJSONCreator.GTFSJsonGenerator.generateJSON(gtfs, file);
						outputText.setText("JSON File generated. It is in the folder of the GTFS. Move it to the webserver folder and start the webserver to access the data via HTML.");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						outputText.setText(e.getMessage());
					}
		    	}
		    	else
		    	{
		    		outputText.setText("Cant generate text file because path is empty");
		    		pathInput.setText("<path>");
		    	}
		    }
		});
		
		Button buttonTEXT = new Button(buttonGroup, SWT.PUSH);
		buttonTEXT.setText("Create Text");
		
		buttonTEXT.addListener(SWT.Selection, new Listener()
		{
		    @Override
		    public void handleEvent(Event event)
		    {
		        if(gtfsState != GTFSStateEnum.loaded)
				{
		        	outputText.setText("Data not loaded!");
					return;
				}
		        
		        String text = pathInput.getText();
		    	if(text.length()> 0)
		    	{
		    		File path = new File(text);
		    		String fileName = "output_Text.txt";
		    		if(!path.isDirectory())
		    		{
		    			outputText.setText("Cant generate text file because path is a file and not a directory");
		    			return;
		    		}
					ArrayList<Object> argList = new ArrayList<>();
					argList.add(fileName);
					try {
						outputText.setText("generating...");
						outputText.update();
						Generate gen = new Generate(gtfs, path, argList);
						gen.doGenerate(null);
						outputText.setText("Text file generated. It is in the folder of the GTFS.");
					} catch (IOException e) {
						System.out.println("M2T generation failed: " + e.getMessage());
					}
		    	}
		    	else
		    	{
		    		outputText.setText("Cant generate text file because path is empty");
		    		pathInput.setText("<path>");
		    	}
		    }
		});
	}
	
	public void updateList()
	{
		previewList.removeAll();
		
		if(gtfsState != GTFSStateEnum.loaded)
		{
			return;
		}
		
		if(previewSelector.getSelectionIndex() == 0)
		{
			//Route
			for(Route r: gtfs.getRoutes())
			{
				previewList.add(String.valueOf(r.getRouteID()) + ": " + r.getShortName());
			}
		}
		else
		{
			//Stop
			for(Stop r: gtfs.getStops())
			{
				previewList.add(String.valueOf(r.getStopID()) + ": " + r.getName());
			}
		}
		previewList.select(0);
		previewList.update();
	}
	
	public void createPreviewPart(Composite parent)
	{
		Label intro = new Label(parent, SWT.NONE);
		intro.setText("Preview (select stop or route):");
		
	    previewSelector = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		previewSelector.add("Route", 0);
		previewSelector.add("Stop", 1);
		
		previewSelector.select(0);
		
		previewSelector.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		        updateList();
		      }
		    });
		
		previewList = new List(parent, SWT.BORDER | SWT.V_SCROLL);
		previewList.setLayoutData(new RowData(500, 100));
         
        Button button = new Button(parent, SWT.PUSH);
 		button.setText("Info");
 		
 		button.addListener(SWT.Selection, new Listener()
 		{
 		    @Override
 		    public void handleEvent(Event event)
 		    {
 		    	if(gtfsState != GTFSStateEnum.loaded)
				{
		        	outputText.setText("Data not loaded!");
					return;
				}
 		    	if(previewSelector.getSelectionIndex() == 0)
 		    	{
 		    		//Route
 		    		Route route = gtfs.getRoutes().get(previewList.getSelectionIndices()[0]);
 		    		String text = String.valueOf(route.getRouteID()) + ": " + route.getShortName() + "\n"
 		    		              + route.getLongName() + "\n"
 		    				      + "Amount of trips: " + String.valueOf(route.getTripsC().size());
 		    		outputText.setText(text);
 		    	}
 		    	else
 		    	{
 		    		//Stop
 		    		Stop stop = gtfs.getStops().get(previewList.getSelectionIndices()[0]);
 		    		String text = String.valueOf(stop.getStopID()) + ": " + stop.getName() + "\n"
	    		              + "long: "+ String.valueOf(stop.getLongitude()) + "\n" 
	    		              + "lat: "+ String.valueOf(stop.getLatitude()) + "\n" 
	    				      + "Amount of stop times: " + String.valueOf(stop.getStopTimesC().size());
	    		outputText.setText(text);
 		    	}
 		    }
 		});
 		updateList();
	}

	@PostConstruct
	public void createPartControl(Composite parent) {
		System.out.println("GTFS control plugin");
		RowLayout layout = new RowLayout();
		layout.fill = true;
		layout.type = SWT.VERTICAL;
		parent.setLayout(layout);
	    myLabelInView = new Label(parent, SWT.NONE);
		myLabelInView.setText("GTFS control plugin");
		myLabelInView.setLayoutData(new RowData(500, 30));

		 
		
		createLoadGTFSGUI(parent);
		createGTFSActionGUI(parent);
		createPreviewPart(parent);
		outputText = new Text(parent, SWT.MULTI | SWT.WRAP);
		outputText.setLayoutData(new RowData(500, 100));
		
		
		//Init
		gtfsState = GTFSStateEnum.notloaded;
		gtfs = GTFSFactory.eINSTANCE.createCollection();
	}

	@Focus
	public void setFocus() {
		myLabelInView.setFocus();

	}

	/**
	 * This method is kept for E3 compatiblity. You can remove it if you do not
	 * mix E3 and E4 code. <br/>
	 * With E4 code you will set directly the selection in ESelectionService and
	 * you do not receive a ISelection
	 * 
	 * @param s
	 *            the selection received from JFace (E3 mode)
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection s) {
		if (s==null || s.isEmpty())
			return;

		if (s instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) s;
			if (iss.size() == 1)
				setSelection(iss.getFirstElement());
			else
				setSelection(iss.toArray());
		}
	}

	/**
	 * This method manages the selection of your current object. In this example
	 * we listen to a single Object (even the ISelection already captured in E3
	 * mode). <br/>
	 * You should change the parameter type of your received Object to manage
	 * your specific selection
	 * @param o
	 *            : the current object received
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		// Remove the 2 following lines in pure E4 mode, keep them in mixed mode
		if (o instanceof ISelection) // Already captured
			return;

		// Test if label exists (inject methods are called before PostConstruct)
		if (myLabelInView != null)
			myLabelInView.setText("Current single selection class is : " + o.getClass());
	}

	/**
	 * This method manages the multiple selection of your current objects. <br/>
	 * You should change the parameter type of your array of Objects to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current array of objects received in case of multiple selection
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selectedObjects) {

		// Test if label exists (inject methods are called before PostConstruct)
		if (myLabelInView != null)
			myLabelInView.setText("This is a multiple selection of " + selectedObjects.length + " objects");
	}
}
