package com.film.dao;

import com.film.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDao extends GenericDAO<Actor>{
    public ActorDao(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
