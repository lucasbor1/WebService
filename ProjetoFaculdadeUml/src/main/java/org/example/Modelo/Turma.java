package org.example.Modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TURMA")

public class Turma  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "ANO", length = 50, nullable = false)
    private int ano;

    @NotNull
    @Column(name = "SEMESTRE", length = 50, nullable = false)
    private int semestre;

    @NotNull
    @Column(name = "DIASEMANA", length = 50, nullable = false)
    private int diaSemana;

    @NotNull
    @NotBlank
    @Column(name = "HORARIOS", length = 50, nullable = false)
    private String horarios;

    @Column(name = "disciplina", length = 50)
    private String disciplina;

}
