package com.example.restcar;

public class Car {
	
	private String plateNumber;
	private boolean rented;

	public Car(String plateNumber, boolean rented) {
		super();
		this.plateNumber = plateNumber;
		this.rented = rented;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public boolean isRented() {
		return rented;
	}
	
	public void setRented(boolean rented) {
		this.rented = rented;
	}
	
}
