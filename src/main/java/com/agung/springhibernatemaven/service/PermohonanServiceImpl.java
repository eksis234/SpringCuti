/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.dao.PermohonanDao;
import com.agung.springhibernatemaven.model.Permohonan;
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
public class PermohonanServiceImpl implements PermohonanService{
    @Autowired
    PermohonanDao permohonanDao;

    public void setPermohonanDao(PermohonanDao permohonanDao) {
        this.permohonanDao = permohonanDao;
    }

    @Override
    public List<Permohonan> getPermohonans() {
        return permohonanDao.getPermohonans();
    }

    @Override
    public Permohonan getPermohonan(Integer id) {
        return permohonanDao.getPermohonan(id);
    }

    @Override
    public Permohonan savePermohonan(Permohonan permohonan) {
        return permohonanDao.savePermohonan(permohonan);
    }

    @Override
    public Permohonan updatePermohonan(Permohonan permohonan) {
        return permohonanDao.updatePermohonan(permohonan);
    }

    @Override
    public Permohonan deletePermohonan(Permohonan permohonan) {
        return permohonanDao.deletePermohonan(permohonan);
    }
    
    
}
