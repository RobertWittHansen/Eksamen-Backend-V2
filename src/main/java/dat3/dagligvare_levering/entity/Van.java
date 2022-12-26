package dat3.dagligvare_levering.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//---------------Lombok.
//-- TODO if I have the time.
@Entity//-- Maven -- Et object som vi skal burger i DB-tabel. Fortæller Der skal laves en table af samme navn some object.
public class Van {
    //---------------Fields / attribute.
    @Id
    @Column(name = "brand_id", nullable = false)
    private String brand;
    @Column(length = 255)
    private String model;
    @Column(length = 255)
    private String capacity;
    //---------------Fields / attribute.


    //---------------Database dependencies.
    //---------------Database dependencies.

    //---------------Reservation class.
    //---------------Reservation class.

    //---------------Constructor.
    //---------------Constructor.
}
