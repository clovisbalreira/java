package aula02_Caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tambada;

    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println(" está tampada? " + this.tambada);
    }

    void rabiscar(){
        if(this.tambada == true){
            System.out.println("ERRO! não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void tampar(){
        this.tambada = true;
    }

    void destampar(){
        this.tambada = false;
    }


}
