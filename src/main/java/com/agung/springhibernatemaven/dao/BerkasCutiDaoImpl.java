/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;
import com.agung.springhibernatemaven.model.BerkasCuti;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Martin
 */
public class BerkasCutiDaoImpl implements BerkasCutiDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<BerkasCuti> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select bc from BerkasCuti bc").list();
    }

    @Override
    public BerkasCuti getById(Integer id) {
        return (BerkasCuti) sessionFactory.getCurrentSession().get(BerkasCuti.class, id);
    }

    @Override
    public BerkasCuti saveData(BerkasCuti berkasCuti) {
        sessionFactory.getCurrentSession().save(berkasCuti);
        return berkasCuti;
    }

    @Override
    public BerkasCuti updateData(BerkasCuti berkasCuti) {
        sessionFactory.getCurrentSession().update(berkasCuti);
        return berkasCuti;
    }

    @Override
    public BerkasCuti deleteData(BerkasCuti berkasCuti) {
        sessionFactory.getCurrentSession().delete(berkasCuti);
        return berkasCuti;
    }
}
