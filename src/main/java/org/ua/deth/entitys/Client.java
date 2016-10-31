package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
    @Id
    @SequenceGenerator(name = "client_id_seq", sequenceName = "client_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "client_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "client_id")
    private Long clientId;

    @OneToOne
    @JoinColumn(name = "fk_address_id", referencedColumnName = "address_id")
    private Address address;

    @Column
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orderList = new ArrayList();

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "clients", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phoneList = new ArrayList();

    public Client() {
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {

        return "Name:\n"+getFullName()+
                "\n"+"Address:\n"+getAddress()+
                "\n"+"Phones:\n"+getPhoneList()+
                "\n"+"Email:\n"+getEmail()+
                "\n"+"Order:\n"+getOrderList();
    }
}
