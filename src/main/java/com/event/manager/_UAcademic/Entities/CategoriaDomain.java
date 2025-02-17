package com.event.manager._UAcademic.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "tb_categoria")
public class CategoriaDomain {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;


    @OneToMany(mappedBy = "categoria")
    private List<AtividadeDomain> atividades = new
            ArrayList<>();



    public CategoriaDomain(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }
    public CategoriaDomain() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
