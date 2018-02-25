
package com.mycompany.portfoliopruefung01;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


@Entity
public class Nachricht implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;
    
    private String betreff = "";
    
    @Lob
    private String text = "";
    
    @ManyToOne
    private long artikelID;
    
    @ManyToOne 
    private Benutzer sender;
    
    @ManyToOne
    private Benutzer empfaenger;

    private Date datum = new Date();
    private Time uhrzeit;
    
    
    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Nachricht() {
    }

    public Nachricht(String betreff, String text, long artikelID, Benutzer sender, Benutzer empfaenger, Date datum, Time uhrzeit) {
        this.betreff = betreff;
        this.text = text;
        this.artikelID = artikelID;
        this.sender = sender;
        this.empfaenger = empfaenger;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        
    public long getArtikelID(){
        return artikelID;
    }
    
    public void setArtikelID(long artikelID){
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
    
    public Time getUhrzeit(){
        return uhrzeit;
    }
    
    public void setUhrzeit(Time uhrzeit){
        this.uhrzeit=uhrzeit;
    }
    //</editor-fold> 
}
