package br.com.clovis.camila_cavalcante.maior_media;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        do {
            System.out.println("Numero");
            numero = ler.nextInt();
            soma += numero;
            if(numero > maior) maior = numero;
            count++;
        } while(count < 5);
        System.out.println("Maior " + maior);
        System.out.println("Média " + (soma / 5));
    }
}
