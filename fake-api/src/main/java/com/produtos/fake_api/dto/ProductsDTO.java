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
    @JsonProperty(value = "title")
    private String name;
    @JsonProperty(value = "price")
    private BigDecimal price;
    @JsonProperty(value = "cetegory")
    private String category;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "image")
    private String image;

}
