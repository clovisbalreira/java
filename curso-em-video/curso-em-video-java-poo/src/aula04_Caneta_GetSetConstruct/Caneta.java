package aula04_Caneta_GetSetConstruct;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m,String c,float p){
        this.cor = c;
        setModelo(m);
        setPonta(p);
        tampar();
    }

    public String getModelo(){
        return  this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m ;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p ;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("tambada: " + this.tampada);
    }

    public void tampar(){
       this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
