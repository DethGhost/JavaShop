package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Client;
import org.ua.deth.entitys.Phone;

import java.util.List;

/**
 * Created by DethGhost on 26.09.2016.
 */
public interface PhoneDao {

    public List<Phone> showAll();

    public Phone showById(long phoneId);

    public void updatePhone(Phone phone);

    public void deletePhone(long phoneId);

    public List showByClient(Client client);

}
