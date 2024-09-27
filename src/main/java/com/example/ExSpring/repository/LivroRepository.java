package com.example.ExSpring.repository;

import com.example.ExSpring.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {}
