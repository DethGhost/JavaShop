package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Product {
    @Id
    @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "product_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id")
    private long productId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Double price;

    @Column
    private Integer quantity;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_category_id", referencedColumnName = "category_id")
    private List<Category> categoryList = new ArrayList();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_sub_category_id", referencedColumnName = "sub_category_id")
    private SubCategory subCategory;

    @ManyToOne
    @JoinColumn(name = "fk_manufacturer_id", referencedColumnName = "manufacturer_id")
    private Manufacturer manufacturer;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_added")
    private Date dateAdded;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_option_id", referencedColumnName = "option_id")
    private List<Option> optionList = new ArrayList();

    public Product() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }


}
