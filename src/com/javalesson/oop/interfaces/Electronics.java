package com.javalesson.oop.interfaces;

public abstract class Electronics implements Deliverable, Orderable {

        private String make;
        private String model;
        private int quantity;
        private int price;

    public Electronics(String name, String model, int quantity, int price) {
        this.make = name;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return make;
    }

    public void setName(String name) {
        this.make = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int calcOrderPrice() {
        return getQuantity() * getPrice();
    }
}
