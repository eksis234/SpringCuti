/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Karyawan;
import com.agung.springhibernatemaven.model.Lagu;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public class KaryawanDaoImpl implements KaryawanDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Karyawan> getKaryawans() {
        return sessionFactory.getCurrentSession().createQuery("select l from Karyawan l").list();
    }

    @Override
    public Karyawan getKaryawan(Integer id) {
        return (Karyawan) sessionFactory.getCurrentSession().get(Karyawan.class, id);
    }

    @Override
    public Karyawan saveKaryawan(Karyawan karyawan) {
        sessionFactory.getCurrentSession().save(karyawan);
        return karyawan;
    }

    @Override
    public Karyawan updateKaryawan(Karyawan karyawan) {
        sessionFactory.getCurrentSession().update(karyawan);
        return karyawan;
    }

    @Override
    public Karyawan deleteKaryawan(Karyawan karyawan) {
        sessionFactory.getCurrentSession().delete(karyawan);
        return karyawan;
    }
    
    
}
