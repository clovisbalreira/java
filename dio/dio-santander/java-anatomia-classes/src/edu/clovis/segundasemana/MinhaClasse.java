package edu.clovis.segundasemana;
public class MinhaClasse {
    public static void main(String [] args){
        System.out.println("Olá, turma sejam bem-vindos!");
        String meuNome = "Clóvis";
        int anoNascimento = 1980;
        boolean verdadeira = true;
        String primeiroNome = "Clóvis";
        String segundoNome = "Balreira";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Nome: " + meuNome + "\nNascimento: " + anoNascimento + "\nVerdadeiro: " + verdadeira);
        anoNascimento = 2018;
        System.out.println("Nome: " + meuNome + "\nNascimento: " + anoNascimento + "\nVerdadeiro: " + verdadeira);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
