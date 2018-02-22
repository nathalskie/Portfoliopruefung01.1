/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfoliopruefung01;

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
public class Ort implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private short postleitzahl;
    private String name;
    private String land;
    private boolean aktivKennzeichen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getPostleitzahl(){
        return postleitzahl;
    }
    
    public void setPostleitzahl(short postleitzahl){
        this.postleitzahl=postleitzahl;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getLand(){
        return land;
    }
    
    public void setLand(String land){
        this.land=land;
    }
    
    public boolean getAktivKennzeichen(){
        return aktivKennzeichen;
    }
    
    public void setAktivKennzeichen(boolean aktivKennzeichen){
        this.aktivKennzeichen=aktivKennzeichen;
    }
}
