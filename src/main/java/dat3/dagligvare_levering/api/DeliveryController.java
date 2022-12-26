package dat3.dagligvare_levering.api;


import dat3.dagligvare_levering.dto.DeliveryRequest;
import dat3.dagligvare_levering.entity.Delivery;
import dat3.dagligvare_levering.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/api/deliverys")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryservice;
    public DeliveryController(DeliveryService deliveryservice){
        this.deliveryservice = deliveryservice;
    }

    @GetMapping("")
    private List<Delivery> getAllDeliverys(){
        return deliveryservice.getDeliverys();
    }

    @GetMapping(path = "/{id}")
    public Delivery getDelivery(@PathVariable int id){
        return deliveryservice.getDeliveryById(id);
    }

    @PostMapping("/")
    public Delivery createDelivery(@RequestBody DeliveryRequest deliveryRequest) {
        return deliveryservice.addDelivery(deliveryRequest.getDeliveryDate(), deliveryRequest.getFromWareHouse(), deliveryRequest.getDestination());
    }

    @PutMapping("/{id}")
    public Delivery editDelivery(@RequestBody DeliveryRequest body, @PathVariable int id){
        return deliveryservice.editDelivery(body, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDelivery(@PathVariable int id){
        deliveryservice.deleteDelivery(id);
    }
}


