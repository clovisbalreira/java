package funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario();

        System.out.println("Informe os dados do funcionario");
        System.out.print("Nome: ");
        funcionario.setNome(ler.next());
        System.out.print("C.P.F.: ");
        funcionario.setCpf(ler.nextLong());
        System.out.print("Valor hora Trabalhada: ");
        funcionario.setValorHora(ler.nextFloat());
        System.out.print("Quantidade de horas trabalhada: ");
        funcionario.setCargaHorariaMes(ler.nextFloat());

        System.out.println("\n\nInforme os dados do funcionario 2");
        System.out.print("Nome: ");
        funcionario1.setNome(ler.next());
        System.out.print("C.P.F.: ");
        funcionario1.setCpf(ler.nextLong());
        System.out.print("Valor hora Trabalhada: ");
        funcionario1.setValorHora(ler.nextFloat());
        System.out.print("Quantidade de horas trabalhada: ");
        funcionario1.setCargaHorariaMes(ler.nextFloat());

        System.out.println(funcionario);
        System.out.println(funcionario1);

        ler.close();
    }
}
