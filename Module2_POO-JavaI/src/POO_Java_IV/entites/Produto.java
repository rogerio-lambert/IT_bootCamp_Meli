package POO_Java_IV.entites;

import java.util.UUID;

import java.math.BigDecimal;

public class Produto {
    private final UUID id = UUID.randomUUID();
    private String nome;
    private BigDecimal precoUnitario;

    public Produto( String nome, BigDecimal precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public UUID getId() {
        return id;
    }
}