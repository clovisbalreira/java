package br.com.clovis.cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.println("Informe os dados do 1º cliente");
        System.out.print("Nome: ");
        cliente1.setNome(ler.next());
        System.out.print("CPF: ");
        cliente1.setCpf(ler.next());
        System.out.print("RG: ");
        cliente1.setRg(ler.next());
        System.out.print("Endereço: ");
        cliente1.setEndereco(ler.next());
        System.out.print("Renda bruta: ");
        cliente1.setRendaBruta(ler.nextDouble());
        System.out.print("Limite: ");
        cliente1.setLimite(ler.nextDouble());

        System.out.println("\nInforme os dados do 2º cliente");
        System.out.print("Nome: ");
        cliente2.setNome(ler.next());
        System.out.print("CPF: ");
        cliente2.setCpf(ler.next());
        System.out.print("RG: ");
        cliente2.setRg(ler.next());
        System.out.print("Endereço: ");
        cliente2.setEndereco(ler.next());
        System.out.print("Renda bruta: ");
        cliente2.setRendaBruta(ler.nextDouble());
        System.out.print("Limite: ");
        cliente2.setLimite(ler.nextDouble());

        System.out.println("\n" + cliente1);
        System.out.println("\n" + cliente2);
    }
}
