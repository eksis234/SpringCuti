/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Martin
 */

@Entity
@Table(name = "BERKASCUTI")
public class BerkasCuti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer idDept;
    private String lokasiBerkas;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the idDept
     */
    public Integer getIdDept() {
        return idDept;
    }

    /**
     * @param idDept the idDept to set
     */
    public void setIdDept(Integer idDept) {
        this.idDept = idDept;
    }

    /**
     * @return the lokasiBerkas
     */
    public String getLokasiBerkas() {
        return lokasiBerkas;
    }

    /**
     * @param lokasiBerkas the lokasiBerkas to set
     */
    public void setLokasiBerkas(String lokasiBerkas) {
        this.lokasiBerkas = lokasiBerkas;
    }
    
}
