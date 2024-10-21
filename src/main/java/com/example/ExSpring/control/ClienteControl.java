package com.example.ExSpring.control;

import com.example.ExSpring.model.Cliente;
import com.example.ExSpring.model.Medicamento;
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

    @DeleteMapping("/excluirPorId/{codigo}")
    public void excluirPorId(@PathVariable(value = "codigo") int codigo){
        cRepository.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Cliente c) {
        cRepository.save(c);
    }

    @GetMapping("/todos")
    public List<Cliente> buscarClientes(){
        return cRepository.findAll();
    }

    @GetMapping("/cliente/{codigo}")
    public Optional<Cliente> buscarPorCodigo (@PathVariable(value="codigo") int codigo){
        return cRepository.findById(codigo);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Cliente> buscarPorNome(@PathVariable(value = "nome") String nome){
        return cRepository.findByNome(nome);
    }

    @GetMapping("/buscar/parteNome/{parte}")
    public List<Cliente> buscarPorParteNome(@PathVariable(value = "parte") String parte){
        return cRepository.findByParteNome(parte);
    }
}
