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
public class Artikel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String beschreibung;
    private String titel;
    private double preis;
    
    //@ManyToOne
    private Benutzer verkaeufer;
    
    //@ManyToOne
    private Kategorie kategorie;
    
    private Date erstellungsdatum;
    private PreisKategorie preisKategorie;
    private int besucherAnzahl;
    
    //@ManyToOne
    private Ort ort;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBeschreibung(){
        return beschreibung;
    }
    
    public void setBeschreibung(String beschreibung){
        this.beschreibung=beschreibung;
    }
    
    public String getTitel(){
        return titel;
    }
    
    public void setTitel(String titel){
        this.titel=titel;
    }
    
    public double getPreis(){
        return preis;
    }
    
    public void setPreis(double preis){
        this.preis=preis;
    }
    
    public Benutzer getVerkaeufer(){
        return verkaeufer;
    }
    
    public void setVerkaeufer(Benutzer verkaeufer){
        this.verkaeufer=verkaeufer;
    }
    
    public Kategorie getKategorie(){
        return kategorie;
    }
    
    public void setKategorie(Kategorie kategorie){
        this.kategorie=kategorie;
    }
    
    public Date getErstellungsdatum(){
        return erstellungsdatum;
    }
    
    public void setErstellungsdatum(Date erstellungsdatum){
        this.erstellungsdatum=erstellungsdatum;
    }
    
    public PreisKategorie getPreisKategorie(){
        return preisKategorie;
    }
    
    public void setPreisKategorie(PreisKategorie preisKategorie){
        this.preisKategorie=preisKategorie;
    }
    
    public int getBesucherAnzahl(){
        return besucherAnzahl;
    }
    
    public void setBesucherAnzahl(int besucherAnzahl){
        this.besucherAnzahl=besucherAnzahl;
    }
    
    public Ort getOrt(){
        return ort;
    }
    
    public void setOrt(Ort ort){
        this.ort=ort;
    }
}

