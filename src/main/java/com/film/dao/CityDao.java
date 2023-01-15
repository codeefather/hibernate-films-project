package com.film.dao;


import com.film.domain.City;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

public class CityDao extends GenericDAO<City> {
    public CityDao(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String cityName) {
        Query<City> query = getCurrentSession()
                .createQuery("select c from City c where c.city = :NAME", City.class);
        query.setParameter("NAME", cityName);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
