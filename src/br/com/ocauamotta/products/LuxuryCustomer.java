package br.com.ocauamotta.products;

public class LuxuryCustomer extends Customer{

    public LuxuryCustomer(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(this.getName() + " é cliente de luxo: busca por conforto e desempenho.");
    }
}
