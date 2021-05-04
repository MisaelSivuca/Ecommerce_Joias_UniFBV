package com.jewelryStore.marketplace.repository;

import com.jewelryStore.marketplace.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
