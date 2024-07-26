package com.produtos.fake_api.business.service;

import com.produtos.fake_api.infraestructure.entities.ProductEntity;
import com.produtos.fake_api.infraestructure.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public ProductEntity saveProducts(ProductEntity product) {
        try {
            return  repository.save(product);
        } catch (Exception e) {
            throw  new RuntimeException("Erro ao salvar Produtos" + e);
        }
    }

    // busca dados diretamente da Entidade
    public List<ProductEntity> findAllProducts() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todos os produtos" + e);
        }
    }

    // n salvar mais de uma vez o mesmo produto.
    // verifica por nome.
    public Boolean existsByName(String name) {
        try {
            return repository.existsByName(name);
        } catch (Exception e) {
            throw  new RuntimeException(format("Erro ao buscar produto por nome", name) + e);
        }
    }

}
