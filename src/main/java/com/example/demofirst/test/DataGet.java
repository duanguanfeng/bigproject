package com.example.demofirst.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataGet {

    @GetMapping("/test/data")
    public void  getData(String abc){

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbb");
        System.out.println(abc);
    }


}
