package model;

import java.util.Scanner;

public class Alugar {
    Scanner ler = new Scanner(System.in);
    //atributo
    private int quantDiaria = 0;
    private double valorDiaria = 189.34;
    private double acessorios;

    //metodos assessores
    public int getQuantDiaria() {
        return quantDiaria;
    }

    public void setQuantDiaria(int quantDiaria) {
        this.quantDiaria = quantDiaria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(double acessorios) {
        this.acessorios = acessorios;
    }

    //metodo
    public boolean fazerPedido(int idade, String cidade, String veiculo, String marca, boolean cartao){
        if(idade != 0 && (!cidade.equals("Nenhuma")) && (!veiculo.equals("Nenhuma")) && (!marca.equals("Nenhuma")) && cartao == true){
            do {
                System.out.println("Quantos dias quer alugar o carro: ");
                this.setQuantDiaria(ler.nextInt());
                ler.nextLine();
                if(!(this.getQuantDiaria() > 0 && this.getQuantDiaria() <= 30)){
                    System.out.println("Você só se pode alugar o carro por 1 dia até 30 dias.");
                }
            }while(!(this.getQuantDiaria() > 0 && this.getQuantDiaria() <= 30));
            String escolhaAcessorios;
            System.out.println("Você deseja acessorios :\nS              - Sim\nQualquer letra - Não");
            escolhaAcessorios = ler.nextLine();
            switch (escolhaAcessorios){
                case "S":
                case "s":
                    this.setAcessorios(25.00);
                    break;
            }
            return true;
        }else{
            String resposta;
            if(cartao){
                resposta = "Cartão Valido";
            }else{
                resposta = "Cartão invalido";
            }
            System.out.println("\nExistem valores incorretos"  + "\nIdade do cliente: " + idade + "\nVeiculo: " + veiculo + "\nMarca: " + marca + "\nCidade de retirada: " + cidade + "\nCartão: " + resposta + "\n");
            return false;
        }
    }

    public double somaAluguel(int dias, int idade){
        double valorTaxaServico = 0;
        double valorProtecao = 0;
        if(idade < 23){
            valorTaxaServico = 0.12;
            valorProtecao = 29;
        }else{
            valorTaxaServico = 0.15;
            valorProtecao = 35;
        }
        double total = this.getQuantDiaria() * this.getValorDiaria();
        double taxaServico = dias * (this.getValorDiaria() * valorTaxaServico);
        double protecao = valorProtecao * this.getQuantDiaria();
        System.out.println("PAGAMENTO: " +
                "\nTotal R$ " + total +
                "\nTaxa de serviço R$ " + taxaServico +
                "\nProteção R$ " + protecao +
                "\nAcessorios R$ " + this.getAcessorios()
        );
        return total + taxaServico + protecao + this.getAcessorios();
    }

    //toString
    @Override
    public String toString() {
        return "\nALUGUEL: " +
                "\nValor Diaria R$ " + valorDiaria +
                "\nQuantidade de dias: " + quantDiaria +
                "\n"
                ;
    }
}
