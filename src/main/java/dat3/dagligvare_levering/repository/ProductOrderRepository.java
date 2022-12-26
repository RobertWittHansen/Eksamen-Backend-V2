package dat3.dagligvare_levering.repository;


import dat3.dagligvare_levering.entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {
}
