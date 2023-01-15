package com.film.dao;


import com.film.domain.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDao extends GenericDAO<FilmText> {
    public FilmTextDao(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
