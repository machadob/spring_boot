package com.example.demo;

import com.example.util.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBean {
    @Autowired
    Person p;

    @Autowired
    Car c;

    @Autowired
    House h;

    @PostConstruct
    public void init() {
        System.out.println("Person : " + p);
        System.out.println("Car : " + c);
        System.out.println("House : " + h);
        System.out.println("END");
    }
}
