package aula03_Caneta_PublicPriveteProtected;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tambada;

    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println(" está tampada? " + this.tambada);
    }

    public void rabiscar(){
        if(this.tambada == true){
            System.out.println("ERRO! não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    private void tampar(){
        this.tambada = true;
    }

    private void destampar(){
        this.tambada = false;
    }


}
