package org.example.Repository;

import org.example.Modelo.Aluno;
import org.example.Modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Integer> {

}
