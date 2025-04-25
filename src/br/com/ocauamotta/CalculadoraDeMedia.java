package br.com.ocauamotta;

import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaFinal() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}

public class CalculadoraDeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        System.out.println("**** Calculadora de média ****");

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
    }
}
