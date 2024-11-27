package com.example.lsi1.data;

public class Car {

    String plateNumber;
    int unsued = 1;
    String brand;
    int price;

    public Car(String plateNumber, String brand, int price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
    }

    public Car() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
