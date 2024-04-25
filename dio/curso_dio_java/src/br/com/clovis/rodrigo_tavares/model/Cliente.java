package br.com.clovis.rodrigo_tavares.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    public String numCartao;
    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("O endereço não pode ser nulo");
        }
        if(endereco.cep == null){
            throw new NullPointerException("O cep não pode ser nulo.");
        }
        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

}
