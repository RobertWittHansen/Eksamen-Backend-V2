package dat3.dagligvare_levering.service;


import dat3.dagligvare_levering.dto.ProductOrderRequest;
import dat3.dagligvare_levering.entity.ProductOrder;
import dat3.dagligvare_levering.repository.ProductOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class ProductOrderService {

    ProductOrderRepository productOrderRepository;

    public ProductOrderService(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }

    public List<ProductOrder> getAllProductOrders() {
        List<ProductOrder> productOrders = productOrderRepository.findAll();
        return productOrders;
    }

    public ProductOrder getProductOrderById(int id) {
        return productOrderRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, " ProductOrder not Found"));
    }

    public ProductOrder addProductOrder(int id, double quantity) {
        ProductOrder productOrder = new ProductOrder(id , quantity);
        productOrderRepository.save(productOrder);
        return productOrder;
    }

    public ProductOrder editProductOrder(ProductOrderRequest productOrderRequest, int id) {
        ProductOrder productOrder = productOrderRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Contact not found"));
        productOrder.setId(productOrderRequest.getId());
        productOrder.setQuantity(productOrder.getQuantity());
        return productOrderRepository.save(productOrder);
    }

    public void deleteProductOrder(int id) {
      ProductOrder productOrder = productOrderRepository.findById(id)
              .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Contact with this id doesn't exist" ));
      productOrderRepository.delete(productOrder);
    }

}