package org.ua.deth.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.ua.deth.dao.interfaces.ClientDao;
import org.ua.deth.entitys.Client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@Repository("clientImpl")
public class ClientImpl implements ClientDao {


    @PersistenceContext(unitName = "JavaShop", type = PersistenceContextType.EXTENDED)
    private EntityManager factory;

    @Transactional
    public void createClient(Client client) {

        factory.persist(client);

    }

    @Transactional
    public Client showClient(long clientId) {
        return factory.find(Client.class, clientId);
    }


    @Transactional(readOnly = true)
    public List<Client> showAll() {
        List<Client> clients = factory.createQuery("from Client").getResultList();
        return clients;
    }

    @Transactional
    public void removeClient(long clientId) {
        factory.remove(showClient(clientId));
    }

    @Transactional
    public void upadteClient(Client client) {
        factory.merge(client);
    }

    public EntityManager getFactory() {
        return factory;
    }

    public void setFactory(EntityManager factory) {
        this.factory = factory;
    }
}
