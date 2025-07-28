package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/{id}")
    public ResponseEntity<?> test(@PathVariable String id) {
        return ResponseEntity.ok().body(id);
    }

}
