package com.film.dao;

import com.film.domain.Rental;
import org.hibernate.SessionFactory;

public class RentalDao extends GenericDAO<Rental> {
    public RentalDao(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }
}
