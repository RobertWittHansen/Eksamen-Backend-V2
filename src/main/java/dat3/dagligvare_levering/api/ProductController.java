package dat3.dagligvare_levering.api;

import dat3.dagligvare_levering.dto.ProductRequest;
import dat3.dagligvare_levering.entity.Product;
import dat3.dagligvare_levering.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("") //--Get the List of Product. (READ) (User).
    public List<Product> getAllProduct(){
        return productService.getProducts();
    }

    @GetMapping(path = "/{id}") //--get a Product by by /1 (READ) (User).
    public Product getProductById(@PathVariable int id){
        return productService.getProductsById(id);
    }

    @PostMapping("/") //--CREATE a Product by id (CREATE) (User).
    public Product createProduct(@RequestBody ProductRequest productRequest){
        return productService.addProduct(productRequest.getName(), productRequest.getPrice(), productRequest.getWeight());
    }

    @PutMapping(path = "/{id}") //--EDIT a Product by id (EDIT) (User).
    public Product editProduct(@RequestBody ProductRequest body, @PathVariable int id ){
        return productService.editProduct(body, id);
    }


    @DeleteMapping("/{id}") //--DELETE a Product by id (EDIT) (User).
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }

}


