package com.event.manager._UAcademic.DTO;

import com.event.manager._UAcademic.Entities.ParticipanteDomain;

public class ParticipanteDTO {

    private int id;
    private String nome;
    private String email;

    public ParticipanteDTO(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public ParticipanteDTO(ParticipanteDomain participanteDTO) {
        this.id = participanteDTO.getId();
        this.nome = participanteDTO.getNome();
        this.email = participanteDTO.getEmail();
    }


    public ParticipanteDTO() {}

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
