package org.ua.deth.dao.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ua.deth.dao.factory.AddressImpl;
import org.ua.deth.dao.interfaces.AddressDao;
import org.ua.deth.entitys.Address;

import java.util.List;

@Service
public class AddressService implements AddressDao {

    @Autowired
    private AddressImpl addressImpl;

    public void createAddress(Address address) {
        addressImpl.createAddress(address);
    }

    public Address showAddressById(long addressId) {
        return addressImpl.showAddressById(addressId);
    }

    public List<AddressDao> showAll() {
        return addressImpl.showAll();
    }

    public void removeAddress(long addressId) {
        addressImpl.removeAddress(addressId);
    }

    public void updateAddress(Address address) {
        addressImpl.updateAddress(address);
    }
}
