package com.jewelryStore.marketplace.service;

import com.jewelryStore.marketplace.model.entity.Usuario;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    Usuario delete(Usuario usuario);
    Usuario findById(Long id);
}
