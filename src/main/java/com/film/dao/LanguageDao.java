package com.film.dao;

import com.film.domain.Inventory;
import com.film.domain.Language;
import org.hibernate.SessionFactory;

public class LanguageDao extends GenericDAO<Language> {
    public LanguageDao(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
