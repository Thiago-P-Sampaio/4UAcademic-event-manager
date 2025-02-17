package com.event.manager._UAcademic.Repositories;

import com.event.manager._UAcademic.Entities.ParticipanteDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository<ParticipanteDomain,
        Integer> {
}
