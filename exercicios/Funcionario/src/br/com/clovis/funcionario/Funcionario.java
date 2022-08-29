package br.com.clovis.funcionario;
public class Funcionario {
    private String nome;
    private double valorHora;
    private double cargaHorariaMes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHorariaMes() {
        return cargaHorariaMes;
    }

    public void setCargaHorariaMes(double cargaHorariaMes) {
        this.cargaHorariaMes = cargaHorariaMes;
    }

    public double calculaSalario(){
        return this.getValorHora() * this.getCargaHorariaMes();
    }

    @Override
    public String toString() {
        return "Funcionario " +
                "\n\tNome: " + this.getNome() +
                "\n\tValor Hora: " + this.getValorHora() +
                "\n\tCarga Horaria Mês: " + this.getCargaHorariaMes() +
                "\n\tSalário: " + this.calculaSalario();
    }
}
