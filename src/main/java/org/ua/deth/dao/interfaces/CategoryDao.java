package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Category;

import java.util.List;

public interface CategoryDao {

    //Create Category
    public void createCategory(Category category);

    // Update category
    public void updateCategory(Category category);

    // Show all categories
    public List<Category> showCategories();

    // Show category by id
    public Category showCategoryById(long categoryId);

    //Remove category
    public void removeCategory(long categoryId);

}
