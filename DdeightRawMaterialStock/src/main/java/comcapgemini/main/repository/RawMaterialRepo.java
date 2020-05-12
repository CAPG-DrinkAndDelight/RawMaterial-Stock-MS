package comcapgemini.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comcapgemini.main.entity.RawMaterialStock;
@Repository
public interface RawMaterialRepo extends JpaRepository<RawMaterialStock, String> {

}
