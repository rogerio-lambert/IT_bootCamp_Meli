package POO_Java_III.Exercicio3;

public class Gato extends Animal implements Carnivoro {
    public Gato() {
        super("gato");
    }

    @Override
    public void emitirSom() {
        System.out.println("miiiaaaaauuuu!!!");
    }

    @Override
    public void comer() {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("peixe vai bem, mas prefiro se for sache wiskas!");
    }
}
