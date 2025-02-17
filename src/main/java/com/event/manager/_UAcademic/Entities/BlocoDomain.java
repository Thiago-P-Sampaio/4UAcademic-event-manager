package com.event.manager._UAcademic.Entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table (name = "tb_bloco")
public class BlocoDomain {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private Instant inicio;
    private Instant fim;


//    @OneToOne
//    @MapsId
//    private AtividadeDomain atividade;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private AtividadeDomain atividade;




    public BlocoDomain(int id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public BlocoDomain() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }
}
