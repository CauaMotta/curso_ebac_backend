package br.com.ocauamotta.factories;

import br.com.ocauamotta.products.Customer;
import br.com.ocauamotta.products.LuxuryCustomer;
import br.com.ocauamotta.products.LuxuryVehicle;
import br.com.ocauamotta.products.Vehicle;

public class LuxuryFactory extends AbstractFactory{
    @Override
    public Customer createCustomer(String name) {
        return new LuxuryCustomer(name);
    }

    @Override
    public Vehicle createVehicle(Customer customer, String model, String color, String engine) {
        return new LuxuryVehicle(customer, model, color, engine);
    }

    @Override
    public void print(Vehicle vehicle) {
        System.out.println("O cliente " + vehicle.getCustomer().getName() + " está alugando o carro: " + vehicle.getModel());
    }
}
