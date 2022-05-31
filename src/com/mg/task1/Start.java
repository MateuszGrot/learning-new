package com.mg.task1;

import java.util.*;


public class Start {
    public static void main(String[] args) {



        ArrayList<Animal> list = new ArrayList<>();

        System.out.println("----------Psy----------");
        Animal dog1 = new Dog("Puszek");
        System.out.println(dog1.getName());
        list.add(dog1);

        Animal dog2 = new Dog("Mietek");
        System.out.println(dog2.getName());
        list.add(dog2);

        Animal dog3 = new Dog("Czesiek");
        System.out.println(dog3.getName());
        list.add(dog3);

        System.out.println("----------Koty----------");

        HashMap<Integer, Animal> map = new HashMap<>();

        Animal cat1 = new Cat("Czarny");
        System.out.println(cat1.getName());
        map.put(1, cat1);

        Animal cat2 = new Cat("Rudy");
        System.out.println(cat2.getName());
        map.put(2, cat2);

        Animal cat3 = new Cat("Niebieski");
        System.out.println(cat3.getName());
        map.put(3, cat3);

        System.out.println("----------Samoloty----------");

        HashSet<Machine> set = new HashSet<>();

        Machine plane1 = new Plane("Boeing");
        System.out.println(plane1.getName());
        set.add(plane1);

        Machine plane2 = new Plane("Concorde");
        System.out.println(plane2.getName());
        set.add(plane2);

        Machine plane3 = new Plane("Airbus");
        System.out.println(plane3.getName());
        set.add(plane3);

        System.out.println("----------- Wydruk z tablicy ArrayList: ----------");


        for (Animal animal : list) {
            System.out.println(animal.getName());
            System.out.println(animal.move());
            
        }



        System.out.println("----------- Wydruk z Hash Mapy: ----------");

        for (Animal animal : map.values()) {
            System.out.println(animal.getName());
            System.out.println(animal.move());
        }



        System.out.println("----------- Wydruk z Hash Setu: ----------");
        for (Machine machine : set) {
            System.out.println(machine.getName());
            System.out.println(machine.move());

        }
        // reverse order, LinkedHash - order from the beginning

        System.out.println("----------- Lista movable: ----------");

        LinkedList<Movable> elements = new LinkedList<Movable>();

        Animal dog5 = new Dog("Pietruszek");
        System.out.println(dog5.getName());
        elements.add(dog5);

        Animal cat5 = new Cat("Czerwony");
        System.out.println(cat5.getName());
        elements.add(dog5);

        Machine plane5 = new Plane("F-16");
        System.out.println(plane5.getName());
        elements.add(plane5);

        for (Movable e: elements) {
            System.out.println(e.move());

        }
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());

        elements.removeLast();



        for (Movable e: elements) {
            System.out.println(e.move());

        }

        elements.clear();

        System.out.println("Wyczyszczona tablica");

        for (Movable e: elements) {

            System.out.println(e.move());

        }
    }
}


