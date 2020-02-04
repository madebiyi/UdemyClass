package org.study.parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;
	

	public Vehicle() {
		engine ="Petrol";
		wheels = 4;
		seats = 4;
		fuelTank =35;
		lights ="LED";
	}
	
	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}
	
	public void run() {
		System.out.println("Running Vehicle");
	}
	
	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}

}
