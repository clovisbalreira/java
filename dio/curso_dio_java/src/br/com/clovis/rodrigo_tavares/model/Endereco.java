package br.com.clovis.rodrigo_tavares.model;

public class Endereco {

    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String cep;

}
