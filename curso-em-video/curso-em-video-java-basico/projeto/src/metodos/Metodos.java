package metodos;

public class Metodos {
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma de " + a + " + " + b + " é " + s);
    }

    static int somaReturno(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        soma(5,2);
        int soma = somaReturno(7,9);
        System.out.println("A soma com returno " + soma);
    }
}
