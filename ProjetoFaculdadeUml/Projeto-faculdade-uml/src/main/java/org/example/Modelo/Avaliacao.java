package org.example.Modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Avaliacao implements Serializable {

    @Column(name = "avaliacao_id")
    private Integer avaliacaoId;

    @Column(name = "DISCIPLINA", length = 50)
    private String disciplina;

    @Column(name = "NOMEALUNO", length = 50)
    private String nome_aluno;

    @Column(name = "nota1")
    private Float nota1;

    @Column(name = "nota2")
    private Float nota2;

    @Column(name = "notafinal")
    private Float notafinal;

    @Column(name = "frequencia")
    private Integer frequencia;

}
