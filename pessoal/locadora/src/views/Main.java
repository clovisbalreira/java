package views;

import model.Alugar;
import model.Cidade;
import model.Pessoa;
import model.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Veiculo veiculo = new Veiculo();
        Cidade cidade = new Cidade();
        Alugar alugar = new Alugar();

        System.out.println("Locadora de veiculos XYZ");
        int menuOpcoes;
        do {
            System.out.println("Selecione a opção\n1 - Cadastro\n2 - Veiculo\n3 - Cidade\n4 - Alugar\n5 - Sair");
            menuOpcoes = ler.nextInt();
            switch (menuOpcoes) {
                case 1:
                    //Cadastro cliente
                    System.out.println("Cadastro");
                    System.out.println("Nome : ");
                    pessoa.setNome(ler.nextLine());
                    pessoa.setNome(ler.nextLine());
                    pessoa.validarIdade();
                    pessoa.validarCpf();
                    pessoa.validarTelefone();
                    pessoa.validarCartao();
                    System.out.println(pessoa);
                    break;
                case 2:
                    veiculo.escolherMarca();
                    System.out.println(veiculo);
                    break;
                case 3:
                    cidade.escolherCidade();
                    System.out.println(cidade);
                    break;
                case 4:
                    boolean pedido = alugar.fazerPedido(pessoa.getIdade(), cidade.getNome(), veiculo.getVeiculo(), veiculo.getMarca(), pessoa.isCartao() );
                    if(pedido){
                        System.out.println("===========NOTA===========" + pessoa + cidade + veiculo + alugar );
                        System.out.println("Valor Total a pagar R$ " + alugar.somaAluguel(alugar.getQuantDiaria(), pessoa.getIdade()) + "\n");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Número invalido!");
                    break;
            }
        } while (!(menuOpcoes == 5));
        System.out.println("Obrigado pela sua visita");
    }
}