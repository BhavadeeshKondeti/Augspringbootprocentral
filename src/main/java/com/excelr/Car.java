package com.excelr;

import org.springframework.stereotype.Component;

@Component
public class Car {

	
    private Integer carPrice;
	
	
    private String carName;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer carPrice, String carName) {
		super();
		this.carPrice = carPrice;
		this.carName = carName;
	}
	public Integer getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Integer carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carPrice=" + carPrice + ", carName=" + carName + "]";
	}
    
	
	

}
