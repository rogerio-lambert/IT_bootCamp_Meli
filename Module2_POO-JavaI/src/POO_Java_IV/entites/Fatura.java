package POO_Java_IV.entites;

import POO_Java_IV.entites.Cliente;
import POO_Java_IV.entites.Item;

import java.math.BigDecimal;
import java.util.List;

public class Fatura {
    private List<Item> itensComprados;
    private Cliente cliente;

    public Fatura(List<Item> itemsComprados, Cliente cliente) {
        this.itensComprados = itemsComprados;
        this.cliente = cliente;
    }

    public BigDecimal totalDaCompra() {
        return itensComprados.stream().reduce(new BigDecimal(0),(subTotal, item) -> subTotal.add(item.preco()), BigDecimal::add);
    }

    public void adicionaItem(Item item) {
        itensComprados.add(item);
    }

    public void imprime() {
        System.out.println("-------------------Cupom Fiscal-------------------");
        System.out.println(cliente);
        System.out.println("-----------------Itens comprados------------------");
        itensComprados.stream().forEach(System.out::println);
        System.out.println("                          Total da compra: R$ " + totalDaCompra());
    }

}
