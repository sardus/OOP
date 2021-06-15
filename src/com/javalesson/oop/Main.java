package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count " + Dog.getDogsCount());

        Dog labrador = new Dog();
        labrador.setName("Alex");
        labrador.setPaws(4);
        labrador.setTail(1);
        labrador.setBreed("Labrador");
        labrador.setSize("Big");
        labrador.bite();

        Dog pickiness = new Dog();
        pickiness.setName("Alex");
        pickiness.setPaws(4);
        pickiness.setTail(1);
        pickiness.setBreed("Labrador");
        pickiness.setSize("Small");
        pickiness.bite();

        Dog doberman = new Dog();
        doberman.setName("Alex");
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setBreed("Labrador");
        doberman.setSize("Average");
        doberman.bite();
    }
}
