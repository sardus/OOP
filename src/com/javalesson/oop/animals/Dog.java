package com.javalesson.oop.animals;

public class Dog {

    private static int dogsCount;

    private String breed;
    private String name;
    private int paws;
    private int tail;
    private String size;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big")
                || size.equalsIgnoreCase("Average")
                || size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small!");
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("Wrong dog's paws count!");
            System.out.println("The dog has 4 paws!");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("Wrong dog's tail count!");
            System.out.println("The dog has 1 tail!");
        }
    }

    public int getTail() {
        return tail;
    }

    public void bark() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Wof-Wof");
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raf-Raf");
        } else {
            System.out.println("Tyaf-Tyaf");
        }

    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dog's are biting you!");
        } else {
            bark();
        }

    }
}
