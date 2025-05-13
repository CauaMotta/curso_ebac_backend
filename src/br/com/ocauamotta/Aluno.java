package br.com.ocauamotta;

public class Aluno {
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
