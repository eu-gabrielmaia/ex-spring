package com.example.ExSpring.control;

import com.example.ExSpring.model.Cliente;
import com.example.ExSpring.model.Produto;
import com.example.ExSpring.repository.ClienteRepository;
import com.example.ExSpring.repository.ProdutoRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiCliente")
public class ClienteControl {

    @Autowired
    ClienteRepository cRepository;


    @GetMapping("/todos")
    public List<Cliente> buscarTodosProdutos(){
        return cRepository.findAll();
    }
}
