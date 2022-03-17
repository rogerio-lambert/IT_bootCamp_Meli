package POO_Java_IV.repository.implementations;

import POO_Java_IV.entites.Cliente;

import POO_Java_IV.repository.CRUDRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClientesRepo implements CRUDRepository<Cliente, UUID> {
    Map<UUID, Cliente> clientes = new HashMap();

    @Override
    public void create(Cliente entity) {
        clientes.put(entity.getId(), entity);
    }

    @Override
    public void update(UUID ID, Cliente entity) {
        clientes.put(ID, entity);
    }

    @Override
    public void remove(UUID ID) {
        clientes.remove(ID);
    }

    @Override
    public Cliente get(UUID ID) {
        return clientes.get(ID);
    }

    public Map<UUID, Cliente> getClientes() {
        return clientes;
    }
}
