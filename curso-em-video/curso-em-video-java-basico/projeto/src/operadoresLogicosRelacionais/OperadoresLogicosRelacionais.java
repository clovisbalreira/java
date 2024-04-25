package operadoresLogicosRelacionais;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {
        int n1,n2,r;
        n1 = 14;
        n2 = 18;
        r = (n1>n2) ? n1 + n2:n1-n2;
        System.out.println(r);

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean re;
        re = (x<y ^y==z)?true : false;
        System.out.println(re);
        /*
         < : menor
         > : maior
         <= : menor ou igual
         >= : maior ou igual
         != : diferente

         && : e
         || : ou
         ^ : Exclusivamente uma
         ! : inverte a operação
         */
    }
}
