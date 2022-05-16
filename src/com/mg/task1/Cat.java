package com.mg.task1;

public class Cat extends Animal implements Movable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "Skacze";
    }
}
