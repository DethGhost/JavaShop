package org.ua.deth.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.ua.deth.dao.interfaces.AddressDao;
import org.ua.deth.entitys.Address;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AddressImpl implements AddressDao {

    @PersistenceContext
    private EntityManager manager;

    public EntityManager getManager() {
        return manager;
    }

    public void setManager(EntityManager manager) {
        this.manager = manager;
    }

    @Transactional
    public void createAddress(Address address) {
        manager.persist(address);
    }

    @Transactional
    public Address showAddressById(long addressId) {
        return manager.find(Address.class, addressId);
    }

    @Transactional
    public List<AddressDao> showAll() {
        return manager.createQuery("select a from Address a").getResultList();
    }

    @Transactional
    public void removeAddress(long addressId) {
        manager.remove(showAddressById(addressId));
    }

    @Transactional
    public void updateAddress(Address address) {
        manager.merge(address);
    }
}
