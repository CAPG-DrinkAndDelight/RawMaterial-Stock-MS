package comcapgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comcapgemini.main.entity.RawMaterialStock;
import comcapgemini.main.entity.RawMaterialUpdateDto;
import comcapgemini.main.service.RawMaterialStockInterface;

@RestController
@RequestMapping("/rawmaterial")
public class RawMaterialStockContr {
	@Autowired
	RawMaterialStockInterface  service;
	
	@GetMapping("/getalldetails")
	public List<RawMaterialStock> displayRawStock( )
	{
		return service.displayRawStock();
		
	}
	@GetMapping( "/getrawdetail/{orderId}")
	public RawMaterialStock getRawMaterialDetail( @PathVariable String orderId)
	{
		return service.getRawMaterialDetail(orderId);
	}
	@PostMapping("/updateStock/{orderId}")
	public boolean updateRawStock(@RequestBody RawMaterialUpdateDto dto)
	{
		service.updateRawStock(dto.getOrderId(),dto.getManufactureDate(),dto.getExpiryDate());
		return true;
		
	}

}
