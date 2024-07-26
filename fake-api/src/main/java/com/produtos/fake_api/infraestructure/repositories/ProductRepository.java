package com.produtos.fake_api.infraestructure.repositories;

import com.produtos.fake_api.infraestructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String> {

    Boolean existsByName(String name);
}
