package com.event.manager._UAcademic.Repositories;

import com.event.manager._UAcademic.Entities.BlocoDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocoRepository extends JpaRepository<BlocoDomain,
        Integer> {
}
