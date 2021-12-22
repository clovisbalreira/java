package model;

import java.util.Scanner;

public class Cidade {
    Scanner ler = new Scanner(System.in);
    //atributo
    private String nome = "Nenhuma";

    //metodos assessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos
    public void escolherCidade(){
        int escolheCidade;
        do {
            System.out.println("Selecionar a cidade da Retirada do Veículo:\n1 - Canoas\n2 - Porto Alegre\n3 - Novo Hamburgo\n4 - Gramado");
            escolheCidade = ler.nextInt();
            switch (escolheCidade){
                case 1:
                    this.setNome("Canoas");
                    break;
                case 2:
                    this.setNome("Porto Alegre");
                    break;
                case 3:
                    this.setNome("Novo Hamburgo");
                    break;
                case 4:
                    this.setNome("Gramado");
                    break;
                default:
                    System.out.println("Número invalido!");
                    break;
            }
        }while (escolheCidade > 4);

    }
    //toString
    @Override
    public String toString() {
        return "\nCIDADE DA RETIRADA"+
                "\nCidade: " + this.nome +
                "\n"
                ;
    }
}
