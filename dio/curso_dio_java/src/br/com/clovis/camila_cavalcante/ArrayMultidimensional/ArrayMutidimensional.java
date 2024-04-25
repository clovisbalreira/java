package br.com.clovis.camila_cavalcante.ArrayMultidimensional;

import java.util.Random;

public class ArrayMutidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] m = new int[4][4];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[1].length; j++){
                m[i][j] = random.nextInt(9);
            }
        }
        for (int[]linha:m){
            for(int coluna: linha){
                System.out.print(coluna+" " );
            }
        }
    }
}
