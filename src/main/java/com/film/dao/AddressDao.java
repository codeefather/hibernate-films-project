package com.film.dao;


import com.film.domain.Address;
import org.hibernate.SessionFactory;

public class AddressDao extends GenericDAO<Address> {
    public AddressDao(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
