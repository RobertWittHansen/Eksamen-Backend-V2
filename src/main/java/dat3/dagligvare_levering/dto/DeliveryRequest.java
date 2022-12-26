package dat3.dagligvare_levering.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import java.time.LocalDate;

//-- TODO INFO: DeliveryRequest = LoanRequest.
//---------------Lombok.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//---------------Lombok.

public class DeliveryRequest {
    //---------------Fields / attribute.
    @Column(length = 255, nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate deliveryDate;
    @Column(length = 255,nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate fromWareHouse;
    @Column(length = 255,nullable = false)
    private String destination;
    //---------------Fields / attribute.

}

