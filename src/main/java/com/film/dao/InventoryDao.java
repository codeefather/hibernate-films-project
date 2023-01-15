package com.film.dao;


import com.film.domain.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDao extends GenericDAO<Inventory> {
    public InventoryDao(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
