package com.event.manager._UAcademic.Repositories;

import com.event.manager._UAcademic.Entities.CategoriaDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository  extends JpaRepository<CategoriaDomain,
        Integer> {
}
