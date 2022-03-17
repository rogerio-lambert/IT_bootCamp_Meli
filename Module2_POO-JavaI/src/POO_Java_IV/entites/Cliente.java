package POO_Java_IV;

public class Cliente {
    private int ID;
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome, int ID) {
        this.ID = ID;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return  "ID: " + ID +", nome: " + nome + " " + sobrenome ;
    }
}
