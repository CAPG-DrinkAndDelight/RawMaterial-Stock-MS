package comcapgemini.main.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comcapgemini.main.entity.RawMaterialStock;
import comcapgemini.main.repository.RawMaterialRepo;
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
	public boolean updateRawStock(String orderId, LocalDate manufactureDate, LocalDate expiryDate) {
		Optional<RawMaterialStock> update=repo.findById(orderId);
		if(update.isPresent())
		{
			RawMaterialStock stock=update.get();
			stock.setManufactureDate(manufactureDate);
			stock.setExpiryDate(expiryDate);
			return true;
		}
		return false;
	}

}
