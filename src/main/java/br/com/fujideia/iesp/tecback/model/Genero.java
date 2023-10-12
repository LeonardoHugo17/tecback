package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Genero implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String titulo;
}

