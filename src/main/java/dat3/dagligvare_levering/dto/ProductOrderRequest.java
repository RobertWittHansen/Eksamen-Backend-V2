package dat3.dagligvare_levering.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//---------------Lombok.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//---------------Lombok.

//-- TODO ProductOrder = members.
public class ProductOrderRequest {
    //---------------Fields / attribute.
    int id;
    double quantity;
    //---------------Fields / attribute.



}





