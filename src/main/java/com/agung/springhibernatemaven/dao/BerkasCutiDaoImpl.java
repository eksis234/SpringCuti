/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.BerkasCuti;
import com.agung.springhibernatemaven.model.JenisCuti;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public class BerkasCutiDaoImpl implements BerkasCutiDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<BerkasCuti> getBerkasCutis() {
        return sessionFactory.getCurrentSession().createQuery("select l from BerkasCuti l").list();
    }

    @Override
    public BerkasCuti getBerkasCuti(Integer id) {
        return (BerkasCuti) sessionFactory.getCurrentSession().get(BerkasCuti.class, id);
    }

    @Override
    public BerkasCuti saveBerkasCuti(BerkasCuti berkasCuti) {
        sessionFactory.getCurrentSession().save(berkasCuti);
        return berkasCuti;
    }

    @Override
    public BerkasCuti updateBerkasCuti(BerkasCuti berkasCuti) {
        sessionFactory.getCurrentSession().update(berkasCuti);
        return berkasCuti;
    }

    @Override
    public BerkasCuti deleteBerkasCuti(BerkasCuti berkasCuti) {
        sessionFactory.getCurrentSession().delete(berkasCuti);
        return berkasCuti;
    }
    
    
}
