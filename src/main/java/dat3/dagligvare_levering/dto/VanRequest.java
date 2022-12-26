package dat3.dagligvare_levering.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;

//---------------Lombok.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//---------------Lombok.

//-- TODO if I have the time.
public class VanRequest {

    //---------------Fields / attribute.
    private String brand;
    private String model;
    private String capacity;
    //---------------Fields / attribute.
}
