package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

@Repository
public class Repos {
    private Map<Integer, String> repos = new HashMap<>();

    {
        for (int i = 0; i < 5; i++) {
            repos.put(i, "msg" + i);
        }
    }

    @PostConstruct
    void repo() {
        System.out.println("Bean @Repository");
    }
}