package br.com.ocauamotta;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {

    private List<T> garage;

    public Garage() {
        garage = new ArrayList<T>();
    }

    public void getGarage() {
        System.out.println("Veículos guardados na gargem: ");
        for (T vehicle : garage) {
            System.out.println(vehicle.getModel());
        }
    }

    public void saveVehicle(T vehicle) {
        this.garage.add(vehicle);
    }
}
