package cn.com.homesangsang.servicegateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/local")
public class LocalController {
    @GetMapping("/{id}")
    public ResponseEntity<String> local(@PathVariable String id) {
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
