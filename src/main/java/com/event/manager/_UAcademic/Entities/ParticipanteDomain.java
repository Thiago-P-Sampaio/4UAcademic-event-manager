package com.event.manager._UAcademic.Entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "tb_participante")
public class ParticipanteDomain {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "id.participante")
    private Set<ParticipantePorAtividade> itens = new HashSet<>();
    public Set<ParticipantePorAtividade> getAtividades() {
        return itens;
    }
    public List<AtividadeDomain> getAtividadesDomain() {
        return itens.stream().map(x -> x.getAtividade()).toList();
    }



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
