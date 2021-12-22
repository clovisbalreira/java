package br.com.clovis.camila_cavalcante.NumeroAleatorio;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];
        for (int i = 0 ; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Anteccessores Números aleatorios ");
        for(int numero:numerosAleatorios){
            System.out.print(numero-1 + " ");
        }
        System.out.print("\nNúmeros aleatorios ");
        for(int numero:numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nSuccessores Números aleatorios ");
        for(int numero:numerosAleatorios){
            System.out.print(numero+1 + " ");
        }
    }
}
