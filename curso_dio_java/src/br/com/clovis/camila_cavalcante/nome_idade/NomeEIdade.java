package br.com.clovis.camila_cavalcante.nome_idade;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        while (true){
            System.out.println("Nome: ");
            nome = ler.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = ler.nextInt();
        }
        System.out.println("Continue aqui...");
    }
}
