package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Country {
    @Id
    @SequenceGenerator(name = "country_id_seq", sequenceName = "country_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "country_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "country_id")
    private long countryId;


    @Column(unique = true)
    private String name;

   public Country() {

    }

    public long getCountryId() {
        return countryId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return getName();

    }
}
