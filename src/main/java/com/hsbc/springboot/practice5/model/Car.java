package com.hsbc.springboot.practice5.model;

public class Car {
	private int cNumber;
	private String cModel;
	private int cPrice;
	private String cColour;

	public Car() {
	}

	public Car(int cNumber, String cModel, int cPrice, String cColour) {
		this.cNumber = cNumber;
		this.cModel = cModel;
		this.cPrice = cPrice;
		this.cColour = cColour;

	}

	public int getcNumber() {
		return cNumber;
	}

	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}

	public String getcModel() {
		return cModel;
	}

	public void setcModel(String cModel) {
		this.cModel = cModel;
	}

	public int getcPrice() {
		return cPrice;
	}

	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}

	public String getcColour() {
		return cColour;
	}

	public void setcColour(String cColour) {
		this.cColour = cColour;
	}

}
