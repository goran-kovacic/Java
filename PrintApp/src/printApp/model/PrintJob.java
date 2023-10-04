package printApp.model;

public class PrintJob extends Entity {
	
	private float cost;
	private boolean result;
	
	
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
	
	

}
