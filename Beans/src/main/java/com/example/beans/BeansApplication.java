package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication


public class BeansApplication {

    @Bean
    String string(){
        return new String("Wooow");
    }

    @Bean
    String string2(){
        return new String("Wooow!");
    }
    @PostConstruct
    void bean(){
        System.out.println("Bean @Bean");
    }

    public static void main(String[] args) {


        var context = SpringApplication.run(BeansApplication.class, args);
        var bean = context.getBean(TestController.class);
        System.out.println(bean);
        var bean2 = context.getBean("string");
        System.out.println(bean2);
        var bean3 = context.getBean(TestComponent.class);
        System.out.println(bean3);
        var bean4 = context.getBean(Repos.class);
        System.out.println(bean4);
        var bean5 = context.getBean(ServiceBean.class);
        System.out.println(bean5);


    }

}
