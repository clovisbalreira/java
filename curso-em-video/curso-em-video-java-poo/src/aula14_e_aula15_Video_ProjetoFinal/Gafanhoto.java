package aula14_e_aula15_Video_ProjetoFinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssitindo;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitindo() {
        return totAssitindo;
    }

    public void setTotAssitindo(int totAssitindo) {
        this.totAssitindo = totAssitindo;
    }

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitindo = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                super.toString() +
                ", login='" + login + '\'' +
                ", totAssitindo=" + totAssitindo +
                '}';
    }

    public void viuMaisUm(){
        this.totAssitindo++;
    }
}
