package com.javalesson.oop.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Deliverable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Deliverable cellPhone = new CellPhone("Motorola", "Xt500", 1, 300);
        Deliverable fridge = new Fridge("LG", "Tu53", 1, 500);


        printDeliveryPrice(pizza);
        printDeliveryPrice(cellPhone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Deliverable del) {
        System.out.println("Delivery price " + del.calcDeliveryPrice());
    }
}
