package org.example.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.Modelo.Aluno;
import org.example.Modelo.Avaliacao;
import org.example.Modelo.Professor;
import org.example.Repository.ProfessorRepository;
import org.example.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProfessorService implements IService<Professor, Integer> {

    @Autowired
    private ProfessorRepository professorRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Professor create(Professor professor) {
        return this.professorRepository.save(professor);
    }


    @Override
    public Professor get(Integer id) {

        Optional<Professor> professorEncontrado = professorRepository.findById(id);
        return professorEncontrado.orElseGet(Professor::new);
    }


    @Override
    public List<Professor> get() {
        return this.professorRepository.findAll();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Professor update(Integer id, Professor professor) {
        Professor professorEncontrado = this.get(id);

        if (professorEncontrado.getId() != null && professorEncontrado.getId() != 0) {
            return this.professorRepository.save(professor);
        } else {
            return new Professor();
        }
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        this.professorRepository.deleteById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void lancarAvaliacao(Professor professor, Avaliacao avaliacao) {
        professor.setAvaliacao(avaliacao);
        professorRepository.save(professor);
    }

}



