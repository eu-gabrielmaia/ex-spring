package com.example.ExSpring.control;

import com.example.ExSpring.model.Cliente;
import com.example.ExSpring.model.Produto;
import com.example.ExSpring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProduto")
public class ProdutoControl {

    @Autowired
    ProdutoRepository pRepository;

    @PostMapping("/inserir")
    public void inserir(@RequestBody Produto p){
        pRepository.save(p);
    }

    @DeleteMapping("/excluir")
    public void excluir(@RequestBody Produto p){
        pRepository.delete(p);
    }

    @DeleteMapping("/excluirPorId/{idProduto}")
    public void excluirPorId(@PathVariable(value = "idProduto") int idProduto){
        pRepository.deleteById(idProduto);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Produto p){
        pRepository.save(p);
    }

    @GetMapping("/todos")
    public List<Produto> buscarTodos(){
        return pRepository.findAll();
    }

    @GetMapping("produto/{idProduto}")
    public Optional<Produto> buscarPorId(@PathVariable(value = "idProduto") int idProduto){
        return pRepository.findById(idProduto);
    }
}
