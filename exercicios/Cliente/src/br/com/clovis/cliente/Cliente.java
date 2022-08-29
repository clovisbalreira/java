package br.com.clovis.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private double rendaBruta;
    private double limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(){}
    public void depositar(){}
    public void consultarSaldo(){}
    public void transferir(){}

    @Override
    public String toString() {
        return "Dados do cliente" +
                "\n\tNome: " + this.getNome() +
                "\n\tCpf: " + this.getCpf() +
                "\n\tRg: " + this.getRg() +
                "\n\tEndereço: " + this.getEndereco() +
                "\n\tRenda Bruta: " + this.getRendaBruta() +
                "\n\tLimite: " + this.getLimite();
    }
}
