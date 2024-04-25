package vetor04;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int n[] = {4,3,9,6,7,8};
        System.out.println("N normal");
        for (int valor: n ) {
            System.out.println(valor);
        }
        Arrays.sort(n);
        System.out.println("N em ordem");
        for (int valor: n ) {
            System.out.println(valor);
        }
        int p = Arrays.binarySearch(n,4);
        System.out.println("Encontrei o valor na posição " + p);
        int num[] = new int[20];
        Arrays.fill(num,10);
        System.out.println("Criar vetor com numeros automaticos");
        for (int valor:num ) {
            System.out.println("Valor " + valor);
        }
    }
}
