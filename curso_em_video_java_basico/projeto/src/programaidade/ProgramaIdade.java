package programaidade;

import java.util.Calendar;
import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que ano você nasceu");
        int ano = teclado.nextInt();
        Calendar anoAtual = Calendar.getInstance();
        int idade = anoAtual.get(Calendar.YEAR) - ano;

        System.out.println("Sua idade é : " + idade);
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }

}
