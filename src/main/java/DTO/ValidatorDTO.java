package DTO;

import Validator.IdadeRange;
import lombok.Data;

@Data
public class ValidatorDTO {
    private String nome;
    @IdadeRange(min = 10 , max = 50)
    private Integer idade;


}
