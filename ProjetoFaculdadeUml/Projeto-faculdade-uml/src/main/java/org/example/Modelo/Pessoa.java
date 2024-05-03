package org.example.Modelo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

// retirar @Entity e @Table para evitar conflito

@MappedSuperclass // indica uma super classe que fornece atributos comuns (Aluno e Professor)
public class Pessoa {

    public void interfaceFluente(){
        Pessoa pessoaBuilder = Pessoa.builder().nome("").endereco("").telefone("").build();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank // @NotBlank é usada para garantir que uma string não esteja vazia após a remoção de espaços em branco.
    @NotNull
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @NotBlank
    @NotNull
    @Column(name = "ENDERECO", length = 100, nullable = false)
    private String endereco;

    @NotBlank
    @NotNull
    @Column(name = "TELEFONE", length = 20, nullable = false)
    private String telefone;

}


