/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Departemen;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public class DepartemenDaoImpl implements DepartemenDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Departemen> getAll() {
        return sessionFactory.getCurrentSession().createQuery("select l from Departemen l").list();
    }

    @Override
    public Departemen getById(Integer id) {
        return (Departemen) sessionFactory.getCurrentSession().get(Departemen.class, id);
    }

    @Override
    public Departemen saveData(Departemen departemen) {
        sessionFactory.getCurrentSession().save(departemen);
        return departemen;
    }

    @Override
    public Departemen updateData(Departemen departemen) {
        sessionFactory.getCurrentSession().update(departemen);
        return departemen;
    }

    @Override
    public Departemen deleteData(Departemen departemen) {
        sessionFactory.getCurrentSession().delete(departemen);
        return departemen;
    }
    
    
}
