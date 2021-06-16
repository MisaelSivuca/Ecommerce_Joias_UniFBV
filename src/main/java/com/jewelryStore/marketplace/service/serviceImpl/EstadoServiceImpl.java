package com.jewelryStore.marketplace.service.serviceImpl;


import com.jewelryStore.marketplace.model.entity.Estado;
import com.jewelryStore.marketplace.repository.EstadoRepository;
import com.jewelryStore.marketplace.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    EstadoRepository estadoRepository;


    @Override
    public Estado save(Estado estado) {
        return estadoRepository.save(estado);
    }
}
