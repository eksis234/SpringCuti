/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author X453MA
 */
@Entity
@Table(name = "Permohonan")
public class Permohonan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPermohonan;
    
    @JoinColumn(name = "idCuti", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private JenisCuti idCuti;
    @JoinColumn(name = "idKaryawan", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Karyawan idKaryawan;

    private Date tglSubmit;
    
    private Date mulaiCuti;
    
    private Date selesaiCuti;
    
    private String catatan;
    
    private String status;

    public Integer getIdPermohonan() {
        return idPermohonan;
    }

    public void setIdPermohonan(Integer idPermohonan) {
        this.idPermohonan = idPermohonan;
    }

    public Date getTglSubmit() {
        return tglSubmit;
    }

    public void setTglSubmit(Date tglSubmit) {
        this.tglSubmit = tglSubmit;
    }

    public Date getMulaiCuti() {
        return mulaiCuti;
    }

    public void setMulaiCuti(Date mulaiCuti) {
        this.mulaiCuti = mulaiCuti;
    }

    public Date getSelesaiCuti() {
        return selesaiCuti;
    }

    public void setSelesaiCuti(Date selesaiCuti) {
        this.selesaiCuti = selesaiCuti;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
