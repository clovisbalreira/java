package aula11_Pessoa_HerancaTipo;

public class Start {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juju");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Jaja");
        a1.PagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.nome = "Hugo";
        b1.PagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Igor");
        t1.Praticar();
    }
}
