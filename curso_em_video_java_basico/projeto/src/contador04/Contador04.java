package contador04;

import javax.swing.JOptionPane;

public class Contador04 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Ola Mundo", "Bem Vindo", JOptionPane.ERROR_MESSAGE);
        int n = 0;
        int soma = 0;
        int par = 0;
        int impar = 0;
        int maior = 0;
        int total = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um Número: <br>o valor 0 interrompe. </html>3"));
            if(n != 0){
                soma += n;
                if( n % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
                if(n >= 100) {
                    maior++;
                }
                total++;
            }
        }while (n != 0);
        float media = soma / total;
        JOptionPane.showMessageDialog(null,"<html>Resultado : <br>Total de valores: " + total + "<br>A soma dos valores: " + soma + "<br>Total de pares: " + par + "<br>Total de impares: " + impar + "<br>Acima de cem: " + maior + "<br>Média dos valores: " + media + "</html>", "",JOptionPane.ERROR_MESSAGE);
    }
}
