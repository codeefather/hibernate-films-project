package com.film.dao;

import com.film.domain.Payment;
import org.hibernate.SessionFactory;

public class PaymentDao extends GenericDAO<Payment> {
    public PaymentDao(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
