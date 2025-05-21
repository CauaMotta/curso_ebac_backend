package br.com.ocauamotta;

import br.com.ocauamotta.factories.AbstractFactory;
import br.com.ocauamotta.factories.LuxuryFactory;
import br.com.ocauamotta.factories.PopularFactory;
import br.com.ocauamotta.products.Customer;
import br.com.ocauamotta.products.Vehicle;

public class App {

    public static void main(String[] args) {
        // Fábrica de carros populares

        AbstractFactory popFactory = new PopularFactory();
        Customer popCustomer = popFactory.createCustomer("João");
        Vehicle popVehicle = popFactory.createVehicle(popCustomer, "Palio", "Prata", "1.0");

        popCustomer.describe();
        popVehicle.start();
        popFactory.print(popVehicle);

        // Fábrica de carros de luxo

        AbstractFactory luxFactory = new LuxuryFactory();
        Customer luxCustomer = luxFactory.createCustomer("Henrique");
        Vehicle luxVehicle = luxFactory.createVehicle(luxCustomer, "Ferrari 488 Pista", "Vermelho", "V8");

        luxCustomer.describe();
        luxVehicle.start();
        luxFactory.print(luxVehicle);
    }
}
