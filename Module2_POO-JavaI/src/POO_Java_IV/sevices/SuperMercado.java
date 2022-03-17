package POO_Java_IV.sevices;

import POO_Java_IV.entites.Cliente;
import POO_Java_IV.repository.implementations.ClientesRepo;
import POO_Java_IV.repository.implementations.FaturasRepo;
import POO_Java_IV.repository.implementations.ProdutoRepo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class SuperMercado {
    private ClientesRepo clientes = new ClientesRepo();
    private ProdutoRepo produtos = new ProdutoRepo();
    private FaturasRepo faturas = new FaturasRepo();

    public SuperMercado() {
    }

    public void adicionaCLiente(String nome, String sobrenome) {
        Cliente clienteNovo = new Cliente(nome, sobrenome);
        clientes.create(clienteNovo);
        System.out.println("O cliente " + clienteNovo.getNome() + "foi adicionado a lista com ID " + clienteNovo.getId());
    }

    public void removerCliente(UUID ID) {

        if (clientes.getClientes().containsKey(ID)) {
            System.out.println("A pessoa cliente " + clientes.get(ID).getNome() + " foi removido da lista");
            clientes.remove(ID);
        }  else {
            System.out.println("Não existe um cliente registrado com ID " + ID);
        }

    }


    public void imprimeClientes() {
        String listaDeClientes = clientes
                .getClientes()
                .entrySet()
                .stream()
                .reduce("",(listaAcumulada, cliente) -> listaAcumulada + cliente.getValue().toString() + '\n',String::concat);
        System.out.println("--------------Lista de Clientes--------------\n" + listaDeClientes);
    }

    public void imprimeFaturas() {
        String listaDeFaturas = faturas
                .getFaturas()
                .entrySet()
                .stream()
                .reduce("",(listaAcumulada, fatura) -> listaAcumulada + fatura.getValue().toString() + '\n',String::concat);
        System.out.println("--------------Lista de Faturas--------------\n" + listaDeFaturas);
    }

    public void imprimeProdutos() {
        String listaDeProdutos = produtos
                .getProdutos()
                .entrySet()
                .stream()
                .reduce("",(listaAcumulada, fatura) -> listaAcumulada + fatura.getValue().toString() + '\n',String::concat);
        System.out.println("--------------Lista de Produtos--------------\n" + listaDeProdutos);
    }


    public HashMap<Integer, Cliente> backupClientes() {
        return clientes;
    }

    public Cliente buscarPorID (UUID ID) throws NullPointerException {
        if (!clientes.getClientes().containsKey(ID)) {
            System.out.println("O ID consultado não corresponde a de um cliente registrado.");
        }
        return clientes.get(ID);
    }

    public void criarFarura(Cliente cliente) {

    }

    public Cliente buscarPorNome(String nome) throws NullPointerException {
        Iterator iterator = clientes.getClientes().entrySet().iterator();
        Cliente clienteBuscado = new Cliente();
        boolean clienteExite = false;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Cliente> registroDoCliente = (Map.Entry) iterator.next();
            if (registroDoCliente.getValue().getNome() == nome) {
                clienteBuscado = registroDoCliente.getValue();
                clienteExite = true;
            }
        }
        if (!clienteExite) {
            System.out.println("Näo existe um cliente registrado com nome" + nome);
        }
        return clienteBuscado;
    }
}
