package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesDTO {
    private String titulo;
    private Integer classe_indicativa;
    private String diretor;
    private int episodios;
    private String sinopse;

}
