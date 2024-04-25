package br.com.clovis.camila_cavalcante.Consoante;

import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;
        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = ler.next();
            if(!(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConsoante++;
            }
            count++;
        }while (count < consoantes.length);

        for ( String consoante: consoantes){
            if (consoante != null){
                System.out.println(consoante);
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoante);
    }
}
