package org.example.Modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.lang.Integer.parseInt;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "DISCIPLINA")

public class Disciplina {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @NotNull
    @Column(name = "DESCRICAODSP", length = 100, nullable = false)
    private String descricaodsp;

    @NotNull
    @Column(name = "CARGAHORARIA", length = 50, nullable = false)
    private int cargaHoraria;

    @NotBlank
    @NotNull
    @Column(name = "EMENTA", length = 100, nullable = false)
    private String ementa;

    @NotBlank
    @NotNull
    @Column(name = "BIBLIOGRAFIA", length = 100, nullable = false)
    private String bibliografia;

}
