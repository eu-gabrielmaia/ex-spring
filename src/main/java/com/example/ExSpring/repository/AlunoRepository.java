package com.example.ExSpring.repository;

import com.example.ExSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Cliente, Integer> {
}
