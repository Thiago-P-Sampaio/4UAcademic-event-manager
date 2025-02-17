package com.event.manager._UAcademic.DTO;

import com.event.manager._UAcademic.Entities.BlocoDomain;

import java.time.Instant;

public class BlocoDTO {

    private int id;
    private Instant inicio;
    private Instant fim;

    public BlocoDTO(int id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;

    }

    public BlocoDTO() {}

    public BlocoDTO(BlocoDomain Blocodomain) {
        this.id = Blocodomain.getId();
        this.inicio = Blocodomain.getInicio();
        this.fim = Blocodomain.getFim();
    }



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
