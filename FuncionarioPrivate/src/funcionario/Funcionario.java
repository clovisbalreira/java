package funcionario;

public class Funcionario {
    private String nome;
    private long cpf;
    private float valorHora;
    private float cargaHorariaMes;

    public float calcularSalarioBase(){
        return this.valorHora * this.cargaHorariaMes;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getCargaHorariaMes() {
        return cargaHorariaMes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void setCargaHorariaMes(float cargaHorariaMes) {
        this.cargaHorariaMes = cargaHorariaMes;
    }

    public String toString(){
        return "O funcionario : "+ this.getNome() + "\nCpf: " + this.getCpf() + "\nValor Hora: " + this.getValorHora() + "\nHoras mensais: " + this.getCargaHorariaMes() + "\nSeu salário é R$: " + this.calcularSalarioBase();
    }
}
