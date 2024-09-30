package com.example.ExSpring.control;

import com.example.ExSpring.model.Funcionario;
import com.example.ExSpring.model.Livro;
import com.example.ExSpring.repository.FuncionarioRepository;
import com.example.ExSpring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiFuncionario")
public class FuncionarioControl {
    @Autowired
    FuncionarioRepository fRepository;

    @PostMapping("/inserir")
    public void inserir(@RequestBody Funcionario f){
        fRepository.save(f);
    }

    @DeleteMapping("/excluir")
    public void excluir(@RequestBody Funcionario f){
        fRepository.delete(f);
    }

    @DeleteMapping("/excluirPorId/{idFuncionario}")
    public void excluirPorId(@PathVariable(value = "idFuncionario") int idFuncionario){
        fRepository.deleteById(idFuncionario);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Funcionario f){
        fRepository.save(f);
    }

    @GetMapping("/todos")
    public List<Funcionario> buscarTodos(){
        return fRepository.findAll();
    }

    @GetMapping("produto/{idFuncionario}")
    public Optional<Funcionario> buscarPorId(@PathVariable(value = "idFuncionario") int idFuncionario){
        return fRepository.findById(idFuncionario);
    }
}
