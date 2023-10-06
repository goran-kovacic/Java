package printApp.model;

public class PrintJob extends Entity {
	
	private float cost;
	private boolean result;
	private Printer printer;
	private Material material;
	private Part part;
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Part getPrintObject() {
		return part;
	}
	public void setPrintObject(Part part) {
		this.part = part;
	}
	
	

}
