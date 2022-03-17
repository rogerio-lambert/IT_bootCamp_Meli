package POO_Java_IV;

import java.math.BigDecimal;

public class Item {
    private String codigo;
    private String nome;
    private float quantidade;
    private BigDecimal precoUnitario;

    public Item(String codigo, String nome, float quantidade, BigDecimal precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal preco() {
        return precoUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    @Override
    public String toString() {
        return  "codigo= " + codigo  +
                ", nome= " + nome + '\n' +
                ", quantidade= " + quantidade +
                ", precoUnitario= R$" + precoUnitario +
                ", precoTotal= R$" + preco();
    }
}
