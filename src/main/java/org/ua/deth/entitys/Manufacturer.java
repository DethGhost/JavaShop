package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Manufacturer {
    @Id
    @SequenceGenerator(name = "manufacturer_id_seq", sequenceName = "manufacturer_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "manufacturer_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "manufacturer_id")
    private long manufacturerId;

    @Column
    private String name;

    public Manufacturer() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Column(name = "logo_url")
    private String logoUrl;

    @OneToMany(mappedBy = "manufacturer")
    private List<Product> productList = new ArrayList();

    public long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }


}
