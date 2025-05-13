package br.com.ocauamotta;

import java.util.Scanner;

public class TarefaWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("**************************");
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();
        System.out.println("**************************");
        Integer castingIdade = idade;
        System.out.println("Sua idade é: " + castingIdade);
    }
}
