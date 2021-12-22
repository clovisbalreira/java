package aula12_Animal_polimorfismo_sobreposicao;

public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void Locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Peixe não faz som");
    }
}
