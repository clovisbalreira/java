package br.com.clovis.pessoa;

public class Pessoa {
    public String nome;
    public byte idade;
    public float altura;
    public String sexo;

    public void comer(){
        System.out.println();
    }

    public void falar(){
        System.out.println("Olá, eu me chamo " + this.nome);
    }

    public void andar(){
        System.out.println();
    }
}
