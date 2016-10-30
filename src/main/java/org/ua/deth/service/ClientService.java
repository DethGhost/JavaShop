package org.ua.deth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ua.deth.dao.ClientImpl;
import org.ua.deth.dao.interfaces.ClientDao;
import org.ua.deth.entitys.Client;

import java.util.List;

@Service
public class ClientService implements ClientDao {

    @Autowired
    ClientImpl clientImpl;

    public void createClient(Client client) {
        clientImpl.createClient(client);
    }

    public Client showClient(long clientId) {
        return clientImpl.showClient(clientId);
    }

    public List<Client> showAll() {
        return clientImpl.showAll();
    }

    public void removeClient(long clientId) {
        clientImpl.removeClient(clientId);
    }

    public void upadteClient(Client client) {
        clientImpl.upadteClient(client);
    }
}
