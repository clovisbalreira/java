package operadoresAritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = ( n1 + n2 ) / 2;
        System.out.println("A média das notas " + n1 + " e " + n2 + " é " + media);

        int numero = 5;
        numero++;
        System.out.println(numero);

        var pi = Math.PI;
        System.out.println("O número de pi é " + pi
        );
        var exponeciacao = Math.pow(5,2);
        System.out.println("O exponciação de 5 - 2 é " + exponeciacao);
        var raizQuadrada = Math.sqrt(25);
        System.out.println("A raiz quadrada de 25 é " + raizQuadrada);
        var raizCubica = Math.cbrt(27);
        System.out.println("A Raiz cubica de 27 é " + raizCubica);
        var valorAbsoluto = Math.abs(-10);
        System.out.println("O valor absoluto de -10 é " + valorAbsoluto);
        var valorArredondaParaBaixo = Math.floor(3.9);
        System.out.println("O valor 3.9 arrendonda para baixo é " + valorArredondaParaBaixo);
        var valorArredondaParaCima = Math.ceil(4.2);
        System.out.println("O valor 4.2 arrendonda para cima é " + valorArredondaParaCima);
        var valorArredondaAritmetica = Math.round(5.6);
        System.out.println("O valor 5.6 arredonda aritmetica é " + valorArredondaAritmetica);
        var valorAleeatorio = Math.round(5 + Math.random() * (10 - 5)) ;
        System.out.println("O valor aleatorio de 5 a 10 é " + valorAleeatorio);

    }
}
