package com.hussein.security.secureEndpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class Demo {

    @GetMapping
    public ResponseEntity<String> theDemo () {
        return  ResponseEntity.ok("hello");
    }
}
