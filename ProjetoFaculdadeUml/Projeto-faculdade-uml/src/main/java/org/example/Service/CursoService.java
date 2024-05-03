package org.example.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.Modelo.Aluno;
import org.example.Modelo.Curso;
import org.example.Repository.CursoRepository;
import org.example.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CursoService implements IService<Curso, Integer> {

    @Autowired
    private CursoRepository cursoRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Curso create(Curso curso) {
        return this.cursoRepository.save(curso);
    }


    @Override
    public Curso get(Integer id) {

        Optional<Curso> cursoEncontrado = cursoRepository.findById(id);
        return cursoEncontrado.orElseGet(Curso::new);
    }


    @Override
    public List<Curso> get() {
        return this.cursoRepository.findAll();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Curso update(Integer id, Curso curso) {
        Curso cursoEncontrado = this.get(id);

        if (cursoEncontrado.getId() != null && cursoEncontrado.getId() != 0) {
            return this.cursoRepository.save(curso);
        } else {
            return new Curso();
        }
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        this.cursoRepository.deleteById(id);
    }

}
