package br.com.clovis.camila_cavalcante.ordem_inversa;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, -5, 15, 50, 8, 4};
        int count = 0;
        System.out.print("Vetor: ");
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("Vetor: ");
        for(int i = (vetor.length-1); i >= 0 ; i--){
            System.out.print(vetor[i] + " ");
            count--;
        }
    }
}