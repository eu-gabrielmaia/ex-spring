package com.example.ExSpring.control;

import com.example.ExSpring.model.Cliente;
import com.example.ExSpring.model.Produto;
import com.example.ExSpring.repository.ClienteRepository;
import com.example.ExSpring.repository.ProdutoRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiCliente")
public class ClienteControl {

    @Autowired
    ClienteRepository cRepository;

    @PostMapping("/inserir")
    public void inserir (@RequestBody Cliente c){
        cRepository.save(c);
    }

    @DeleteMapping("/excluir")
    public void excluir(@RequestBody Cliente c){
        cRepository.delete(c);
    }

    @DeleteMapping("/excluirPorId/{idCliente}")
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
    }
}
