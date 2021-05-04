package com.jewelryStore.marketplace.service.serviceImpl;

import com.jewelryStore.marketplace.model.entity.Categoria;
import com.jewelryStore.marketplace.repository.CategoriaRepository;
import com.jewelryStore.marketplace.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(long id) {
        return categoriaRepository.findById(id).get();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
