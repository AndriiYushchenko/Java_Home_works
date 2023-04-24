package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("test")
public class TestController

{
    @GetMapping("/view")
    public String view (){
        return "index.html";


    }
    @PostConstruct
    void setUp(){

        System.out.println("Bean @Controller");
    }


}
