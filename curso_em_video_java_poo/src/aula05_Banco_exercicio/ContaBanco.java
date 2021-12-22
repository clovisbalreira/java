package aula05_Banco_exercicio;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("Conta: " +  this.getNumConta());
        System.out.println("Tipo: " +  this.getTipo());
        System.out.println("Dono: " +  this.getDono());
        System.out.println("Saldo: " +  this.getSaldo());
        System.out.println("Status: " +  this.isStatus());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta tem dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em debito");
        }else{
            setStatus(false);
            System.out.println("Conta fechada");
        }
    }
    public void depositar(double v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso " + getDono());
        }else{
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(double v){
        if(this.isStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta do " + getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.isStatus()) {
               setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga");
            } else {
                System.out.println("Saldo Insuficiente");
            }
    }
}
