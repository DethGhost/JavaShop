package org.ua.deth.entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category implements Serializable{
    @Id
    @SequenceGenerator(name = "category_id_seq", sequenceName = "category_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "category_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "category_id")
    private long categoryId;

    @Column(length = 50)
    private String name;

    @Column(length = 250)
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column
    private String keywords;

    @ManyToMany
    private List<Product> productList = new ArrayList();

    @OneToMany(mappedBy = "category", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<SubCategory> subCategoryList = new ArrayList();;

    public Category() {
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<SubCategory> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<SubCategory> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }


}
