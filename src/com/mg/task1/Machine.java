package com.mg.task1;

abstract public class Machine implements Movable {

    protected String name;

    public Machine(String name) {
        this.name = name;
    }
    public  String getName() {       return name;    }

}