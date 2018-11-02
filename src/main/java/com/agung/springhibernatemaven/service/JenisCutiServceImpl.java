/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.dao.JenisCutiDao;
import com.agung.springhibernatemaven.model.JenisCuti;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Service
@Transactional
public class JenisCutiServceImpl implements JenisCutiService{
 
    @Autowired
    JenisCutiDao jenisCutiDao;

    public void setJenisCutiDao(JenisCutiDao jenisCutiDao) {
        this.jenisCutiDao = jenisCutiDao;
    }

    @Override
    public List<JenisCuti> getJenisCutis() {
        return jenisCutiDao.getJenisCutis();
    }

    @Override
    public JenisCuti getJenisCuti(Integer id) {
        return jenisCutiDao.getJenisCuti(id);
    }

    @Override
    public JenisCuti saveJenisCuti(JenisCuti jenisCuti) {
        return jenisCutiDao.saveJenisCuti(jenisCuti);
    }

    @Override
    public JenisCuti updateJenisCuti(JenisCuti jenisCuti) {
        return jenisCutiDao.updateJenisCuti(jenisCuti);
    }

    @Override
    public JenisCuti deleteJenisCuti(JenisCuti jenisCuti) {
        return jenisCutiDao.deleteJenisCuti(jenisCuti);
    }
    
    
}
