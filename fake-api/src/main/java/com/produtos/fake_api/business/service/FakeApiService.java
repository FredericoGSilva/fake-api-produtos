package com.produtos.fake_api.business.service;

import com.produtos.fake_api.business.converter.ProductConverter;
import com.produtos.fake_api.dto.ProductsDTO;
import com.produtos.fake_api.infraestructure.client.FakeApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class FakeApiService {

    private final FakeApiClient client;
    private final ProductConverter converter;
    private final ProductService service;

    // busca os dados da API externa.
    // busca os produtos e já salva os produtos convertidos.
    public List<ProductsDTO> findProducts() {

        try {
            List<ProductsDTO> dto = client.findListProduct();
            dto.forEach(product -> {
                        Boolean result = service.existsByName(product.getName());

                        if (result.equals(false)) {
                            service.saveProducts(converter.dtoToEntity(product));
                        }
                    }
            );
            return converter.toListDto(service.findAllProducts());
        } catch (Exception e) {
                throw new RuntimeException("Erro ao buscar e gravar produtos no banco de dados.");
        }

    }

}
