package br.com.ocauamotta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Collections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        String[] memory;

        System.out.println("**** Iniciar coleção de pessoas ****");
        System.out.print("Digite os nomes (ex: João, Pedro, Paulo...): ");
        memory = scanner.nextLine().replace(" ", "").toLowerCase().split(",");
        if (!memory[0].isEmpty()) {
            Arrays.stream(memory).forEach(pessoa -> pessoas.add(new Pessoa(pessoa)));
        }

        System.out.println("**** Pessoas cadastradas ****");
        System.out.println("");
        if (!pessoas.isEmpty()) {
            pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
        System.out.println("");
        System.out.println("**** * ****");
    }
}
