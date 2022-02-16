package com.example.devopsproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/api")
    public ResponseEntity<String> sampleTestControler(){
        return ResponseEntity.ok().body("Working FIne!!!!!!!!!!!!!!");

    }

}
