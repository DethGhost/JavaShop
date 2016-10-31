package org.ua.deth.entitys;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    @SequenceGenerator(name = "phone_id_seq", sequenceName = "phone_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "phone_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "phone_id")
    private long phoneId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client_id", referencedColumnName = "client_id")
    private Client clients;

    @Column
    private String phone;



    public long getPhoneId() {
        return phoneId;
    }

    public Client getClient() {
        return clients;
    }

    public void setClient(Client client) {
        this.clients = client;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Phone() {
    }

    public Client getClients() {

        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }

    public void setPhoneId(long phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public String toString() {

        return getPhone();
    }
}
