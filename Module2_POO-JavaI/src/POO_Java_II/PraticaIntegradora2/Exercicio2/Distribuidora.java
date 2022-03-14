package POO_Java_II.PraticaIntegradora2.Exercicio1.Exercicio2;

import java.util.ArrayList;

public class Distribuidora {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void inserirProduto(Produto produto) {
        produtos.add(produto);
    }

    public void obterPrecoTotal() {
        Double totalPrice = 0d;
        for (Produto n : produtos) {
            totalPrice += n.calcular(5);
        }
        System.out.println("Preço total: " + totalPrice);
    }
}
