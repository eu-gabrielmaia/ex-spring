package com.example.ExSpring.repository;

import com.example.ExSpring.model.Cliente;
import com.example.ExSpring.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    public List<Cliente> findByNome (String nome);
    @Query(value = "select c from Cliente c where c.nome like %?1%")
    public List<Cliente> findByParteNome (String parte);
}

