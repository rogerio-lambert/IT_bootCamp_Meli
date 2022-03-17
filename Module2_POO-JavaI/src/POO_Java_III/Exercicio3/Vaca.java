package POO_Java_III.Exercicio3;

public class Vaca extends Animal implements  Herbivoro{
    public Vaca() {
        super("vaca");
    }

    @Override
    public void emitirSom() {
        System.out.println("mooooouummm!!!");
    }

    @Override
    public void comer() {
        comerPasto();
    }

    @Override
    public void comerPasto() {
        System.out.println("opa, uma graminha verdinha vai bem pro almoço!!");
    }
}
