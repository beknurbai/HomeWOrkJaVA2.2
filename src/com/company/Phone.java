package com.company;

public class Phone implements Printable {
private int price;
private String model;

    public Phone(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("price: "+ getPrice()+"!!"+" Phone Model: "+getModel());
    }
}


