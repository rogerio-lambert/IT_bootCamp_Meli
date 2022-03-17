package POO_Java_III.Exercicio3;

public class Cachorro extends Animal implements Carnivoro{
    public Cachorro() {
        super("cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auauauauauau!");
    }

    @Override
    public void comer() {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("como a carne e o osso também!");
    }
}
