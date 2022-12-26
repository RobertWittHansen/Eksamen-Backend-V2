package dat3.dagligvare_levering.service;


import dat3.dagligvare_levering.dto.ProductRequest;
import dat3.dagligvare_levering.entity.Product;
import dat3.dagligvare_levering.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product getProductsById(int id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Contact not found"));
    }

    public Product addProduct(String name, double price, double weight) {
        Product product = new Product(name, price, weight);
        productRepository.save(product);
        return product;
    }

    public Product editProduct(ProductRequest productRequest, int id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Contact not found"));
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setWeight(productRequest.getWeight());
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Contact with this id doesn't exist" ));
        productRepository.delete(product);
    }
}
