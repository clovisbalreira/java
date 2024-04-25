package br.com.clovis.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite os dados da 1º pessoa");
        System.out.print("Digite o nome: ");
        pessoa.nome = ler.next();
        System.out.print("Digite a idade: ");
        pessoa.idade = ler.nextByte();
        System.out.print("Digite a altura: ");
        pessoa.altura = ler.nextFloat();
        System.out.print("Digite o sexo: ");
        pessoa.sexo =  ler.next();

        System.out.println("Digite os dados da 2º pessoa");
        System.out.print("Digite o nome: ");
        pessoa1.nome =  ler.next();
        System.out.print("Digite a idade: ");
        pessoa1.idade = ler.nextByte();
        System.out.print("Digite a altura: ");
        pessoa1.altura = ler.nextFloat();
        System.out.print("Digite o sexo: ");
        pessoa1.sexo = ler.next();

        System.out.println("Dados da pessoa 1:");
        System.out.println("Qual seu Nome: " + pessoa.nome);
        System.out.println("Qual sua Idade: " + pessoa.idade);
        System.out.println("Qual sua altura: " + pessoa.altura);
        System.out.println("Qual seu Sexo: " + pessoa.sexo);

        System.out.println("\nDados da pessoa 2:");
        System.out.println("Qual seu Nome: " + pessoa1.nome);
        System.out.println("Qual sua Idade: " + pessoa1.idade);
        System.out.println("Qual sua altura: " + pessoa1.altura);
        System.out.println("Qual seu Sexo: " + pessoa1.sexo);

        System.out.println("\n");
        pessoa.falar();
        pessoa1.falar();
        ler.close();
    }
}
