package com.jewelryStore.marketplace.repository;

import com.jewelryStore.marketplace.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
