package comcapgemini.main.service;

import java.time.LocalDate;
import java.util.List;

import comcapgemini.main.entity.RawMaterialStock;

public interface RawMaterialStockInterface {
public List<RawMaterialStock> displayRawStock();
public RawMaterialStock getRawMaterialDetail(String orderId);
public boolean updateRawStock(String orderId,LocalDate manufactureDate,LocalDate expiryDate);
}
