package com.mg.task1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Start {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();


        System.out.println("----------Psy----------");
        Dog dog1 = new Dog("Puszek");
        System.out.println(dog1.name);
        list.add(dog1);

        Dog dog2 = new Dog("Mietek");
        System.out.println(dog2.name);
        list.add(dog2);

        Dog dog3 = new Dog("Czesiek");
        System.out.println(dog3.name);
        list.add(dog3);

        System.out.println("----------Koty----------");

        HashMap<Integer, Object> map = new HashMap<>();

        Cat cat1 = new Cat("Czarny");
        System.out.println(cat1.name);
        map.put(1, cat1);

        Cat cat2 = new Cat("Rudy");
        System.out.println(cat2.name);
        map.put(2, cat2);

        Cat cat3 = new Cat("Niebieski");
        System.out.println(cat3.name);
        map.put(3, cat3);

        System.out.println("----------Samoloty----------");

        HashSet<Object> set = new HashSet<>();

        Plane plane1 = new Plane("Boeing");
        System.out.println(plane1.name);
        set.add(plane1);

        Plane plane2 = new Plane("Concorde");
        System.out.println(plane2.name);
        set.add(plane2);

        Plane plane3 = new Plane("Airbus");
        System.out.println(plane3.name);
        set.add(plane3);

        System.out.println("----------- Wydruk z tablicy ArrayList: ----------");

        for (Object l : list) {
            System.out.println(((Dog) l).name);
            System.out.println(((Dog) l).move());


        }

        System.out.println("----------- Wydruk z Hash Mapy: ----------");

        for (Object m : map.values()) {
            System.out.println(((Cat) m).name);
            System.out.println(((Cat) m).move());
        }

        System.out.println("----------- Wydruk z Hash Setu: ----------");
        for (Object s : set) {
            System.out.println(((Plane) s).name);
            System.out.println(((Plane) s).move());

        }
        // reverse order, LinkedHash - order from the beginning
    }
}


