package com.ibued.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
//import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * 
 * @author ibued
 */
@Named
@ViewScoped
public class Controller implements Serializable{
    private static final long serialVersionUID = 1L;    
    private String text;
    private int firstOperand;
    private int secondOperand;
    private int total;
    
    
    public Controller() {        
    }
    
    @PostConstruct
    public void calculateTotal() {
        total = firstOperand + secondOperand;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
        
}
