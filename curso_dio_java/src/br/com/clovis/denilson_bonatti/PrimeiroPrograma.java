package br.com.clovis.denilson_bonatti;

import br.com.clovis.denilson_bonatti.model.Gato;
import br.com.clovis.denilson_bonatti.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O Problema do corpo",333);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!");*/
    }
}
