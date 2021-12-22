package model;

import java.util.Scanner;

public class Veiculo {
    Scanner ler = new Scanner(System.in);
    //atributos
    private String veiculo = "Nenhuma",marca = "Nenhuma",tipo = "Nenhuma";

    //metodos assessores
    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //metodos
    public void escolherMarca(){
        int escolhaMarca;
        do {
            System.out.println("Escolha a marca\n1 - Fiat\n2 - Ford");
            escolhaMarca = ler.nextInt();
            switch (escolhaMarca) {
                case 1:
                    this.setMarca("Fiat");
                    escolherVeiculoTipo("Fiat Uno 1.0", "Compacto (ECMN)", "Fiat Mobi 1.0", "Compacto Com Ar (ECMR)", "Fiat Mobi 1.0", "Econômico Com Ar (EDMR)");
                    break;
                case 2:
                    this.setMarca("Ford");
                    escolherVeiculoTipo("Ford K 1.0", "Compacto", "Ford Mustang", "Compacto Com Ar", "Ford Edge", "Econômico Com Ar");
                    break;
                default:
                    System.out.println("Número invalido!");
                    break;
            }
        }while (escolhaMarca > 2);
    }

    public void escolherVeiculoTipo(String veiculo1, String tipo1,String veiculo2, String tipo2,String veiculo3, String tipo3){
        int escolha;
        do {
            System.out.println("Escolha o veiculo\n1 - Veiculo: "+veiculo1 + " Tipo: " + tipo1 + "\n2 - Veiculo: "+veiculo2 + " Tipo: " + tipo2 + "\n3 - Veiculo: "+veiculo3 + " Tipo: " + tipo3 + "\n4 - Voltar");
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    this.setVeiculo(veiculo1);
                    this.setTipo(tipo1);
                    break;
                case 2:
                    this.setVeiculo(veiculo2);
                    this.setTipo(tipo2);
                    break;
                case 3:
                    this.setVeiculo(veiculo3);
                    this.setTipo(tipo3);
                    break;
                case 4:
                    this.setVeiculo("");
                    this.setTipo("");
                    escolherMarca();
                    break;
                default:
                    System.out.println("Número invalido!");
                    break;
            }
        }while (escolha > 4);
    }

    //toString
    @Override
    public String toString() {
        return "\nVEICULO" +
                "\nVeiculo: " + veiculo +
                "\nMarca: " + marca +
                "\nTipo: " + tipo +
                "\n"
                ;
    }
}
