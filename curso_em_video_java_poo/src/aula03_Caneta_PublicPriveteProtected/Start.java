package aula03_Caneta_PublicPriveteProtected;

public class Start {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.status();

        Caneta c2 = new Caneta();
        c2.status();

    }
}
