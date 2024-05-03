package org.example.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.Modelo.Aluno;
import org.example.Modelo.Curso;
import org.example.Repository.AlunoRepository;
import org.example.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service

public class AlunoService implements IService<Aluno, Integer> {


    @Autowired
    private AlunoRepository alunoRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Aluno create(Aluno aluno) {
        return this.alunoRepository.save(aluno);
    }


    @Override
    public Aluno get(Integer id) {

        Optional<Aluno> alunoEncontrado = alunoRepository.findById(id);
        return alunoEncontrado.orElseGet(Aluno::new);
    }


    @Override
    public List<Aluno> get() {

        return alunoRepository.findAll();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Aluno update(Integer id, Aluno aluno) {

        Aluno alunoEncontrado = this.get(id);

        if(alunoEncontrado.getId() != null && alunoEncontrado.getId() != 0){
            return this.alunoRepository.save(aluno);
        }
        else{
            return new Aluno();
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        this.alunoRepository.deleteById(id);
    }

}
