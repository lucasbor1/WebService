package org.example.Modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @NotNull
    @Column(name = "MATRICULA", length = 50, nullable = false)
    private String matricula;

    @NotBlank
    @NotNull
    @Column(name = "SITUACAO", length = 50, nullable = false)
    private String situacao;

    @Column(name = "CURSO")
    private String curso;

}
