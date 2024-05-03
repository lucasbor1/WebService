package org.example.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.Modelo.Aluno;
import org.example.Modelo.Curso;
import org.example.Modelo.Turma;
import org.example.Repository.CursoRepository;
import org.example.Repository.TurmaRepository;
import org.example.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TurmaService implements IService<Turma, Integer> {

    @Autowired
    private TurmaRepository turmaRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Turma create(Turma turma) {
        return this.turmaRepository.save(turma);
    }


    @Override
    public Turma get(Integer id) {

        Optional<Turma> turmaEncontrada = turmaRepository.findById(id);
        return turmaEncontrada.orElseGet(Turma::new);
    }


    @Override
    public List<Turma> get() {
        return this.turmaRepository.findAll();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Turma update(Integer id, Turma turma) {
        Turma turmaEncontrada = this.get(id);

        if(turmaEncontrada.getId() != null && turmaEncontrada.getId() != 0){
            return this.turmaRepository.save(turma);
        }
        else{
            return new Turma();
        }
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        this.turmaRepository.deleteById(id);
    }


}
