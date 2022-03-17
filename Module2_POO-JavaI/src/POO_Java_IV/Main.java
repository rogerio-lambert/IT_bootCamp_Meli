package POO_Java_IV;

import POO_Java_IV.entites.Fatura;
import POO_Java_IV.entites.Item;
import POO_Java_IV.sevices.SuperMercado;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperMercado clientesSuper =  new SuperMercado();
        clientesSuper.adicionaCLiente("Joselito", "Silva");
        clientesSuper.adicionaCLiente("Simas","Turbando");
        clientesSuper.adicionaCLiente("Paula", "Tejano");
        Item escova = new Item("9182hsui102","escova colgate",3f, BigDecimal.valueOf(30));
        Item arroz = new Item("jshdfk20238754","Arroz camil", 3, BigDecimal.valueOf(4));
        Item chocolate = new Item("jshdkhfks2342","chocolate garoto amendoim", 6, BigDecimal.valueOf(4));
        List<Item> itensComprados = Arrays.asList(escova, arroz, chocolate);
        Fatura compraJoselito = new Fatura(itensComprados, clientesSuper.buscarPorNome("Joselito"));
        Fatura compraSimas = new Fatura(Arrays.asList(escova, chocolate), clientesSuper.buscarPorNome("Simas"));
        compraJoselito.imprime();
        compraSimas.imprime();
        System.out.println(clientesSuper.quantidade());
        System.out.println(clientesSuper);
        clientesSuper.removerCliente(3);
        System.out.println(clientesSuper);
        System.out.println(clientesSuper.buscarPorID(3));

    }
}
