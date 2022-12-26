package dat3.dagligvare_levering.repository;

import dat3.dagligvare_levering.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
