package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @SequenceGenerator(sequenceName = "address_id_seq", name = "address_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "address_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "address_id")
    private long addressId;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(length = 100)
    private String address;

    @Column(length = 10)
    private String postCode;

    @Column(length = 25)
    private String city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Address() {
    }

    public long getAddressId() {

        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    @Override
    public String toString() {

        return "\n"+"Street:\n"+getAddress()+
                "\n"+"City:\n"+getCity()+
                "\n"+"Post code:\n"+getPostCode()+
                "\n"+"Country:\n"+getCountry();
    }

}
