package printApp.model;

import java.util.List;

public class PrintObject extends Entity {
	
	private String objectName;
	private String stlOriginal;
	private String stlSupported;
	private String slicedFile;
	private Project project;
	private List<PrintJob> printJobs;
	
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
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
	
	

}
