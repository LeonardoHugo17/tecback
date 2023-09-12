package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name ="tb_Endereco")
public class Endereco {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    //coluna para que seja descrito o endereço (rua, numero, etc.)
    @Column(name = "ds_endereco", length = 500)
    private String endereco;
}

