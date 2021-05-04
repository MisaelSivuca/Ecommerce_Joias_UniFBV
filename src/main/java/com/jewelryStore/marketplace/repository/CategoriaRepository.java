package com.jewelryStore.marketplace.repository;

import com.jewelryStore.marketplace.model.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
