package aula02_Caneta;

public class Start {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "Big";
        c1.cor = "Vermelho";
        c1.ponta = 0.5f;
        c1.carga = 20;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Carrefour";
        c2.cor = "Azul";
        c2.ponta = 1.5f;
        c2.carga = 80;
        c2.status();
        c2.rabiscar();

    }
}
