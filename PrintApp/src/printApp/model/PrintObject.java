package printApp.model;

public class PrintObject extends Entity {
	
	private String objectName;
	private String stlOriginal;
	private String stlSupported;
	private String slicedFile;
	
	
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
	
	

}
