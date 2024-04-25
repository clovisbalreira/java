package aula11_Pessoa_HerancaTipo;

public class Bolsista extends Aluno{
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa " + this.nome);
    }
    @Override
    public void PagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento Facilidado");
    }
}
