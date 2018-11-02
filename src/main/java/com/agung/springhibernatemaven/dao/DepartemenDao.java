/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Departemen;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface DepartemenDao {
    public List<Departemen> getAll();
    public Departemen getById(Integer id);
    public Departemen saveData(Departemen departemen);
    public Departemen updateData(Departemen departemen);
    public Departemen deleteData(Departemen departemen);
}
