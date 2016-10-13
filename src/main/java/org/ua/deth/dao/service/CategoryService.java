package org.ua.deth.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ua.deth.dao.factory.CategoryImpl;
import org.ua.deth.dao.interfaces.CategoryDao;
import org.ua.deth.entitys.Category;

import java.util.List;

@Service
public class CategoryService implements CategoryDao {

    @Autowired
    private CategoryImpl categoryImpl;


    public void createCategory(Category category) {
        categoryImpl.createCategory(category);
    }

    public void updateCategory(Category category) {
        categoryImpl.updateCategory(category);
    }

    public List<Category> showCategories() {
        return categoryImpl.showCategories();
    }

    public Category showCategoryById(long categoryId) {
        return categoryImpl.showCategoryById(categoryId);
    }

    public void removeCategory(long categoryId) {
        categoryImpl.removeCategory(categoryId);
    }
}
