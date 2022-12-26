package dat3.dagligvare_levering.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//---------------Lombok.

//-- TODO INFO: Delivery = Loan.
@Entity
public class Delivery {
    //---------------Fields / attribute.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id", nullable = false)
    private int id;
    @Column(length = 255, nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate deliveryDate;
    @Column(length = 255,nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate fromWareHouse;
    @Column(length = 255,nullable = false)
    private String destination;
    //---------------Fields / attribute.

    //---------------Database dependencies.
    @OneToMany(mappedBy = "delivery", fetch = FetchType.LAZY)
    List<ProductOrder> productOrders = new ArrayList<>();
    //---------------Database dependencies.

    //---------------Constructor.
    public Delivery (LocalDate deliveryDate, LocalDate fromWareHouse,String destination) {
        this.deliveryDate = deliveryDate;
        this.fromWareHouse = fromWareHouse;
        this.destination = destination;
    }
    //---------------Constructor.



//---------------Reservation class.
//---------------Reservation class.








}
