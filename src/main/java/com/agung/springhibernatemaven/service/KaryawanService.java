/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.model.Karyawan;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface KaryawanService {
    public List<Karyawan> getKaryawans();
    public Karyawan getKaryawan(Integer id);
    public Karyawan saveKaryawan(Karyawan karyawan);
    public Karyawan updateKaryawan(Karyawan karyawan);
    public Karyawan deleteKaryawan(Karyawan karyawan);
    public Karyawan getByEmail(String email);
}
