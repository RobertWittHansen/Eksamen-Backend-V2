package dat3.dagligvare_levering.service;

import dat3.dagligvare_levering.dto.DeliveryRequest;
import dat3.dagligvare_levering.entity.Delivery;
import dat3.dagligvare_levering.repository.DeliveryRepository;
import dat3.dagligvare_levering.repository.ProductOrderRepository;
import dat3.dagligvare_levering.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;
    private final ProductRepository productRepository;

    private final ProductOrderRepository productOrderRepository;


    public DeliveryService(DeliveryRepository deliveryRepository, ProductRepository productRepository, ProductOrderRepository productOrderRepository){
        this.deliveryRepository = deliveryRepository;
        this.productRepository = productRepository;
        this.productOrderRepository = productOrderRepository;
    }

    public List<Delivery> getDeliverys() {
        return deliveryRepository.findAll();
    }

    public Delivery getDeliveryById(int id) {
        return deliveryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Contact not found"));
    }

    //TODO fix denne method.
    public Delivery addDelivery(LocalDate deliveryDate, LocalDate fromWareHouse, String destination) {
        Delivery delivery = new Delivery(deliveryDate, fromWareHouse, destination);
        deliveryRepository.save(delivery);
        return delivery;
    }
    public Delivery editDelivery(DeliveryRequest deliveryRequest, int id) {
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Contact with this id doesn't exist"));
        delivery.setDeliveryDate(deliveryRequest.getDeliveryDate());
        delivery.setFromWareHouse(delivery.getFromWareHouse());
        delivery.setDestination(delivery.getDestination());
        return deliveryRepository.save(delivery);

    }
    public void deleteDelivery(int id) {
        Delivery delivery = deliveryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Contact with this id doesn't exist"));
        deliveryRepository.delete(delivery);
    }
}
