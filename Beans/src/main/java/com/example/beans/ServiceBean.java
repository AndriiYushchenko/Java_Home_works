package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service()

public class ServiceBean {
    private int Service;

    @PostConstruct
    void serv(){
        System.out.println("Bean @Service");
    }
}
