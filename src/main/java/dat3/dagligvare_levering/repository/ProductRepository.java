package dat3.dagligvare_levering.repository;

import dat3.dagligvare_levering.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
