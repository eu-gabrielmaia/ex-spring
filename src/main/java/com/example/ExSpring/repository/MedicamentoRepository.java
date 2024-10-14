package com.example.ExSpring.repository;

import com.example.ExSpring.model.Funcionario;
import com.example.ExSpring.model.Livro;
import com.example.ExSpring.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {
    public List<Medicamento> findByNome (String nome);
    public List<Medicamento> findByLaboratorio (String laboratorio);
    public List<Medicamento> findByPreco (double preco);
}
