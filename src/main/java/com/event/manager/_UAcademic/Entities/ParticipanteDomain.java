package com.event.manager._UAcademic.Entities;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_participante")
public class ParticipanteDomain {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;


    public ParticipanteDomain(int id, String email, String nome) {
        this.id = id;
        this.email = email;
        this.nome = nome;
    }
    public ParticipanteDomain() {}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
