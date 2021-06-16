package com.jewelryStore.marketplace.service.serviceImpl;

import com.jewelryStore.marketplace.model.entity.Usuario;
import com.jewelryStore.marketplace.repository.UsuarioRepository;
import com.jewelryStore.marketplace.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario delete(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).get();
    }

}
