package br.com.ocauamotta;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDocumento() {
        System.out.println("Pessoa jurídica - CNPJ: " + cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }
}
