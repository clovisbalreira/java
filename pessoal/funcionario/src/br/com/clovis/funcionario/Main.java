package br.com.clovis.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Informe os dados do funcionario");
        System.out.print("Nome: ");
        funcionario.nome = ler.next();
        System.out.print("C.P.F.: ");
        funcionario.cpf = ler.nextLong();
        System.out.print("Valor hora Trabalhada: ");
        funcionario.valorHora = ler.nextFloat();
        System.out.print("Quantidade de horas trabalhada: ");
        funcionario.cargaHorariaMes = ler.nextFloat();
        System.out.println(funcionario);
    }
}
