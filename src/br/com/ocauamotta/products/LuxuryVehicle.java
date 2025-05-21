package br.com.ocauamotta.products;

public class LuxuryVehicle extends Vehicle{

    public LuxuryVehicle(Customer customer, String model, String color, String engine) {
        super(customer, model, color, engine);
    }

    @Override
    public void start() {
        System.out.println("Veículo de luxo: " + this.getModel() + " " + this.getColor() + ", motor " + this.getEngine() + ", acabamento premium.");
    }
}
