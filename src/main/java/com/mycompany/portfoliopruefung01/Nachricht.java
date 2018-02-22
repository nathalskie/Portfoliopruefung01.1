/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfoliopruefung01;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author Vera
 */
@Entity
public class Nachricht implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String betreff;
    @Lob
    private String text;
    @ManyToOne
    private Artikel artikelID;
    @ManyToOne
    private Benutzer sender;
    @ManyToOne
    private Benutzer empfaenger;
    private Date datum;
    private Date uhrzeit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBetreff(){
        return betreff;
    }
    
    public void setBetreff(String betreff){
        this.betreff=betreff;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text=text;
    }
    
    public Artikel getArtikelID(){
        return artikelID;
    }
    
    public void setArtikelID(Artikel artikelID){
        this.artikelID=artikelID;
    }
    
    public Benutzer getSender(){
        return sender;
    }
    
    public void setSender(Benutzer sender){
        this.sender=sender;
    }
    
    public Benutzer getEmpfaenger(){
        return empfaenger;
    }
    
    public void setEmpfaenger(Benutzer empfaenger){
        this.empfaenger=empfaenger;
    }
    
    public Date getDatum(){
        return datum;
    }
    
    public void setDatum(Date datum){
        this.datum=datum;
    }
    
    public Date getUhrzeit(){
        return uhrzeit;
    }
    
    public void setUhrzeit(Date uhrzeit){
        this.uhrzeit=uhrzeit;
    }
    
    
}
