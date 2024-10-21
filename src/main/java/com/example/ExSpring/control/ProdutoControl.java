package com.example.ExSpring.control;

import com.example.ExSpring.model.Cliente;
import com.example.ExSpring.model.Medicamento;
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

    @GetMapping("produto/{codigo}")
    public Optional<Produto> buscarPorCodigo(@PathVariable(value = "codigo") int codigo){
        return pRepository.findById(codigo);
    }

    @GetMapping("/buscar/descricao/{descricao}")
    public List<Produto> buscarPorDescricao(@PathVariable(value = "descricao") String descricao){
        return pRepository.findByDescricao(descricao);
    }

    @GetMapping("/buscar/parteDescricao/{descricao}")
    public List<Produto> buscarPorParteDescricao(@PathVariable(value = "descricao") String descricao){
        return pRepository.findByParteDescricao(descricao);
    }

    @GetMapping("/buscar/marca/{marca}")
    public List<Produto> buscarPorMarca(@PathVariable(value = "marca") String marca){
        return pRepository.findByMarca(marca);
    }

    @GetMapping("/buscar/preco/{preco}")
    public List<Produto> buscarPorPreco(@PathVariable(value = "preco") double preco){
        return pRepository.findByPreco(preco);
    }

    @GetMapping("/buscar/precoMenor/{preco}")
    public List<Produto> buscarPorPrecoMenor(@PathVariable(value = "preco") double preco){
        return pRepository.findByPrecoMenor(preco);
    }
}
