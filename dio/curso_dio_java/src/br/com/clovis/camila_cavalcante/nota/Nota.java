package br.com.clovis.camila_cavalcante.nota;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = ler.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota Inválida digite novamente: ");
            nota = ler.nextInt();
        }
    }
}
