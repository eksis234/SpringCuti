/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "KARYAWAN")
public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nama;
    private String nohp;
    private String email;
    private Date awalgbg;
    @JoinColumn(name = "idDepartemen", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Departemen idDepartemen;
    private String katasandi;
    private Integer sisacuti;
    private Integer bnykcuti;
    private String status;
    @JoinColumn(name = "idDRole", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Role idDRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAwalgbg() {
        return awalgbg;
    }

    public void setAwalgbg(Date awalgbg) {
        this.awalgbg = awalgbg;
    }
    
    public String getKatasandi() {
        return katasandi;
    }

    public void setKatasandi(String katasandi) {
        this.katasandi = katasandi;
    }

    public Integer getSisacuti() {
        return sisacuti;
    }

    public void setSisacuti(Integer sisacuti) {
        this.sisacuti = sisacuti;
    }

    public Integer getBnykcuti() {
        return bnykcuti;
    }

    public void setBnykcuti(Integer bnykcuti) {
        this.bnykcuti = bnykcuti;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
