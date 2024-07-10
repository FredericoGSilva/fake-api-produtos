package com.produtos.fake_api.infraestructure;

import org.springframework.cloud.openfeign.FeignClient;

// url só puxa se for diferente de nulo
@FeignClient(value = "fake-api", url = "${fake-api.url:#{null}}")
public interface FakeApiClient {
}
