package com.example.ExSpring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Medicamento {
    @Id
    private int idMedicamento;

    @Column
    private String nome;

    @Column
    private String laboratorio;

    @Column
    private double preco;

    @Column
    private double dosagem;

    @Column
    private boolean receitaObrigatoria;


    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public boolean isReceitaObrigatoria() {
        return receitaObrigatoria;
    }

    public void setReceitaObrigatoria(boolean receitaObrigatoria) {
        this.receitaObrigatoria = receitaObrigatoria;
    }

}
