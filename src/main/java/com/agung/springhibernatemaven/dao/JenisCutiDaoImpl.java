/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

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
public class JenisCutiDaoImpl implements JenisCutiDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<JenisCuti> getJenisCutis() {
        return sessionFactory.getCurrentSession().createQuery("select l from JenisCuti l").list();
    }

    @Override
    public JenisCuti getJenisCuti(Integer id) {
        return (JenisCuti) sessionFactory.getCurrentSession().get(JenisCuti.class, id);
    }

    @Override
    public JenisCuti saveJenisCuti(JenisCuti jenisCuti) {
        sessionFactory.getCurrentSession().save(jenisCuti);
        return jenisCuti;
    }
    
    @Override
    public JenisCuti updateJenisCuti(JenisCuti jenisCuti) {
        sessionFactory.getCurrentSession().update(jenisCuti);
        return jenisCuti;
    }

    @Override
    public JenisCuti deleteJenisCuti(JenisCuti jenisCuti) {
        sessionFactory.getCurrentSession().delete(jenisCuti);
        return jenisCuti;
    }
    
}
