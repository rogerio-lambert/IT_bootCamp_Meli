package POO_Java_IV.entites;

import java.math.BigDecimal;
import java.util.UUID;

public class Item {
    private final UUID id = UUID.randomUUID();
    private Produto produto;
    private float quantidade;

    public Item(Produto produto, float quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal preco() {
        return produto.getPrecoUnitario().multiply(BigDecimal.valueOf(quantidade));
    }

    @Override
    public String toString() {
        return "codigo= " + produto.getId() +
                ", nome= " + produto.getNome() + '\n' +
                ", quantidade= " + quantidade +
                ", precoUnitario= R$" + produto.getPrecoUnitario() +
                ", precoTotal= R$" + preco();
    }

    public UUID getId() {
        return id;
    }
}
