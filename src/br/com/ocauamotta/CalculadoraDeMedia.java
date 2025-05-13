package br.com.ocauamotta;

import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        String continuar;

        System.out.println("**** Calculadora de média ****");

        do {
            System.out.print("Digite o nome do aluno a ser avaliado: ");
            aluno1.setNome(scanner.nextLine());

            System.out.println("**** Iniciando avaliação do aluno " + aluno1.getNome() + " ****");

            System.out.print("Insira a primeira nota: ");
            aluno1.setNota1(scanner.nextDouble());

            System.out.print("Insira a segunda nota: ");
            aluno1.setNota2(scanner.nextDouble());

            System.out.print("Insira a terceira nota: ");
            aluno1.setNota3(scanner.nextDouble());

            System.out.print("Insira a quarta nota: ");
            aluno1.setNota4(scanner.nextDouble());

            System.out.println("********************************************");
            System.out.println("A Media final do aluno " + aluno1.getNome() + " é de: " + aluno1.getMediaFinal());
            if (aluno1.getMediaFinal() >= 7) {
                System.out.println("O aluno foi aprovado!");
            } else if (aluno1.getMediaFinal() >= 5) {
                System.out.println("O aluno está de recuperação!");
            } else {
                System.out.println("O aluno está reprovado!");
            }
            System.out.println("********************************************");
            System.out.println("Continuar avaliações? (Sim ou Não)");
            scanner.nextLine();
            continuar = scanner.nextLine();
            System.out.println("********************************************");


        } while (continuar.equalsIgnoreCase("Sim"));
    }
}