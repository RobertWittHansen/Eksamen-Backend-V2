package dat3.dagligvare_levering.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//---------------Lombok.

//-- TODO INFO: Product = Books.

@Entity //-- Maven -- Et object som vi skal burger i DB-tabel. Fortæller Der skal laves en table af samme navn some object.
public class Product {
    //---------------Fields / attribute.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_id", nullable = false)
    private int id;
    @Column(name = "name_id", length = 255, nullable = false)
    private String name;
    @Column(length = 255)
    private double price;
    @Column(length = 255)
    private double weight;
    //---------------Fields / attribute.

    //---------------Database dependencies.
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    List<ProductOrder> productOrders = new ArrayList<>();
    //---------------Database dependencies.

    //---------------Constructor.
    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    //---------------Constructor.

    //---------------Reservation class.
    //---------------Reservation class.
}
