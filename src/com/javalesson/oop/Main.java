package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Dog's count " + Dog.getDogsCount());

        Dog lab = new Dog();
        lab.setName("Alex");
        lab.setPaws(4);
        lab.setTail(1);
        lab.setBreed("Labrador");
        lab.setSize("Average");
        lab.bite();

        Dog pickiness = new Dog();
        pickiness.setName("Alex");
        pickiness.setPaws(4);
        pickiness.setTail(1);
        pickiness.setBreed("Labrador");
        pickiness.setSize("Average");
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
