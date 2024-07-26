package com.produtos.fake_api.business.converter;

import com.produtos.fake_api.dto.ProductsDTO;
import com.produtos.fake_api.infraestructure.entities.ProductEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class ProductConverter {

    public ProductEntity dtoToEntity(ProductsDTO dto) {
        return ProductEntity.builder()
                .id(String.valueOf(UUID.randomUUID()))
                .name(dto.getName())
                .category(dto.getCategory())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .image(dto.getImage())
                .inclusionDate(LocalDateTime.now())
                .build();
    }

    public ProductsDTO entityToDto(ProductEntity entity) {
        return ProductsDTO.builder()
                .entityId(entity.getId())
                .name(entity.getName())
                .category(entity.getCategory())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .image(entity.getImage())
                .build();
    }

    // Conversão de lista entity para lista DTO.
    public List<ProductsDTO> toListDto(List<ProductEntity> entityList) {
        return entityList.stream().map(this::entityToDto).toList();
    }

}
