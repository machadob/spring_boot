package com.example.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class House {
    @Value("${floors}")
    private long floors;
    @Value("${rooms}")
    private long rooms;
    @Value("${sqfeet}")
    private long sqfeet;

    public long getFloors() {
        return floors;
    }

    public void setFloors(long floors) {
        this.floors = floors;
    }

    public long getRooms() {
        return rooms;
    }

    public void setRooms(long rooms) {
        this.rooms = rooms;
    }

    public long getSqfeet() {
        return sqfeet;
    }

    public void setSqfeet(long sqfeet) {
        this.sqfeet = sqfeet;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", sqfeet=" + sqfeet +
                '}';
    }
}
