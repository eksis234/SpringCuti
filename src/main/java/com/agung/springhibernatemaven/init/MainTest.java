/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.init;

import com.agung.springhibernatemaven.controller.DepartemenController;
import com.agung.springhibernatemaven.dao.DepartemenDao;
import com.agung.springhibernatemaven.dao.DepartemenDaoImpl;
import com.agung.springhibernatemaven.dao.LaguDaoImpl;

/**
 *
 * @author Lenovo
 */
public class MainTest {
    public static void main(String[] args) {
        DepartemenController departemenController = new DepartemenController();
        DepartemenDaoImpl daoImpl = new DepartemenDaoImpl();
        System.out.println(daoImpl.getAll().size());
        LaguDaoImpl laguDaoImpl = new LaguDaoImpl();
        System.out.println(laguDaoImpl.getLagus().size());
    }
}
