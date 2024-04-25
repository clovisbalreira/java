package aula12_Animal_polimorfismo_sobreposicao;

public class Start {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMenbros(4);
        m.Locomover();
        m.Alimentar();
        m.EmitirSom();
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMenbros(4);
        c.Locomover();
        c.Alimentar();
        c.EmitirSom();
        c.UsarBolsa();
        k.setPeso(3.84f);
        k.setIdade(5);
        k.setMenbros(4);
        k.Locomover();
        k.Alimentar();
        k.EmitirSom();
        k.EnterrarOsso();
        k.AbanarRabo();
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMenbros(0);
        p.Locomover();
        p.Alimentar();
        p.EmitirSom();
        p.soltarBolha();
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMenbros(2);
        a.Locomover();
        a.Alimentar();
        a.EmitirSom();
        a.FazerNinho();
    }
}
