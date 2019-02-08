/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

/**
 *
 * @author Roma2
 */
public class Car {
    private String make;
    private String model;
    private int price;

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", model=" + model + ", price=" + price + '}';
    }

    
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
