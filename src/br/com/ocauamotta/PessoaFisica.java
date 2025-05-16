package br.com.ocauamotta;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void exibirDocumento() {
        System.out.println("Pessoa física - CPF: " + cpf);
    }

    public String getCpf() {
        return cpf;
    }
}
