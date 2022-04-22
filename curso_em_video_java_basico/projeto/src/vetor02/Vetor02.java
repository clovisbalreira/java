package vetor02;

import java.util.Calendar;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dia[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Calendar ano = Calendar.getInstance();
        if(ano.get(Calendar.YEAR) % 4 == 2){
            dia[1] = 29;
            System.out.println("O ano é bisexto");
        }

        for(var i = 0; i < mes.length; i++){
            System.out.println("O mês de " + mes[i] + " tem " + dia[i] + " dias.");
        }
    }
}
