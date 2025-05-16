package br.com.ocauamotta;

public abstract class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa (String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract void exibirDocumento();

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
