package com.example.ExSpring.control;

import com.example.ExSpring.model.Aluno;
import com.example.ExSpring.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("apiAluno")
public class AlunoControl {
    /*@Autowired
    AlunoRepository aRepository;

    @PostMapping("/inserir")
    public void inserir (@RequestBody Aluno a){
        aRepository.save(a);
    }

    @DeleteMapping("/excluir")
    public void excluir(@RequestBody Aluno a){
        aRepository.delete(a);
    }

    @DeleteMapping("/excluirPorId/{idAluno}")
    public void excluirPorId(@PathVariable(value = "idCliente") int idCliente){
        cRepository.deleteById(idCliente);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Cliente c) {
        cRepository.save(c);
    }

    @GetMapping("/todos")
    public List<Cliente> buscarProdutos(){
        return cRepository.findAll();
    }

    @GetMapping("/cliente/{idCliente}")
    public Optional<Cliente> buscarPorId (@PathVariable(value="idCliente") int idCliente){
        return cRepository.findById(idCliente);
    }*/
}
