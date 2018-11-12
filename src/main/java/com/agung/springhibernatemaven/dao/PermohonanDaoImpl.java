/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Permohonan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public class PermohonanDaoImpl implements PermohonanDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Permohonan> getPermohonans() {
        return sessionFactory.getCurrentSession().createQuery("select l from Permohonan l").list();
    }

    @Override
    public Permohonan getPermohonan(Integer id) {
        return (Permohonan) sessionFactory.getCurrentSession().get(Permohonan.class, id);
    }

    @Override
    public Permohonan savePermohonan(Permohonan permohonan) {
        sessionFactory.getCurrentSession().save(permohonan);
        return permohonan;
    }

    @Override
    public Permohonan updatePermohonan(Permohonan permohonan) {
        sessionFactory.getCurrentSession().update(permohonan);
        return permohonan;
    }

    @Override
    public Permohonan deletePermohonan(Permohonan permohonan) {
        sessionFactory.getCurrentSession().delete(permohonan);
        return permohonan;
    }
    
    
}
