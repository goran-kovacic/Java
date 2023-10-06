package printApp.model;

import java.util.List;

public class Part extends Entity {
	
	private String partName;
	private String stlOriginal;
	private String stlSupported;
	private String slicedFile;
	private Project project;
	private List<PrintJob> printJobs;
	
	
	
	public Part(int id, String partName, String stlOriginal, String stlSupported, String slicedFile, Project project,
			List<PrintJob> printJobs) {
		super(id);
		this.partName = partName;
		this.stlOriginal = stlOriginal;
		this.stlSupported = stlSupported;
		this.slicedFile = slicedFile;
		this.project = project;
		this.printJobs = printJobs;
	}
	public Part() {
		super();
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getStlOriginal() {
		return stlOriginal;
	}
	public void setStlOriginal(String stlOriginal) {
		this.stlOriginal = stlOriginal;
	}
	public String getStlSupported() {
		return stlSupported;
	}
	public void setStlSupported(String stlSupported) {
		this.stlSupported = stlSupported;
	}
	public String getSlicedFile() {
		return slicedFile;
	}
	public void setSlicedFile(String slicedFile) {
		this.slicedFile = slicedFile;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public List<PrintJob> getPrintJobs() {
		return printJobs;
	}
	public void setPrintJobs(List<PrintJob> printJobs) {
		this.printJobs = printJobs;
	}
	
	@Override
	public String toString() {
		
		return partName;
	}

}
