package com.capgemini.drinkanddelight.main.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.drinkanddelight.main.entity.RawMaterialStock;
import com.capgemini.drinkanddelight.main.exception.RawStockNotFoundException;
import com.capgemini.drinkanddelight.main.repository.RawMaterialRepo;

@Service
@Transactional
public class RawMaterialImpl implements RawMaterialStockInterface {
@Autowired
RawMaterialRepo repo;
	@Override
	public List<RawMaterialStock> displayRawStock() {
	List<RawMaterialStock> stock=repo.findAll();
		return stock;
	}
	@Override
	public RawMaterialStock getRawMaterialDetail(String orderId) {
		Optional<RawMaterialStock> detail=repo.findById(orderId);
		if(detail.isPresent())
		{
			return detail.get();
		}
		return null;
	}
	@Override
	public String updateRawStock(String orderId, LocalDate manufactureDate, LocalDate expiryDate) throws RawStockNotFoundException {
		try {
		Optional<RawMaterialStock> update=repo.findById(orderId);
		if(update.isPresent())
		{
			RawMaterialStock stock=update.get();
			if(stock !=null && manufactureDate.compareTo(LocalDate.now())<0 && expiryDate.compareTo(LocalDate.now())>0  )
			{
			stock.setManufactureDate(manufactureDate);
			stock.setExpiryDate(expiryDate);
			return "Raw Stock Updated successfully";
			}
						
				return "Enter valid Date";
		
	}
		throw new RawStockNotFoundException("Enter valid order id,stock not updated");
		}
		catch(RawStockNotFoundException e)
		{
			throw new RawStockNotFoundException("Enter valid order id,stock not updated");
		}

}
	@Override
	public String setProcessDate(String orderId, LocalDate processDate) throws RawStockNotFoundException {
		try {
		Optional<RawMaterialStock> optional= repo.findById(orderId);
		 if(optional.isPresent())
		 {
			 RawMaterialStock order = optional.get();
			 	if(order !=null && processDate.compareTo(LocalDate.now())<0)
			 	{
			 	order.setProcessDate(processDate);
			 	return "Process date set";
			 	}
			 	else
			 	{
			 		return "process date not set";
			 	}
		 }

		 throw new RawStockNotFoundException("Enter valid Order ID");
		}catch(RawStockNotFoundException e)
		{
			 throw new RawStockNotFoundException("Enter valid Order ID");
		}
	}}
