package br.com.ocauamotta.products;

import java.util.Random;
import java.util.UUID;

public abstract class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void describe();
}
