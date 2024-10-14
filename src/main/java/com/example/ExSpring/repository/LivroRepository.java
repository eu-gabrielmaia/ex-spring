package com.example.ExSpring.repository;

import com.example.ExSpring.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    public List<Livro> findByNome (String nome);
    public List<Livro> findByAutor (String autor);
    public List<Livro> findByAnoFabricacao (int anoFabricacao);
}
