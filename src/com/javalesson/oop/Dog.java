package com.javalesson.oop;


public class Dog {
    private static int dogsCount;

    private int paws;
    private int tail;
    private String name;
    private String breed;

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") || size.equalsIgnoreCase("Small")
                || size.equalsIgnoreCase("Average"))
            this.size = size;
        else {
            System.out.println("Size mast be: Big, Average, Small");
        }
    }

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is: " + dogsCount);
    }

    public static int getDogsCount(){
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    private String size;

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
            System.out.println("Wrong paws count!");
            System.out.println("Correct number is 4!");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("Wrong tail count!");
            System.out.println("Correct number is 1!");
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
        if (dogsCount>2){
            System.out.println("Dog's are biting you!");
        } else {
            bark();
        }

    }

}
