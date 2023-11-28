package DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class FIlmeListaDTO {
    private String nome;
    private String nomeGenero;

}
