package programamedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("Digite sua segunda nota");
        float n2 = teclado.nextFloat();
        float media = (n1+n2)/2;
        System.out.println("Sua Média foi : " + media);
        if(media > 5){
            System.out.println("Parabens Você foi aprovado");
        }
    }
}
