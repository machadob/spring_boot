package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBean {
    @Autowired
    Person p;

    @Autowired
    Car c;

    @PostConstruct
    public void init() {
        System.out.println("Person : " + p);
        System.out.println("Car : " + c);
        System.out.println("END");
    }
}
