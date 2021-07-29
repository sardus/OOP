package com.javalesson.oop.animals;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count: " + Dog.getDogsCount());

        Dog dog = new Dog();
        dog.setBreed("Labrador");
        dog.setName("Bob");
        dog.setPaws(4);
        dog.setTail(1);
        dog.setSize("Average");
        dog.bite();

        Dog doberman = new Dog();
        doberman.setBreed("Doberman");
        doberman.setName("Jack");
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setSize("Big");
        doberman.bite();

        Dog pickiness = new Dog();
        pickiness.setBreed("Pickiness");
        pickiness.setName("Sonya");
        pickiness.setPaws(4);
        pickiness.setTail(1);
        pickiness.setSize("Small");
        pickiness.bite();



    }
}
