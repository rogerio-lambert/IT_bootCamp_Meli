package POO_Java_III.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Gato xanim = new Gato();
        Cachorro rex = new Cachorro();
        Vaca mimosa = new Vaca();
        xanim.comer();
        xanim.emitirSom();
        rex.emitirSom();
        rex.comerCarne();
        mimosa.comer();
        mimosa.emitirSom();
    }
}
