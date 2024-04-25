package br.com.clovis.cao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cao cao1 = new Cao();
        Cao cao2 = new Cao();

        System.out.println("Informe os dados do 1º cão");
        System.out.print("Nome: ");
        cao1.setNome(ler.next());
        System.out.print("Raça: ");
        cao1.setRaca(ler.next());
        System.out.print("Cor: ");
        cao1.setCor(ler.next());
        System.out.print("Sexo: ");
        cao1.setSexo(ler.next());
        System.out.print("Porte: ");
        cao1.setPorte(ler.next());
        System.out.print("Idade: ");
        cao1.setIdade(ler.nextByte());
        System.out.print("Dono: ");
        cao1.setDono(ler.next());

        System.out.println("\nInforme os dados do 2º cão");
        System.out.print("Nome: ");
        cao2.setNome(ler.next());
        System.out.print("Raça: ");
        cao2.setRaca(ler.next());
        System.out.print("Cor: ");
        cao2.setCor(ler.next());
        System.out.print("Sexo: ");
        cao2.setSexo(ler.next());
        System.out.print("Porte: ");
        cao2.setPorte(ler.next());
        System.out.print("Idade: ");
        cao2.setIdade(ler.nextByte());
        System.out.print("Dono: ");
        cao2.setDono(ler.next());

        System.out.println("\n" + cao1);
        System.out.println("\n" + cao2);
    }
}
