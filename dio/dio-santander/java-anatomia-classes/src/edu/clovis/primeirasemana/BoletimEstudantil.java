package edu.clovis.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {        
        int mediaFinal = 9 ;
        System.out.println("Sua Nota Final foi: " + mediaFinal);
        String situacao;
        if(mediaFinal < 6){
            situacao = "REPROVADO";
        }else if(mediaFinal == 6){
            situacao = "RECUPERAÇÃO";
        }else{
            situacao = "APROVADO";
        }
        System.out.println("Você foi: " + situacao);
    }
}
