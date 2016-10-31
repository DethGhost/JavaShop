package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Option {
    @Id
    @SequenceGenerator(name = "option_id_seq", sequenceName = "option_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "option_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "option_id")
    private long optionId;

    @Column
    private String name;

    @Column(name = "option_name")
    private String optionName;

    @Column(name = "option_value")
    private String optionValue;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Product> productList = new ArrayList();

    public Option() {
    }

    public long getOptionId() {
        return optionId;
    }

    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
