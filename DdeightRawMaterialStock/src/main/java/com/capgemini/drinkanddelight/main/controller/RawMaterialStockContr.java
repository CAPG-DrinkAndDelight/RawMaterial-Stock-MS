package com.capgemini.drinkanddelight.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.drinkanddelight.main.entity.RawMaterialStock;
import com.capgemini.drinkanddelight.main.entity.RawMaterialUpdateDto;
import com.capgemini.drinkanddelight.main.exception.RawStockNotFoundException;
import com.capgemini.drinkanddelight.main.service.RawMaterialStockInterface;

@RestController
@RequestMapping("/rawmaterial")
public class RawMaterialStockContr {
	@Autowired
	RawMaterialStockInterface  service;
	
	@GetMapping("/getalldetails")
	public List<RawMaterialStock> displayRawStock( ) throws RawStockNotFoundException
	{
		try {
		List<RawMaterialStock> list= service.displayRawStock();
		if(list==null)
		{
			throw new RawStockNotFoundException("no stock available please add");
		}
		return list;
		}catch(RawStockNotFoundException ex)
		
		{
			throw new RawStockNotFoundException("no stock available please add");
		}
		
	}
	@GetMapping( "/getrawdetail/{orderId}")
	public RawMaterialStock getRawMaterialDetail( @PathVariable String orderId) throws RawStockNotFoundException
	{
		RawMaterialStock stock= service.getRawMaterialDetail(orderId);
		 if(stock==null || "".equals(stock))
		 {
			 throw new RawStockNotFoundException("order id not present in the raw stock ");
		 }
		 return service.getRawMaterialDetail(orderId);
	}
	@PostMapping("/updateStock/{orderId}")
	public String  updateRawStock(@RequestBody RawMaterialUpdateDto dto) throws RawStockNotFoundException
	{
		return service.updateRawStock(dto.getOrderId(),dto.getManufactureDate(),dto.getExpiryDate());
		 
		
	}
	@PostMapping("setprocessdate/{orderId}")
	public String setProcessDate(@RequestBody RawMaterialStock stock ) throws RawStockNotFoundException
	{
		return service.setProcessDate(stock.getOrderId(), stock.getProcessDate());
		
	}

}
