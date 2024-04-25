package aula12_Animal_polimorfismo_sobreposicao;

public class Canguru extends Mamifero{
    public void UsarBolsa(){
        System.out.println("Usando Bolsa");
    }
    @Override
    public void Locomover(){
        System.out.println("Saltando");
    }
}
