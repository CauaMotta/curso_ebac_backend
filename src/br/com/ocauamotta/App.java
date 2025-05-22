package br.com.ocauamotta;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<>();

        Vehicle carro = new Carro("Polo 1.0 TSI");
        Vehicle moto = new Moto("Honda CB300");

        garage.saveVehicle(carro);
        garage.saveVehicle(moto);

        garage.getGarage();
    }
}
