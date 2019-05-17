package cn.com.homesangsang.serviceauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class ServiceAuthserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthserverApplication.class, args);
    }

}
