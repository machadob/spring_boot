package com.example.demo;

import com.example.manual.HelloWorld;
import com.example.util.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class TestBean {

    @Autowired
    Person p;

    @Autowired
    Car c;

    @Autowired
    House h;

    @Autowired
    HelloWorld hello;

    @PostConstruct
    public void init() {
        System.out.println("Person : " + p);
        System.out.println("Car : " + c);
        System.out.println("House : " + h);
        System.out.println("HelloWorld : " + hello.getFirstName());
        System.out.println("HelloWorld List: " + hello.getMyList());
        System.out.println("HelloWorld Set: " + hello.getMySet());
        System.out.println("HelloWorld Map: " + hello.getMyMap());
        System.out.println("END");
    }
}
