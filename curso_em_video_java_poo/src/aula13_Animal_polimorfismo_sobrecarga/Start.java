package aula13_Animal_polimorfismo_sobrecarga;

public class Start {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        System.out.println("---------------");
        m.emitirSom();
        System.out.println("---------------");
        l.emitirSom();
        System.out.println("---------------");
        c.emitirSom();
        c.reagir("olá");
        c.reagir("Toma comida");
        c.reagir("Vai apanhar");
        System.out.println("---------------");
        c.reagir(11,45);
        c.reagir(16,45);
        c.reagir(21,00);
        System.out.println("---------------");
        c.reagir(true);
        c.reagir(false);
        System.out.println("---------------");
        c.reagir(2,7f);
        c.reagir(2,12.5f);
        c.reagir(17,4.5f);
        c.reagir(17,14.5f);
    }
}
