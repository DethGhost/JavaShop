package org.ua.deth.dao;

import org.springframework.stereotype.Repository;
import org.ua.deth.dao.interfaces.CategoryDao;
import org.ua.deth.entitys.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("categoryImpl")
public class CategoryImpl implements CategoryDao{

    @PersistenceContext
    private EntityManager manager;

    public EntityManager getManager() {
        return manager;
    }

    public void setManager(EntityManager manager) {
        this.manager = manager;
    }

    public void createCategory(Category category) {
        manager.persist(category);
    }

    public void updateCategory(Category category) {
        manager.merge(category);

    }

    public List<Category> showCategories() {
        return manager.createQuery("select c from Category c").getResultList();
    }

    public Category showCategoryById(long categoryId) {

        return manager.find(Category.class, categoryId);

    }

    public void removeCategory(long categoryId) {
        manager.remove(showCategoryById(categoryId));
    }


}
