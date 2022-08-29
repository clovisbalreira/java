package br.com.clovis.aluno;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (this.getNota1() + this.getNota2()) / 2;
    }

    public String verificarSitucao(){
        String verificar;
        if(this.calcularMedia() >= 6){
            verificar = "Aprovado";
        }else{
            verificar = "Reprovado";
        }
        return verificar;
    }

    @Override
    public String toString() {
        return "Aluno" +
                "\n\tNome: " + this.getNome() +
                "\n\tNota1: " + this.getNota1() +
                "\n\tNota2: " + this.getNota2() +
                "\n\tMédia: " + this.calcularMedia() +
                "\n\tSituação: " + this.verificarSitucao();
    }
}
