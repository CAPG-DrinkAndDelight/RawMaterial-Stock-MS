package com.capgemini.drinkanddelight.main.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Raw_stock")
public class RawMaterialStock {
	@Id
	private String orderId;
	private String name;
	private String supplierId;
	private double quantityValue;
	private String quantityUnit;
	private double pricePerUnit;
	private String warehouseId;
	private LocalDate processDate;
	private LocalDate deliveryDate;
	private LocalDate manufactureDate;
	 private LocalDate expiryDate; 
	@Override
	public String toString() {
		return "RawMaterialStock [orderId=" + orderId + ", name=" + name + ", supplierId=" + supplierId
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", pricePerUnit="
				+ pricePerUnit + ", warehouseId=" + warehouseId + ", processDate=" + processDate + ", deliveryDate="
				+ deliveryDate + ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}
	public RawMaterialStock(String orderId, String name, String supplierId, double quantityValue, String quantityUnit,
			double pricePerUnit, String warehouseId, LocalDate processDate, LocalDate deliveryDate,
			LocalDate manufactureDate, LocalDate expiryDate) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.supplierId = supplierId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
		this.warehouseId = warehouseId;
		this.processDate = processDate;
		this.deliveryDate = deliveryDate;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}
	public RawMaterialStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public LocalDate getProcessDate() {
		return processDate;
	}
	public void setProcessDate(LocalDate processDate) {
		this.processDate = processDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
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
