package com.event.manager._UAcademic.Entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_participante_atividade")
public class ParticipantePorAtividade {

    @EmbeddedId

    private  ParticipantePorAtividadePK id =  new ParticipantePorAtividadePK();

    public ParticipantePorAtividade(ParticipanteDomain participante, AtividadeDomain atividade) {
        id.setParticipante(participante);
        id.setAtividade(atividade);
    }

    public ParticipantePorAtividade() {

    }
    public ParticipanteDomain getParticipanteDomain() {
        return id.getParticipante();
    }
    public void setParticipanteDomain(ParticipanteDomain participante) {
        id.setParticipante(participante);
    }

    public AtividadeDomain getAtividade() {
        return id.getAtividade();
    }

    public void setAtividade(AtividadeDomain atividade) {
        id.setAtividade(atividade);
    }
}
