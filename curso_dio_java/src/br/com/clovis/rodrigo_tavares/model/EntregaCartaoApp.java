package br.com.clovis.rodrigo_tavares.model;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "000000";
        Cliente cliente = new Cliente();

        try{
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso.");
        }catch (Exception e){
            System.out.println("Houve um erro ao adicionar o endereco" + e);
        }
    }
}
