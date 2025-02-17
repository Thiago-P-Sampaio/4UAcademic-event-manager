package com.event.manager._UAcademic.DTO;

public class AtividadeDTO {

    private int id;
    private String nome;
    private String descricao;
    private Double preco;

    public AtividadeDTO(int id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public AtividadeDTO() {
    }

    public AtividadeDTO(AtividadeDTO atividadeDTO) {
        this.id = atividadeDTO.getId();
        this.nome = atividadeDTO.getNome();
        this.descricao = atividadeDTO.getDescricao();
        this.preco = atividadeDTO.getPreco();
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
