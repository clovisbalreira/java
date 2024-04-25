package br.com.clovis.thiago_leite_e_carvalho.interruptores_break;

public class InterruptoresBreak {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            System.out.println("O valor do count é " + count);
            count++;
            if(count == 9){
                break;
            }

        }

        out:
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(i + " " + j);
                if(j == 5){
                    break out;
                }
            }
        }
        System.out.println("Fim o out");
    }
}
