package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Cart {
    @Id
    @SequenceGenerator(name = "cart_id_seq", sequenceName = "cart_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "cart_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "cart_id")
    private long cartId;

    @OneToOne
    @JoinColumn(name = "fk_client_id", referencedColumnName = "client_id")
    private Client client;

    @OneToMany
    private List<Product> productList = new ArrayList();

    @Temporal(TemporalType.DATE)
    @Column(name = "date_added")
    private Date dateAdded;

    @Column
    private Integer quantity;

    public Cart() {
    }

    public Client getClient() {

        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
