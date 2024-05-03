package org.example.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.Modelo.Aluno;
import org.example.Modelo.Disciplina;
import org.example.Repository.DisciplinaRepository;
import org.example.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class DisciplinaService implements IService<Disciplina, Integer> {

    @Autowired
    private DisciplinaRepository disciplinaRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Disciplina create(Disciplina disciplina) {
        return this.disciplinaRepository.save(disciplina);
    }


    @Override
    public Disciplina get(Integer id) {

        Optional<Disciplina> disciplinaEncontrada = disciplinaRepository.findById(id);
        return disciplinaEncontrada.orElseGet(Disciplina::new);
    }


    @Override
    public List<Disciplina> get() {
        return this.disciplinaRepository.findAll();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Disciplina update(Integer id, Disciplina disciplina) {
        Disciplina disciplinaEncontrada = this.get(id);

        if (disciplinaEncontrada.getId() != null && disciplinaEncontrada.getId() != 0) {
            return this.disciplinaRepository.save(disciplina);
        } else {
            return new Disciplina();
        }
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        this.disciplinaRepository.deleteById(id);
    }


}
