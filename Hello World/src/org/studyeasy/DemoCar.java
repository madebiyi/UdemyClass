package org.studyeasy;

import org.studyeasy.vehicle.Bike;

public class DemoCar {

	public static void main(String[] args) {
		Bike bike = new Bike("Long","Deisel", 2, 2, 0, "LED" );
		//System.out.println(bike);
		bike.run();
		/*System.out.println(bike.getEngine());
		System.out.println(bike.getWheels());
		System.out.println(bike.getSeats());
		System.out.println(bike.getFuelTank());
		System.out.println(bike.getLights());*/
		
	}

}
