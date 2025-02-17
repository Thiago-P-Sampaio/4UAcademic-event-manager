package com.event.manager._UAcademic.DTO;

import com.event.manager._UAcademic.Entities.CategoriaDomain;

public class CategoriaDTO {

    private int id;
    private String descricao;

    public CategoriaDTO(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public CategoriaDTO(CategoriaDomain categoria) {
        this.id = categoria.getId();
        this.descricao = categoria.getDescricao();
    }

    public CategoriaDTO() {}

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
