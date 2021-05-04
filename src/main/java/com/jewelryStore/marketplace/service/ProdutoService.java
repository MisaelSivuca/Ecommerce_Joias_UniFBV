package com.jewelryStore.marketplace.service;

import com.jewelryStore.marketplace.model.entity.Produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> findAll();
    Produto findById(Long id);
    Produto save(Produto produto);
}
