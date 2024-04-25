package aula11_Pessoa_HerancaTipo;

public class Tecnico extends Aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void Praticar(){
        System.out.println(this.nome + " está trabalhando como autonomo");
    }
}
