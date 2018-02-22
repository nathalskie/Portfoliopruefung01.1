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
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String benutzerName;
    private String emailAdresse;
    private String passwort;
    private String straße;
    private String hausnummer;
    private Ort ort;
    private String vorname;
    private String nachname;
    private String telefonnummer;
            

    public String getBenutzerName() {
        return benutzerName;
    }

    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }
    
    public String getEmailAdresse(){
        return emailAdresse;
    }
    
    public void setEmailAdresse(String emailAdresse){
        this.emailAdresse=emailAdresse;
    }
    
    public String getPasswort(){
        return passwort;
    }
    
    public void setPasswort(String passwort){
        this.passwort=passwort;
    }
    
    public String getStraße(){
        return straße;
    }
    
    public void setStraße(String straße){
        this.straße=straße;
    }
    
    public String getHausnummer(){
        return hausnummer;
    }
    
    public void setHausnummer(String hausnummer){
        this.hausnummer=hausnummer;
    }
    
    public Ort getOrt(){
        return ort;
    }
    
    public void setOrt(Ort ort){
        this.ort=ort;
    }
    
    public String getVorname(){
        return vorname;
    }
    
    public void setVorname(String vorname){
        this.vorname=vorname;
    }
    
    public String getNachname(){
        return nachname;
    }
    
    public void setNachname(String nachname){
        this.nachname=nachname;
    }
    
    public String getTelefonnummer(){
        return telefonnummer;
    }
    
    public void setTelefonnummer(String telefonnummer){
        this.telefonnummer=telefonnummer;
    }

    
    
}
