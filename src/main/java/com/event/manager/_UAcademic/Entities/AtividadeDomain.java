package com.event.manager._UAcademic.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class AtividadeDomain {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private Double preco;

    public AtividadeDomain(int id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    @OneToOne(mappedBy = "atividade",
    cascade = CascadeType.ALL)
    private BlocoDomain bloco;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaDomain categoria;

    @OneToMany(mappedBy = "atividade")
    private List<BlocoDomain> blocos = new
            ArrayList<>();


    @OneToMany(mappedBy = "id.atividade")
    private Set<ParticipantePorAtividade> itens = new HashSet<>();
    public Set<ParticipantePorAtividade> getParticipantes() {
        return itens;
    }
    public List<ParticipanteDomain> getParticipanteDomain() {
        return itens.stream().map(x -> x.getParticipanteDomain()).toList();
    }
    public AtividadeDomain() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}


