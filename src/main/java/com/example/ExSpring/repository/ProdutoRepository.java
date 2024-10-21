package com.example.ExSpring.repository;

import com.example.ExSpring.model.Medicamento;
import com.example.ExSpring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    public List<Produto> findByDescricao (String descricao);

    public List<Produto> findByPreco (double preco);

    public List<Produto> findByMarca (String marca);

    @Query(value = "select p from Produto p where p.descricao like %?1%")
    public List<Produto> findByParteDescricao (String descricao);

    @Query(value = "select p from Produto p where p.preco < ?1")
    public List<Produto> findByPrecoMenor (double partePreco);

}
