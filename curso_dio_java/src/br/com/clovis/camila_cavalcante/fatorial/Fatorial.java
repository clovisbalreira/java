package br.com.clovis.camila_cavalcante.fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int fatorial = ler.nextInt();
        int multiplicacao = 1;

        for(int i = fatorial; i > 0; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
