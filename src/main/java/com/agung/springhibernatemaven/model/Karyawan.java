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
    private Integer iddept;
    private Integer idmail;
    private String katasandi;
    private Integer sisacuti;
    private Integer bnykcuti;
    private String status;
    private Integer idrole;

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

    public Integer getIddept() {
        return iddept;
    }

    public void setIddept(Integer iddept) {
        this.iddept = iddept;
    }

    public Integer getIdmail() {
        return idmail;
    }

    public void setIdmail(Integer idmail) {
        this.idmail = idmail;
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

    public Integer getIdrole() {
        return idrole;
    }

    public void setIdrole(Integer idrole) {
        this.idrole = idrole;
    }
}
