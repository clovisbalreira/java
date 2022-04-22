package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        float nota = 8.5f;
        System.out.print("A nota é "+nota+"\n");
        System.out.println("A nota é "+nota);
        System.out.printf("A nota é %.2f \n" , nota);
        System.out.format("A nota é %.2f \n" , nota);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno \n");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno \n");
        float notas = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f",nome,notas);
    }
}
