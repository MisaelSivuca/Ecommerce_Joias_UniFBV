package com.jewelryStore.marketplace.service;

import com.jewelryStore.marketplace.model.entity.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> findAll();
    Categoria findById(long id);
    Categoria save(Categoria categoria);
}
