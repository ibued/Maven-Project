package com.ibued.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ibued
 */
@Named
@RequestScoped
public class Mhs {
    
    private int npm;
    private String nama;
    private int angkatan;
    private String email;   

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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}
