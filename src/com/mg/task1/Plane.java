package com.mg.task1;

public class Plane extends Machine implements Movable {

    public Plane(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "Leci";
    }
}
