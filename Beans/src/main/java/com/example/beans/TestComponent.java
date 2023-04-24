package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class TestComponent {
    @GetMapping("/bean")
    private String bean() {
        return "bean @Component";
    }

    @PostConstruct
    void beanComp() {
        System.out.println("Bean @Component");
    }
}
