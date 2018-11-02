/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.model.JenisCuti;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface JenisCutiService {
    public List<JenisCuti> getJenisCutis();
    public JenisCuti getJenisCuti(Integer id);
    public JenisCuti saveJenisCuti(JenisCuti jenisCuti);
    public JenisCuti updateJenisCuti(JenisCuti jenisCuti);
    public JenisCuti deleteJenisCuti(JenisCuti jenisCuti);
}
