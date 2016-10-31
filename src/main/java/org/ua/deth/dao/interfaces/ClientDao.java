package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Client;

import java.util.List;

public interface ClientDao {

    // Create
    public void createClient(Client client);

    //Show Client
    public Client showClient(long clientId);

    // Show all Clients for admin
    public List<Client> showAll();

    //remove Client
    public void removeClient(long clientId);

    //Update Client
    public void upadteClient(Client client);

}
