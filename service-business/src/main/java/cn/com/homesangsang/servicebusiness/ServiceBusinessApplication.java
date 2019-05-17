package cn.com.homesangsang.servicebusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBusinessApplication.class, args);
    }

}
