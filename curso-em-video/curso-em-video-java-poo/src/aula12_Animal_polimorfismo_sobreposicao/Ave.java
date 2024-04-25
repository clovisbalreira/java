package aula12_Animal_polimorfismo_sobreposicao;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void FazerNinho(){
        System.out.println("Construindo ninho");
    }

    @Override
    public void Locomover() {
        System.out.println("Voando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som da ave");
    }
}
