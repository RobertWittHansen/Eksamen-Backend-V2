package dat3.dagligvare_levering.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//---------------Lombok.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//---------------Lombok.

//-- TODO INFO: ProductRequest = BookRequest.
public class ProductRequest {
    //---------------Fields / attribute.
    String name;
    double price;
    double weight;
    //---------------Fields / attribute.
}



