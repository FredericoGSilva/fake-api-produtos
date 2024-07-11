package com.produtos.fake_api.infraestructure;

import com.produtos.fake_api.dto.ProductsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// A URL só é buscada se for diferente de nula.
@FeignClient(value = "fake-api", url = "${fake-api.url:#{null}}")
public interface FakeApiClient {

    @GetMapping("/products")
    List<ProductsDTO> findListProduct();



}
