/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.service;

import com.agung.springhibernatemaven.dao.DepartemenDao;
import com.agung.springhibernatemaven.model.Departemen;
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
public class DepartemenServiceImpl implements DepartemenService{
    @Autowired
    DepartemenDao departemenDao;

    public void setDepartemenDao(DepartemenDao departemenDao) {
        this.departemenDao = departemenDao;
    }
    
    @Override
    public List<Departemen> getAll() {
        return departemenDao.getAll();
        }

    @Override
    public Departemen getById(Integer id) {
        return departemenDao.getById(id);
        }

    @Override
    public Departemen saveData(Departemen departemen) {
        return departemenDao.saveData(departemen);
        }

    @Override
    public Departemen updateData(Departemen departemen) {
        return departemenDao.updateData(departemen);
        }

    @Override
    public Departemen deleteData(Departemen departemen) {
        return departemenDao.deleteData(departemen);
        }
    
    
}
