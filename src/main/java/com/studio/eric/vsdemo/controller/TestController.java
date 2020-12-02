package com.studio.eric.vsdemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/get")
    public ResponseEntity<?> testGet(){
        List<String> list = new ArrayList<>(Arrays.asList("good", "morning", "world"));
        return ResponseEntity.ok(list);
    }
}