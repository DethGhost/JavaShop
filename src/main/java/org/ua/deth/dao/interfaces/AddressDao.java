package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Address;

import java.util.List;

public interface AddressDao {

    public void createAddress(Address address);

    public Address showAddressById(long addressId);

    public List<AddressDao> showAll();

    public void removeAddress(long addressId);

    public void updateAddress(Address address);
}
