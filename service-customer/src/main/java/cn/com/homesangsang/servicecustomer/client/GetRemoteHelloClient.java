package cn.com.homesangsang.servicecustomer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-business", path = "/api/hello")
public interface GetRemoteHelloClient {
    @GetMapping
    ResponseEntity<String> getGreeting();

}
