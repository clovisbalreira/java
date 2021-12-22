package aula12_Animal_polimorfismo_sobreposicao;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void Locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de reptil");
    }
}
