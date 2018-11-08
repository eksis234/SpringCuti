/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Permohonan;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface PermohonanDao {
    public List<Permohonan> getPermohonans();
    public Permohonan getPermohonan(Integer id);
    public Permohonan savePermohonan(Permohonan permohonan);
    public Permohonan updatePermohonan(Permohonan permohonan);
    public Permohonan deletePermohonan(Permohonan permohonan);
}
