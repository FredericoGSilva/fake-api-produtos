package com.produtos.fake_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsDTO {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "titulo")
    private String name;
    @JsonProperty(value = "preco")
    private BigDecimal price;
    @JsonProperty(value = "categoria")
    private String category;
    @JsonProperty(value = "descricao")
    private String description;
    @JsonProperty(value = "imagem")
    private String image;

}
