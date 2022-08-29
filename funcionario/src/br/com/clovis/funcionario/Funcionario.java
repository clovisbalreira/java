package br.com.clovis.funcionario;

public class Funcionario {
    public String nome;
    public long cpf;
    public float valorHora;
    public float cargaHorariaMes;

    public float calcularSalarioBase(){
        return this.valorHora * this.cargaHorariaMes;
    }

    public String toString(){
        float salario = calcularSalarioBase();
        return "O funcionario : "+ this.nome + "\nCpf: " + this.cpf + "\nSeu salário é R$: " + salario;
    }
}
