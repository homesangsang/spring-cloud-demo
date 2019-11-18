package cn.com.homesangsang.servicecustomer.controller;

import cn.com.homesangsang.servicecustomer.client.GetRemoteHelloClient;
import cn.com.homesangsang.servicecustomer.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/getHello")
public class GetHelloController {
    @Autowired
    private GetRemoteHelloClient getRemoteHelloClient;
    @GetMapping
    private ResponseEntity<String> getHello() {
        return getRemoteHelloClient.getGreeting();
    }

    @GetMapping("/whoami")
    private UserInfo whoami(Principal principal) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(principal.getName());
        return userInfo;
    }

}
