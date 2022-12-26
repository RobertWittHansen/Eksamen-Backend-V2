package dat3.dagligvare_levering.api;

import dat3.dagligvare_levering.dto.ProductOrderRequest;
import dat3.dagligvare_levering.entity.ProductOrder;
import dat3.dagligvare_levering.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/api/productOrders")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;

    public ProductOrderController(ProductOrderService productOrderService){
        this.productOrderService = productOrderService;
    }

    @GetMapping("")
    public List<ProductOrder> getAllProductOrders(){
        return productOrderService.getAllProductOrders();
    }

    @GetMapping(path = "/{id}")
    public ProductOrder getProductOrderById(@PathVariable int id ){
        return productOrderService.getProductOrderById(id);
    }

    @PostMapping("/")
    public ProductOrder createProductOrder(@RequestBody ProductOrderRequest productOrderRequest){
        return productOrderService.addProductOrder(productOrderRequest.getId(), productOrderRequest.getQuantity());
    }

    @PutMapping("/{id}")
    public ProductOrder editProductOrder (@RequestBody ProductOrderRequest body, @PathVariable int id){
        return productOrderService.editProductOrder(body, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductOrder(@PathVariable int id){
        productOrderService.deleteProductOrder(id);
    }













}
