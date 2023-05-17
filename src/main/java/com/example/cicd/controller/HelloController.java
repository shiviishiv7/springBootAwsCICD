package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public Map<String,String> helloWorld(){
        Map<String,String> map = new HashMap<>();
        map.put("shiv","Hello Wolrd");
        return map;
    }

    @GetMapping("/world2")
    public Map<String,String> helloWorld2(){
        Map<String,String> map = new HashMap<>();
        map.put("shiv","Hello Wolrd2");
        return map;
    }

    @GetMapping("/home")
    public Map<String,String> home(){
        Map<String,String> map = new HashMap<>();
        map.put("shiv","Hello home");
        return map;
    }

}
