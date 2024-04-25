package br.com.clovis.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        System.out.println("Informe os dados do 1º funcionario");
        System.out.print("Nome: ");
        funcionario1.setNome(ler.next());
        System.out.print("Valor Hora: ");
        funcionario1.setValorHora(ler.nextDouble());
        System.out.print("Carga Horaria: ");
        funcionario1.setCargaHorariaMes(ler.nextDouble());

        System.out.println("\nInforme os dados do 2º funcionario");
        System.out.print("Nome: ");
        funcionario2.setNome(ler.next());
        System.out.print("Valor Hora: ");
        funcionario2.setValorHora(ler.nextDouble());
        System.out.print("Carga Horaria: ");
        funcionario2.setCargaHorariaMes(ler.nextDouble());

        System.out.println("\n" + funcionario1);
        System.out.println("\n" + funcionario2);
    }
}
