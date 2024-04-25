package contador01;

public class Contador01 {
    public static void main(String[] args) {
        int c = 0;
        while (c < 10){
            c++;
            if( c == 5 || c == 7){
                //Interrompe o laço e contnua rodando
                continue;
            }
            if( c == 8 ){
                //para o codigo
                break;
            }
            System.out.println((c + 1) + " Cambalhota");
        }
    }
}
