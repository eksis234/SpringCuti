/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.model.BerkasCuti;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface BerkasCutiService {
    public List<BerkasCuti> getBerkasCutis();
    public BerkasCuti getBerkasCuti(Integer id);
    public BerkasCuti saveBerkasCuti(BerkasCuti berkasCuti);
    public BerkasCuti updateBerkasCuti(BerkasCuti berkasCuti);
    public BerkasCuti deleteBerkasCuti(BerkasCuti berkasCuti);
}
