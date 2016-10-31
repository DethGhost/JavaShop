package org.ua.deth.dao.interfaces;

import javax.persistence.EntityManager;

public interface DaoFactory {

    public EntityManager getEntityManager();

    public void persist(Object o);

    public void commit();

    public void close();


   }
