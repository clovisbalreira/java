package br.com.clovis.aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        System.out.println("Informe os dados do 1º aluno");
        System.out.print("Nome: ");
        aluno1.setNome(ler.next());
        System.out.print("Nota 1: ");
        aluno1.setNota1(ler.nextDouble());
        System.out.print("Nota 2: ");
        aluno1.setNota2(ler.nextDouble());

        System.out.println("\nInforme os dados do 2º aluno");
        System.out.print("Nome: ");
        aluno2.setNome(ler.next());
        System.out.print("Nota 1: ");
        aluno2.setNota1(ler.nextDouble());
        System.out.print("Nota 2: ");
        aluno2.setNota2(ler.nextDouble());

        System.out.println("\n" + aluno1);
        System.out.println("\n" + aluno2);
    }
}
