package com.film.dao;


import com.film.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDao extends GenericDAO<Staff> {
    public StaffDao(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
