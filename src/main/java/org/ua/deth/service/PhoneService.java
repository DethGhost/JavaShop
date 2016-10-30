package org.ua.deth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ua.deth.dao.PhoneImpl;
import org.ua.deth.dao.interfaces.PhoneDao;
import org.ua.deth.entitys.Client;
import org.ua.deth.entitys.Phone;

import java.util.List;

@Service
public class PhoneService implements PhoneDao {

    @Autowired
    private PhoneImpl phoneImpl;

    public List<Phone> showAll() {
        return phoneImpl.showAll();
    }

    public Phone showById(long phoneId) {
        return phoneImpl.showById(phoneId);
    }

    public void updatePhone(Phone phone) {
        phoneImpl.updatePhone(phone);
    }

    public void deletePhone(long phoneId) {
        phoneImpl.deletePhone(phoneId);
    }

    public List showByClient(Client client) {
        return phoneImpl.showByClient(client);
    }
}
