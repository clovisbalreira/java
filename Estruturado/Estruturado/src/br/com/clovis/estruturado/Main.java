package br.com.clovis.estruturado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite 1º numero: ");
        var numero1 = ler.nextFloat();
        System.out.print("Digite 2º numero: ");
        var numero2 = ler.nextInt();
        var soma = numero1 + numero2;
        System.out.println("A soma é : " + soma);
    }
}