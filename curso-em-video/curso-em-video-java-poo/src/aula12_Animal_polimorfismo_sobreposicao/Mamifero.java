package aula12_Animal_polimorfismo_sobreposicao;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void Locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void Alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de Mamifero");
    }
}
