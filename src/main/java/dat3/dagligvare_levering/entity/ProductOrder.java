package dat3.dagligvare_levering.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//---------------Lombok.

@Entity//-- Maven -- Et object som vi skal burger i DB-tabel. Fortæller Der skal laves en table af samme navn some object.
public class ProductOrder {
    //-- TODO ProductOrder = members.
    //---------------Fields / attribute.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productOrder_id",length = 255,nullable = false)
    private int id;

    @Column(length = 255)
    private double quantity;
    //---------------Fields / attribute.

    //---------------Database dependencies.
    @ManyToOne
    Product product;
    @ManyToOne
    Delivery delivery;
    //---------------Database dependencies.

    //---------------Constructor.
    public ProductOrder(int id, double quantity) {
        this.id = id;
        this.quantity = quantity;
    }
    //---------------Constructor.

    //---------------Reservation class.
    //---------------Reservation class.
}
