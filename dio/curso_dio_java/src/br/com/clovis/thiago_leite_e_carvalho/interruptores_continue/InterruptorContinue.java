package br.com.clovis.thiago_leite_e_carvalho.interruptores_continue;

public class InterruptorContinue {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10){
            count++;
            if(count == 5){
                continue;
            }
            System.out.println("Cont" + count);
        }

        out:
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(j == 5){
                    continue out;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
