/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.dao.BerkasCutiDao;
import com.agung.springhibernatemaven.model.BerkasCuti;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Martin
 */
public class BerkasCutiServiceImpl implements BerkasCutiService{

    @Autowired
    BerkasCutiDao berkasCutiDao;

    public BerkasCutiServiceImpl(BerkasCutiDao berkasCutiDao) {
        this.berkasCutiDao = berkasCutiDao;
    }

    @Override
    public List<BerkasCuti> getAll() {
        return berkasCutiDao.getAll();
    }

    @Override
    public BerkasCuti getById(Integer id) {
        return berkasCutiDao.getById(id);
    }

    @Override
    public BerkasCuti saveData(BerkasCuti berkasCuti) {
        return berkasCutiDao.saveData(berkasCuti);
    }

    @Override
    public BerkasCuti updateData(BerkasCuti berkasCuti) {
        return berkasCutiDao.updateData(berkasCuti);
    }

    @Override
    public BerkasCuti deleteData(BerkasCuti berkasCuti) {
        return berkasCutiDao.deleteData(berkasCuti);
    }
}
