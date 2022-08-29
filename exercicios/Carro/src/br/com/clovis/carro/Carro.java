package br.com.clovis.carro;

public class Carro {
    private String marca;
    private String modelo;
    private String chassi;
    private int anoFabricacao;
    private int anoModelo;
    private double valorUnitario;
    private int quantidade;
    private double nivelTanque;
    private double mediaKmLitro;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getNivelTanque() {
        return nivelTanque;
    }

    public void setNivelTanque(double nivelTanque) {
        this.nivelTanque = nivelTanque;
    }

    public double getMediaKmLitro() {
        return mediaKmLitro;
    }

    public void setMediaKmLitro(double mediaKmLitro) {
        this.mediaKmLitro = mediaKmLitro;
    }

    public double calcularValorTotalDoVeiculo(){
        return this.getValorUnitario() * this.getQuantidade();
    }

    public double calcularDistanciaAPercorrer(double distancia, double tempo){
       return distancia * tempo ;
    }

    @Override
    public String toString() {
        return "Dados do carro" +
                "\n\tMarca: " + this.getMarca() +
                "\n\tModelo: " + this.getModelo() +
                "\n\tChassi: " + this.getChassi() +
                "\n\tAno Fabricação: " + this.getAnoFabricacao() +
                "\n\tAno Modelo: " + this.getAnoModelo() +
                "\n\tValor Unitario: " + this.getValorUnitario() +
                "\n\tQuantidade: " + this.getQuantidade() +
                "\n\tNivel Tanque: " + this.getNivelTanque() +
                "\n\tMédia Km Litro: " + this.getMediaKmLitro() +
                "\n\tTotal do veiculo: " + this.calcularValorTotalDoVeiculo();
    }
}
