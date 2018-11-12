/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.dao.KaryawanDao;
import com.agung.springhibernatemaven.model.Karyawan;
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
public class KaryawanServiceImpl implements KaryawanService {

    @Autowired
    KaryawanDao karyawanDao;

    public void setKaryawanDao(KaryawanDao karyawanDao) {
        this.karyawanDao = karyawanDao;
    }

    @Override
    public List<Karyawan> getKaryawans() {
        return karyawanDao.getKaryawans();
    }

    @Override
    public Karyawan getKaryawan(Integer id) {
        return karyawanDao.getKaryawan(id);
    }

    @Override
    public Karyawan saveKaryawan(Karyawan karyawan) {
        return karyawanDao.saveKaryawan(karyawan);
    }

    @Override
    public Karyawan updateKaryawan(Karyawan karyawan) {
        return karyawanDao.updateKaryawan(karyawan);
    }

    @Override
    public Karyawan deleteKaryawan(Karyawan karyawan) {
        return karyawanDao.deleteKaryawan(karyawan);
    }

    @Override
    public Karyawan getByEmail(String email) {
        return karyawanDao.getByEmail(email);
    }

}
