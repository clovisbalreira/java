package model;

import java.util.Scanner;

public class Pessoa {
    Scanner ler = new Scanner(System.in);
    //atributos
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private boolean cartao;
    private double limite;

    //metodo assessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //metodo
    public String cartao(){
        if(this.getLimite() == 0){
            return "Não Possui cartão";
        }else if(this.isCartao()){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public boolean limiteCartao(double valor){
        boolean limite = false;
        if(valor >= 500){
            limite = true;
        }
        return limite;
    }

    public void validarIdade(){
        do {
            System.out.println("Idade : ");
            this.setIdade(ler.nextInt());
            if (this.getIdade() < 18) {
                System.out.println("Você é melhor de idade.");
            }
        } while (this.getIdade() < 18);
    }

    public void validarCpf(){
        int count = 0;
        do {
            System.out.println("C.P.F. : ");
            this.setCpf(ler.nextLine());
            if(count == 0){
                this.setCpf(ler.nextLine());
                count++;
            }
            if (!(this.getCpf().length() >= 6 && this.getCpf().length() <= 11)) {
                System.out.println("C.P.F. invalido.\nDigite o C.P.F. com seis até 11 digitos.");
            }
        } while (!(this.getCpf().length() >= 6 && this.getCpf().length() <= 10));
    }

    public void validarTelefone(){
        int count = 0;
        do {
            System.out.println("Telefone : ");
            this.settelefone(ler.nextLine());
            if(count == 1){
                this.settelefone(ler.nextLine());
                count++;
            }
            if (!(this.getTelefone().length() == 11)) {
                System.out.println("Telefone invalido.\nDigite o telefone com 11 digitos.");
            }
        } while (!(this.getTelefone().length() == 11));
    }

    public void validarCartao(){
        int count = 0;
        int escolha;
        do {
            System.out.println("Possui cartão :\n1: Possui\n2: Não possui ");
            escolha = ler.nextInt();
            if(count == 1){
                escolha = ler.nextInt();
                count++;
            }
            switch (escolha) {
                case 1:
                    System.out.println("Digite o Limite do seu cartão: ");
                    this.setLimite(ler.nextInt());
                    this.setCartao(limiteCartao(this.getLimite()));
                    break;
                case 2:
                    this.setCartao(false);
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (!(escolha == 1 || escolha == 2));
    }

    //toString
    @Override
    public String toString() {
        return "\nDADOS PESSOAIS" +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCpf: " + this.cpf +
                "\nTelefone: " + this.telefone +
                "\nCartão: " + this.cartao() +
                "\n"
                ;
    }
}
