package com.film.dao;


import com.film.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDao extends GenericDAO<Customer> {
    public CustomerDao(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
