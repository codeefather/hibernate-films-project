package com.film.dao;

import com.film.domain.Store;
import org.hibernate.SessionFactory;

public class StoreDao extends GenericDAO<Store> {
    public StoreDao(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
