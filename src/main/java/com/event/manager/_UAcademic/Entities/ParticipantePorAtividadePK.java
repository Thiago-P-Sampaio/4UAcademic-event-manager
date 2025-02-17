package com.event.manager._UAcademic.Entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ParticipantePorAtividadePK {


    @ManyToOne
    @JoinColumn(name = "participante_id")
    private ParticipanteDomain participante;


    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private AtividadeDomain atividade;

    public ParticipanteDomain getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteDomain participante) {
        this.participante = participante;
    }

    public AtividadeDomain getAtividade() {
        return atividade;
    }

    public void setAtividade(AtividadeDomain atividade) {
        this.atividade = atividade;
    }
}
