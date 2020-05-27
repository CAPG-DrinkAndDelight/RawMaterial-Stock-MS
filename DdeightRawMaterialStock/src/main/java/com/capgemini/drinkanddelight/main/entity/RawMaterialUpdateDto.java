package com.capgemini.drinkanddelight.main.entity;

import java.time.LocalDate;

public class RawMaterialUpdateDto {
	private String orderId;
	private LocalDate manufactureDate;
	 private LocalDate expiryDate;
	public RawMaterialUpdateDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RawMaterialUpdateDto(String orderId, LocalDate manufactureDate, LocalDate expiryDate) {
		super();
		this.orderId = orderId;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}  
}
