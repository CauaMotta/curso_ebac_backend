package br.com.ocauamotta.products;

public class PopularCustomer extends Customer{

    public PopularCustomer(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(this.getName() + " é cliente popular: busca por um carro econômico.");
    }
}
