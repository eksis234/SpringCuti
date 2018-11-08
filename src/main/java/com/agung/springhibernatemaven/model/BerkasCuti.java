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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "BERKASCUTI")
public class BerkasCuti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idBCuti;

    public Integer getIdBCuti() {
        return idBCuti;
    }

    public void setIdBCuti(Integer idBCuti) {
        this.idBCuti = idBCuti;
    }

    public JenisCuti getIdJCuti() {
        return idJCuti;
    }

    public void setIdJCuti(JenisCuti idJCuti) {
        this.idJCuti = idJCuti;
    }

    public String getLokasiBerkas() {
        return lokasiBerkas;
    }

    public void setLokasiBerkas(String lokasiBerkas) {
        this.lokasiBerkas = lokasiBerkas;
    }
    @JoinColumn(name = "idJCuti", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private JenisCuti idJCuti;
    private String lokasiBerkas;
}
