package POO_Java_III.Exercicio3;

public abstract class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public abstract void emitirSom();

    public abstract void comer();
}
