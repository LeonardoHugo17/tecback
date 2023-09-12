package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table (name = "tb_boleto")
public class Boleto implements Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String cod_de_barra;

    private Date vencimento;

    private Usuario Nome;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "pagamento_id", referencedColumnName = "id")
    private Pagamento pagamento;
}


