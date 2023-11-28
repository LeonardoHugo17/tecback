package DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private Integer id;

    private String nome;

    private String numero;

    private Integer cpf;

    @NotNull
    private String login;

    @Email
    @NotEmpty
    private String email;

    private Integer enderecoId;

}
