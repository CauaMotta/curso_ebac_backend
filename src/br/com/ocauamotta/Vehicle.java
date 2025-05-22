package br.com.ocauamotta;

public abstract class Vehicle {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
