package org.ua.deth.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ua.deth.dao.factory.CountryImpl;
import org.ua.deth.dao.interfaces.CountryDao;
import org.ua.deth.entitys.Country;

import java.util.List;

@Service
public class CountryService implements CountryDao {

    @Autowired
    private CountryImpl countryImpl;

    public void createCountry(Country country) {
        countryImpl.createCountry(country);
    }

    public List<Country> showCountries() {
        return countryImpl.showCountries();
    }

    public Country showById(long countryId) {
        return countryImpl.showById(countryId);
    }

    public void removeCountry(long countryId) {
        countryImpl.removeCountry(countryId);
    }

    public void updateCountry(Country country) {
        countryImpl.updateCountry(country);
    }
}
