package com.capgemini.drinkanddelight.main.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinkanddelight.main.entity.RawMaterialStock;
import com.capgemini.drinkanddelight.main.exception.RawStockNotFoundException;

public interface RawMaterialStockInterface {
public List<RawMaterialStock> displayRawStock();
public RawMaterialStock getRawMaterialDetail(String orderId);
public String updateRawStock(String orderId,LocalDate manufactureDate,LocalDate expiryDate) throws RawStockNotFoundException;
public String setProcessDate(String orderId,LocalDate processDate) throws RawStockNotFoundException;
}
