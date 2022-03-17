package POO_Java_IV.sevices;

import POO_Java_IV.entites.Cliente;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Clientes {
    private Integer counter = 0;
    private HashMap<Integer, Cliente> clientes = new HashMap();

    public Clientes() {
    }

    public Clientes(HashMap<Integer, Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionaCLiente(String nome, String sobrenome) {
        counter += 1;
        Cliente clienteNovo = new Cliente(nome, sobrenome, counter);
        clientes.put(counter,clienteNovo);
        System.out.println("O cliente " + clienteNovo.getNome() + "foi adicionado a lista com ID " + counter);
    }

    public void removerCliente(Integer ID) {

        if (clientes.containsKey(ID)) {
            System.out.println("A pessoa cliente " + clientes.get(ID).getNome() + " foi removido da lista");
            clientes.remove(ID);
        }  else {
            System.out.println("Não existe um cliente registrado com ID " + ID);
        }

    }

    @Override
    public String toString() {
        String listaDeClientes = clientes.entrySet().stream().reduce("",(listaAcumulada, cliente) -> listaAcumulada + cliente.getValue() + '\n',String::concat);
        return "--------------Lista de Clientes--------------"+ '\n' +
                listaDeClientes;
    }

    public int quantidade() {
        return counter;
    }

    public HashMap<Integer, Cliente> backupClientes() {
        return clientes;
    }

    public Cliente buscarPorID (Integer ID) throws NullPointerException {
        if (!clientes.containsKey(ID)) {
            System.out.println("O ID consultado não corresponde a de um cliente registrado.");
        }
        return clientes.get(ID);
    }

    public Cliente buscarPorNome(String nome) throws NullPointerException {
        Iterator iterator = clientes.entrySet().iterator();
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
