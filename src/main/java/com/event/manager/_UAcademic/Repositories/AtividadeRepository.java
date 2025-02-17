package com.event.manager._UAcademic.Repositories;

import com.event.manager._UAcademic.Entities.AtividadeDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<AtividadeDomain,
        Integer> {
}
