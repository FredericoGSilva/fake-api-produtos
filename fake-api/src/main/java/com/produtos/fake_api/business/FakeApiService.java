package com.produtos.fake_api.business;

import com.produtos.fake_api.dto.ProductsDTO;
import com.produtos.fake_api.infraestructure.FakeApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FakeApiService {

    private final FakeApiClient client;

    public List<ProductsDTO> findProducts() {
        return client.findListProduct();
    }

}
