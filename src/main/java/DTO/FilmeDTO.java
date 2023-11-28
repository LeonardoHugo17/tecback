package DTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilmeDTO {
    private String titulo;
    @NotEmpty
    private String sinopse;
    private String diretor;
    private int ano;
    private String genero;


}
