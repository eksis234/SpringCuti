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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Service
@Transactional
public class BerkasCutiServiceImpl implements BerkasCutiService{
    
    @Autowired
    BerkasCutiDao bcd;

    public void setBerkasCutiDao(BerkasCutiDao bcd) {
        this.bcd = bcd;
    }

    @Override
    public List<BerkasCuti> getBerkasCutis() {
        return bcd.getBerkasCutis();
    }

    @Override
    public BerkasCuti getBerkasCuti(Integer id) {
        return bcd.getBerkasCuti(id);
    }

    @Override
    public BerkasCuti saveBerkasCuti(BerkasCuti berkasCuti) {
        return bcd.saveBerkasCuti(berkasCuti);
    }

    @Override
    public BerkasCuti updateBerkasCuti(BerkasCuti berkasCuti) {
        return bcd.updateBerkasCuti(berkasCuti);
    }

    @Override
    public BerkasCuti deleteBerkasCuti(BerkasCuti berkasCuti) {
        return bcd.deleteBerkasCuti(berkasCuti);
    }
    
    
}
