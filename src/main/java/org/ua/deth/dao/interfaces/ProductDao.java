package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Product;

import java.util.List;

public interface ProductDao {

    //Create
    public void createProduct(Product product);

    //Show all products
    public List<Product> showAll();

    // Show by id
    public void showById(long productId);

    //Update some product
    public void updateProduct(Product product);

    //Show product by category
    public void showByCategory(long categoryId);

    //Remove product by id
    public void removeById(long productId);



}
