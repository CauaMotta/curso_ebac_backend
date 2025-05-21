package br.com.ocauamotta.products;

public class PopularVehicle extends Vehicle{

    public PopularVehicle(Customer customer, String model, String color, String engine) {
        super(customer, model, color, engine);
    }

    @Override
    public void start() {
        System.out.println("Veículo popular: " + this.getModel() + " " + this.getColor() + ", motor " + this.getEngine() + ", econômico.");
    }
}
