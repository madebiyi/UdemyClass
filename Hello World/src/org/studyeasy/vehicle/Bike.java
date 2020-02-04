package org.studyeasy.vehicle;

import org.study.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;
	
	public String getHandle() {
		return handle;
	}

	public Bike() {
		super();
		this.handle = "short";
	}

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats,fuelTank, lights);
		this.handle = handle;
	}
    
    public void run() {
		System.out.println("Running Bike");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Bike[ Handle=" + getHandle() + ", Engine=" + getEngine() + ", Wheels=" + getWheels()
				+ ", Seats=" + getSeats() + ", FuelTank=" + getFuelTank() + ", Lights=" + getLights()
				+ "]";
	}
    
    

}
