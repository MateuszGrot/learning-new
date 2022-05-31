package com.mg.task1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }



    @Override
    public String move() {
        return "Skacze";
    }
}
