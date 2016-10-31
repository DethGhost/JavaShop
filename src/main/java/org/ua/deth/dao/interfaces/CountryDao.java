package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Country;

import java.util.List;

public interface CountryDao {

    //Create
    public void createCountry(Country country);

    //Show countries
    public List<Country> showCountries();

    //Show country
    public Country showById(long countryId);

    //remove country
    public void removeCountry(long countryId);

    //update country
    public void updateCountry(Country country);
}
