package com.ibued.api;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author ibued
 */
@Named
@RequestScoped
public class JpaMhs {
    
    @PersistenceContext
    private EntityManager em;
    
    @Resource
    private UserTransaction ut;
    
    public String updateDB() {
        
        String retVal = "konfirmasi";        
        Mhs mhs = new Mhs();
        Mhs mhs2 = new Mhs();
        Mhs mhs3;
        
        mhs.setNpm(177);
        mhs.setNama("COBA");
        mhs.setAngkatan(2011);
        
        mhs2.setNpm(142);
        mhs2.setNama("TEST2");
        mhs2.setAngkatan(12);
        
        try {
            ut.begin();
            em.persist(mhs);
            em.persist(mhs2);
            mhs3 = em.find(Mhs.class, 177);
            mhs3.setNama("COBA1");
            em.persist(mhs3);
            em.remove(mhs);
        } catch (NotSupportedException | SystemException e) {
            retVal = "Error";
        }
        
        return retVal;        
    }
    
}
