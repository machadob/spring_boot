package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("${make}")
    private String make;
    @Value("${model}")
    private String model;
    @Value("${motors}")
    private long motors;
    @Value("${range}")
    private String range;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getMotors() {
        return motors;
    }

    public void setMotors(long motors) {
        this.motors = motors;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", motors=" + motors +
                ", range='" + range + '\'' +
                '}';
    }
}
