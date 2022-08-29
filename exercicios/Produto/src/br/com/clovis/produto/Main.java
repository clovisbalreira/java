package br.com.clovis.produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        System.out.println("Informe os dados do 1º produto ");
        System.out.print("Nome: ");
        produto1.setNome(ler.next());
        System.out.print("Descrição: ");
        produto1.setDescricao(ler.next());
        System.out.print("Valor: ");
        produto1.setValor(ler.nextDouble());

        System.out.println("\nInforme os dados do 2º produto ");
        System.out.print("Nome: ");
        produto2.setNome(ler.next());
        System.out.print("Descrição: ");
        produto2.setDescricao(ler.next());
        System.out.print("Valor: ");
        produto2.setValor(ler.nextDouble());

        System.out.println("\nInforme os dados do 3º produto ");
        System.out.print("Nome: ");
        produto3.setNome(ler.next());
        System.out.print("Descrição: ");
        produto3.setDescricao(ler.next());
        System.out.print("Valor: ");
        produto3.setValor(ler.nextDouble());

        System.out.println("\n" + produto1);
        System.out.println("\n" + produto2);
        System.out.println("\n" + produto3);
    }
}
