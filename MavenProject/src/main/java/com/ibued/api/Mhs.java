package com.ibued.api;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ibued
 */
@Entity
@Table(name = "mhs")
public class Mhs implements Serializable{
    
    @Id
    @Column(name = "npm")
    private int npm;
    
    @Column(name = "nama")
    private String nama;
    
    @Column(name = "angkatan")
    private int angkatan;

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
       
}
