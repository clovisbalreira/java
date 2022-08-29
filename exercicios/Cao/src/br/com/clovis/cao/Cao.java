package br.com.clovis.cao;

public class Cao {
    private String nome;
    private String raca;
    private String cor;
    private String sexo;
    private String porte;
    private byte idade;
    private String dono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void latir(){}

    public void comer(){}

    public void correr(){}

    public void pular(){}

    public void morder(){}

    @Override
    public String toString() {
        return "Dados do cão" +
                "\n\tNome: " + this.getNome() +
                "\n\tRaça: " + this.getRaca() +
                "\n\tCor: " + this.getCor() +
                "\n\tSexo: " + this.getSexo() +
                "\n\tPorte: " + this.getPorte() +
                "\n\tIdade: " + this.getIdade() +
                "\n\tDono: " + this.getDono() ;
    }
}
