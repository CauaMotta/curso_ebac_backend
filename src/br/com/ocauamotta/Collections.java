package br.com.ocauamotta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome;
    }
}

public class Collections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();
        String[] memory;
        String continuar;

        System.out.println("**** Iniciar coleção de pessoas ****");
        do {
            System.out.print("Digite o nome e o sexo (ex: João, masculino): ");
            memory = scanner.nextLine().replace(" ", "").toLowerCase().split(",");

            if (memory[1].equalsIgnoreCase("Masculino")) {
                masculino.add(new Pessoa(memory[0], memory[1]));
            } else if (memory[1].equalsIgnoreCase("Feminino")) {
                feminino.add(new Pessoa(memory[0], memory[1]));
            } else {
                System.out.println("Pessoa não cadastrada. Sexo inválido.");
            }

            memory = new String[0];

            System.out.print("Cadastrar nova pessoa? (Sim ou Não) ");
            continuar = scanner.nextLine();
            System.out.println("");
        } while (continuar.equalsIgnoreCase("Sim"));

        System.out.println("**** Pessoas cadastradas ****");
        System.out.println("");
        if (!masculino.isEmpty() || !feminino.isEmpty()) {
            if (!masculino.isEmpty()) {
                System.out.println("Pessoas do sexo masculino: ");
                for (Pessoa homem : masculino) {
                    System.out.println(homem);
                }
            }
            if (!masculino.isEmpty() && !feminino.isEmpty()) {
                System.out.println("");
            }
            if (!feminino.isEmpty()) {
                System.out.println("Pessoas do sexo feminino: ");
                for (Pessoa mulher : feminino) {
                    System.out.println(mulher);
                }
            }
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
        System.out.println("");
        System.out.println("**** * ****");
    }
}
