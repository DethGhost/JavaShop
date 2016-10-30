package org.ua.deth.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.ua.deth.dao.interfaces.CountryDao;
import org.ua.deth.entitys.Country;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository("countryImpl")
public class CountryImpl implements CountryDao {

    @PersistenceContext
    private EntityManager manager;

    public void createCountry(Country country) {
        manager.persist(country);
    }

    public List<Country> showCountries() {
        return manager.createQuery("select c from Country c").getResultList();
    }

    public Country showById(long countryId) {
        return manager.find(Country.class, countryId);
    }

    public void removeCountry(long countryId) {
        manager.remove(showById(countryId));

    }

    public void updateCountry(Country country) {
        manager.merge(country);
    }
}
