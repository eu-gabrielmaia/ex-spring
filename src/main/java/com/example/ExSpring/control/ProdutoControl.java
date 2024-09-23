package com.example.ExSpring.control;

import com.example.ExSpring.model.Produto;
import com.example.ExSpring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiProduto")
public class ProdutoControl {

    @Autowired
    ProdutoRepository pRepository;


    @GetMapping("/todos")
    public List<Produto> buscarTodosProdutos(){
        return pRepository.findAll();
    }

}
