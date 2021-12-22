package br.com.clovis.camila_cavalcante.par_impar;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0,quantImpares = 0;
        System.out.println("Quantidade de números");
        quantNumeros = ler.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = ler.nextInt();
            count++;
            if(numero % 2 == 0)quantPares++;
            else quantImpares++;

        }while (count < quantNumeros);
        System.out.println("Quantidade par: " + quantPares);
        System.out.println("Quantidade impar: " + quantImpares);
    }
}
