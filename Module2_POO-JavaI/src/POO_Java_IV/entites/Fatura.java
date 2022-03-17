package POO_Java_IV.entites;

import POO_Java_IV.entites.Cliente;
import POO_Java_IV.entites.Item;
import POO_Java_IV.repository.implementations.ItemRepo;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Fatura {
    private final UUID id = UUID.randomUUID();
    private ItemRepo itensComprados;
    private Cliente cliente;

    public Fatura(ItemRepo itemsComprados, Cliente cliente) {
        this.itensComprados = itemsComprados;
        this.cliente = cliente;
    }

    public BigDecimal totalDaCompra() {
        return itensComprados
                .getItens()
                .entrySet()
                .stream()
                .reduce(new BigDecimal(0),(subTotal, item) -> subTotal.add(item.getValue().preco()), BigDecimal::add);
    }

    public void adicionaItem(Item item) {
        itensComprados.create(item);
    }

    public void imprime() {
        System.out.println("-------------------Cupom Fiscal-------------------");
        System.out.println(cliente);
        System.out.println("-----------------Itens comprados------------------");
        itensComprados.getItens().entrySet().stream().forEach((item) -> System.out.println(item.getValue()));
        System.out.println("                          Total da compra: R$ " + totalDaCompra());
    }

    @Override
    public String toString() {
        String relatorioFatura = "Fatura ("+id+")\n-------------------Cupom Fiscal-------------------\n";
        relatorioFatura.concat(cliente.toString() + "\n");
        relatorioFatura.concat("-----------------Itens comprados------------------\n");
        relatorioFatura.concat(itensComprados
                .getItens()
                .entrySet()
                .stream()
                .reduce("",(lista, item) -> lista.concat(item.getValue().toString() + "\n"), String::concat)
        );
        relatorioFatura.concat("                          Total da compra: R$ " + totalDaCompra());
        return relatorioFatura;
    }

    public UUID getId() {
        return id;
    }
}
