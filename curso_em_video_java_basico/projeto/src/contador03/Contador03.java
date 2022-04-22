package contador03;

import java.util.Scanner;

public class Contador03 {
    public static void main(String[] args) {
        int c = 0;
        do {
            System.out.println(c + " cambalhota");
            c++;
        }while (c < 10);

        int n;
        int soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número:");
            n = teclado.nextInt();
            soma += n;
            System.out.println("Quer Continuar? [s/n] ");
            resposta = teclado.next();
        }while (resposta.equals("s"));
        System.out.println("A soma de todos os valores é " + soma);
    }
}
