package Main;

import java.time.LocalDate;

public class Vehicle {
	private String chasisNo;
	private Color vehicleColor;
	private double price;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	
	
	public Vehicle(String chasisNo, Color vehicleColor, double price, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", price=" + (price+vehicleColor.getAdditionalCost())
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if(o instanceof Vehicle) {
			Vehicle v=(Vehicle)o;
			return this.chasisNo.equals(v.chasisNo);
		}
		return false;
	}
	
	
}
