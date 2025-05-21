package br.com.ocauamotta.factories;

import br.com.ocauamotta.products.Customer;
import br.com.ocauamotta.products.Vehicle;

public abstract class AbstractFactory {

    public abstract Customer createCustomer(String name);
    public abstract Vehicle createVehicle(Customer customer, String model, String color, String engine);
    public abstract void print(Vehicle vehicle);
}
