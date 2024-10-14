package com.example.ExSpring.control;

import com.example.ExSpring.model.Livro;
import com.example.ExSpring.model.Produto;
import com.example.ExSpring.repository.LivroRepository;
import com.example.ExSpring.repository.ProdutoRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiLivro")
public class LivroControl {

    @Autowired
    LivroRepository lRepository;

    @PostMapping("/inserir")
    public void inserir(@RequestBody Livro l){
        lRepository.save(l);
    }

    @DeleteMapping("/excluir")
    public void excluir(@RequestBody Livro l){
        lRepository.delete(l);
    }

    @DeleteMapping("/excluirPorId/{idLivro}")
    public void excluirPorId(@PathVariable(value = "idLivro") int idLivro){
        lRepository.deleteById(idLivro);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Livro l){
        lRepository.save(l);
    }

    @GetMapping("/todos")
    public List<Livro> buscarTodos(){
        return lRepository.findAll();
    }

    @GetMapping("/livro/{idLivro}")
    public Optional<Livro> buscarPorId(@PathVariable(value = "idLivro") int idLivro){
        return lRepository.findById(idLivro);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Livro> buscarPorNome(@PathVariable(value = "nome") String nome){
        return lRepository.findByNome(nome);
    }

    @GetMapping("/buscar/autor/{autor}")
    public List<Livro> buscarPorAutor(@PathVariable(value = "autor") String autor){
        return lRepository.findByAutor(autor);
    }

    @GetMapping("/buscar/anoFabricacao/{anoFabricacao}")
    public List<Livro> buscarPorAno(@PathVariable(value = "anoFabricacao") int anoFabricacao){
        return lRepository.findByAnoFabricacao(anoFabricacao);
    }
}
