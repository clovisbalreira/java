package br.com.clovis.carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        double distancia1;
        double tempo1;
        double distanciaPercorrida1;
        double distancia2;
        double tempo2;
        double distanciaPercorrida2;

        System.out.println("Informe os dados do 1º carro");
        System.out.print("Marca: ");
        carro1.setMarca(ler.next());
        System.out.print("Modelo: ");
        carro1.setModelo(ler.next());
        System.out.print("Chassi: ");
        carro1.setChassi(ler.next());
        System.out.print("Ano fabricação: ");
        carro1.setAnoFabricacao(ler.nextInt());
        System.out.print("Ano Modelo: ");
        carro1.setAnoModelo(ler.nextInt());
        System.out.print("Valor Unitario: ");
        carro1.setValorUnitario(ler.nextDouble());
        System.out.print("Quantidade: ");
        carro1.setQuantidade(ler.nextInt());
        System.out.print("Nível Tanque: ");
        carro1.setNivelTanque(ler.nextDouble());
        System.out.print("Média Km Litro: ");
        carro1.setMediaKmLitro(ler.nextDouble());
        System.out.print("Distancia percorrida: ");
        distancia1 = ler.nextDouble();
        System.out.print("Tempo percorrido: ");
        tempo1 = ler.nextDouble();
        distanciaPercorrida1 = carro1.calcularDistanciaAPercorrer(distancia1,tempo1);

        System.out.println("\nInforme os dados do 2º carro");
        System.out.print("Marca: ");
        carro2.setMarca(ler.next());
        System.out.print("Modelo: ");
        carro2.setModelo(ler.next());
        System.out.print("Chassi: ");
        carro2.setChassi(ler.next());
        System.out.print("Ano fabricação: ");
        carro2.setAnoFabricacao(ler.nextInt());
        System.out.print("Ano Modelo: ");
        carro2.setAnoModelo(ler.nextInt());
        System.out.print("Valor Unitario: ");
        carro2.setValorUnitario(ler.nextDouble());
        System.out.print("Quantidade: ");
        carro2.setQuantidade(ler.nextInt());
        System.out.print("Nível Tanque: ");
        carro2.setNivelTanque(ler.nextDouble());
        System.out.print("Média Km Litro: ");
        carro2.setMediaKmLitro(ler.nextDouble());
        System.out.print("Distancia percorrida: ");
        distancia2 = ler.nextDouble();
        System.out.print("Tempo percorrido: ");
        tempo2 = ler.nextDouble();
        distanciaPercorrida2 = carro2.calcularDistanciaAPercorrer(distancia2,tempo2);

        System.out.println("\n" + carro1);
        System.out.println("\tDistancia Percorrida: " + distanciaPercorrida1 + " KM");
        System.out.println("\n" + carro2);
        System.out.println("\tDistancia Percorrida: " + distanciaPercorrida2 + " KM");

    }
}
