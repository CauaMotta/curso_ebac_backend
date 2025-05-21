package br.com.ocauamotta.products;

public abstract class Vehicle {

    private Customer customer;
    private String model;
    private String color;
    private String engine;

    public Vehicle(Customer customer, String model, String color, String engine) {
        this.customer = customer;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public abstract void start();
}
