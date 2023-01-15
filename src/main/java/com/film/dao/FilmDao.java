package com.film.dao;

import com.film.domain.Film;
import org.hibernate.SessionFactory;

public class FilmDao extends GenericDAO<Film> {
    public FilmDao(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}
