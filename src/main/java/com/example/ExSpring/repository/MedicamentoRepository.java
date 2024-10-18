package com.example.ExSpring.repository;

import com.example.ExSpring.model.Funcionario;
import com.example.ExSpring.model.Livro;
import com.example.ExSpring.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {
    public List<Medicamento> findByNome (String nome);
    public List<Medicamento> findByLaboratorio (String laboratorio);
    public List<Medicamento> findByPreco (double preco);

    @Query(value = "select m from Medicamento m where m.nome like %?1%")
    public List<Medicamento> findByParteNome (String parte);

    @Query(value = "select m from Medicamento m where m.preco > ?1")
    public List<Medicamento> findByPrecoMaior (double partePreco);

    @Query(value = "select m from Medicamento m where m.nome like %?1% and m.preco > ?2")
    public List<Medicamento> findByParteNomePrecoMaior (String parte, double preco);
}
