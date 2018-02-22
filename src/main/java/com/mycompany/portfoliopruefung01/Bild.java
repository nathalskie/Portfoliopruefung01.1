/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfoliopruefung01;

import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Vera
 */
@Entity
public class Bild implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bezeichnung;
    private Image bild;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBezeichnung(){
        return bezeichnung;
    }
    
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung=bezeichnung;
    }
    
    public Image getBild(){
        return bild;
    }
    
    public void setBild(Image bild){
        this.bild=bild;
    }
}
