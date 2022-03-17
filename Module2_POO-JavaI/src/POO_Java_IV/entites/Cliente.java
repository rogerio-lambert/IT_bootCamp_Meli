package POO_Java_IV.entites;

import java.util.UUID;

public class Cliente {
    private final UUID id = UUID.randomUUID();
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "ID: " + id +", nome: " + nome + " " + sobrenome ;
    }
}
