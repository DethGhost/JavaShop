package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "orders")
public class Order {
    @Id
    @SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "order_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "order_id")
    private long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client_id", referencedColumnName = "client_id")
    private Client client;

    @Column(name = "full_name")
    private String fullName;

    @Column
    private String phone;

    @Column
    private Double total;

    @ManyToMany
    @JoinColumn(name = "fk_product_id", referencedColumnName = "product_id")
    private List<Product> productList = new ArrayList();

    @Temporal(TemporalType.DATE)
    @Column(name = "date_order")
    private Date dateOrder;

    public Order() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    @Override
    public String toString() {

        return "Date:\n"+getDateOrder()+
                "\n"+"Products:\n"+getProductList()+
                "\n"+"Total:\n"+getTotal();

    }
}
