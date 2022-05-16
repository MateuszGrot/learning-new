package com.mg.task1;

public class Dog extends Animal implements Movable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "Biegnie";
    }
}
