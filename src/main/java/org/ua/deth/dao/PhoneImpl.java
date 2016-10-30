package org.ua.deth.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.ua.deth.dao.interfaces.PhoneDao;
import org.ua.deth.entitys.Client;
import org.ua.deth.entitys.Phone;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional

@Repository("phoneImpl")
public class PhoneImpl implements PhoneDao {

    @PersistenceContext
    private EntityManager manager;

    public List<Phone> showAll() {
        return manager.createQuery("select p from Phone p").getResultList();
    }

    public Phone showById(long phoneId) {
        return manager.find(Phone.class, phoneId);
    }

    public void updatePhone(Phone phone) {
        manager.merge(phone);
    }

    public void deletePhone(long phoneId) {
        manager.remove(showById(phoneId));
    }

    public List<Phone> showByClient(Client client) {


        return manager.createQuery("select p from Phone p where p.clients =:client").setParameter("client", client).getResultList();
    }
}
