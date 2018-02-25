
package com.mycompany.portfoliopruefung01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String benutzerName = "";
    
    private String emailAdresse = "";
    private String passwort = "";
    private String straße = "";
    private String hausnummer = "";
    
    @ManyToOne
    private Ort ort;
    
    private String vorname = "";
    private String nachname = "";
    private String telefonnummer = "";
    
   @OneToMany(mappedBy="verkaeufer")
   List<Artikel> artikel = new ArrayList<>();
    
   @ManyToMany(mappedBy="benutzer")
   List<Artikel> akrtikelList = new ArrayList<>();
   
   @OneToMany (mappedBy="sender")
   List<Nachricht> gesendeteNachrichten = new ArrayList<>();
   
   @OneToMany (mappedBy = "empfaenger")
   List<Nachricht> empfangendeNachrichten = new ArrayList<>();
    
    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Benutzer() {
    }
    
    public Benutzer(String benutzerName, String emailAdresse, String passwort, String straße, String hausnummer, Ort ort, String vorname, String nachname, String telefonnummer) {
        this.benutzerName = benutzerName;
        this.emailAdresse = emailAdresse;
        this.passwort = passwort;
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.vorname = vorname; 
        this.nachname = nachname;
        this.telefonnummer = telefonnummer; 
    }
    //</editor-fold>
            
    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
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
    //</editor-fold>
}

