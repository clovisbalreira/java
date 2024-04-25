package br.com.clovis.thiago_leite_e_carvalho.laco_while_infinito;

public class WhileInfinito {
    public static void main(String[] args) {
        int count = 0;
        boolean resposta = true;
        while (resposta){
            System.out.println("O valor do count é " + count);
            count++;
            if(count == 5){
                resposta = false;
            }
        }
    }
}
