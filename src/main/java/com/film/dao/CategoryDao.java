package com.film.dao;


import com.film.domain.Category;
import org.hibernate.SessionFactory;

public class CategoryDao extends GenericDAO<Category> {
    public CategoryDao(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
