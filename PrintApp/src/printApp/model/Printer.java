package printApp.model;

import java.sql.Time;

public class Printer extends Entity{
	
	private String printerName;
	private String manufacturer;
	private Time printerTime;
	private int fepCount;
	
	
	
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Time getPrinterTime() {
		return printerTime;
	}
	public void setPrinterTime(Time printerTime) {
		this.printerTime = printerTime;
	}
	public int getFepCount() {
		return fepCount;
	}
	public void setFepCount(int fepCount) {
		this.fepCount = fepCount;
	}
	
	

}
