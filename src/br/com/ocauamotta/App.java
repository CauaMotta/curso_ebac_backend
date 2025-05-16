package br.com.ocauamotta;

public class App {

    public static void main(String[] args) {
        PessoaFisica joao = new PessoaFisica("João", "Rua Java, número 0001, API - SC", "123.456.789-10");
        PessoaJuridica empresaDoJoao = new PessoaJuridica("Empresa do João", "Rua JavaScript, número 0002, HTML - SP", "12.345.678/0001-90");

        joao.exibirDocumento();
        empresaDoJoao.exibirDocumento();
    }
}
