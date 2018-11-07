/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.BerkasCuti;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface BerkasCutiDao {
    public List<BerkasCuti> getAll();
    public BerkasCuti getById(Integer id);
    public BerkasCuti saveData(BerkasCuti berkasCuti);
    public BerkasCuti updateData(BerkasCuti berkasCuti);
    public BerkasCuti deleteData(BerkasCuti berkasCuti);
}
