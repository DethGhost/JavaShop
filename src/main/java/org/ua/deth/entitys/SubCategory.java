package org.ua.deth.entitys;

import sun.swing.BakedArrayList;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "sub_category")
public class SubCategory{
    @Id
    @SequenceGenerator(name = "sub_category_id_seq", sequenceName = "sub_category_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "sub_category_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "sub_category_id")
    private long subCategoryId;

    @Column(length = 50)
    private String name;

    @Column(length = 250)
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column
    private String keywords;

    @OneToMany(mappedBy = "subCategory", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Product> productList = new ArrayList();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_category_id", referencedColumnName = "category_id")
    private Category category;

    public SubCategory() {
    }

    public long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(long subCategoryId) {
        this.subCategoryId = subCategoryId;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
