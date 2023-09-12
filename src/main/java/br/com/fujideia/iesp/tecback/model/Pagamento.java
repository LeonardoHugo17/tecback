package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@Table (name = "tb_pagamento")
public class Pagamento implements Serializable {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;
    private String pix;
    private Date data_venc;
    private String gift_card;

    @OneToOne
    @JoinColumn(name = "cartao_id", referencedColumnName = "id")
    private Cartao cartao;

    @OneToOne
    @JoinColumn(name = "boleto_id", referencedColumnName = "id")
    private Boleto boleto;
}
