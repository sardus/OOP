package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count " + Dog.getDogsCount());

        Dog labrador = new Dog();
        labrador.setName("Alex");
        labrador.setBreed("Labrador");
        labrador.setSize(Size.AVERAGE);
        labrador.bite();

        Dog pickiness = new Dog();
        pickiness.setName("Alex");
        pickiness.setBreed("Labrador");
        pickiness.setSize(Size.SMALL);
        pickiness.bite();

        Dog doberman = new Dog();
        doberman.setName("Alex");
        doberman.setBreed("Labrador");
        doberman.setSize(Size.BIG);
        doberman.bite();

        Size s = Size.SMALL;

        Size [] values = Size.values();
        for(int i=0; i<values.length; i++){
        System.out.println(values[i]);
        }

    }

}
