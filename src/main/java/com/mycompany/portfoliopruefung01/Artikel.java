
package com.mycompany.portfoliopruefung01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Artikel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;
    
    private String beschreibung = "";
    private String titel = "";
    
    @Column(nullable=false, precision=8, scale=2)
    private long preis;
    
    @ManyToOne
    private Benutzer verkaeufer;
    
    @ManyToOne
    private Kategorie kategorie;
    
    private Date erstellungsDatum = new Date();
    private PreisKategorie preisKategorie;
    private int besucherAnzahl = 0;
    
    @ManyToOne
    private Ort ort = null;
   
    @OneToMany(mappedBy="artikel")
    List<Bild> bild = new ArrayList<>();
    
    @ManyToMany
    List<Benutzer> benutzer = new ArrayList<>();
    
    @OneToMany(mappedBy="artikel")
    List<Nachricht> nachricht = new ArrayList<>();
    
    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Artikel() {
    }

    public Artikel(String beschreibung, String titel, long preis, Benutzer verkaeufer, Kategorie kategorie, Date erstellungsDatum, PreisKategorie preisKategorie) {
        this.beschreibung = beschreibung;
        this.titel = titel;
        this.preis = preis;
        this.verkaeufer = verkaeufer;
        this.kategorie = kategorie;
        this.erstellungsDatum = erstellungsDatum;
        this.preisKategorie = preisKategorie;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
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
    
    public long getPreis(){
        return preis;
    }

    public void setPreis(long preis){
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

    public Date getErstellungsDatum(){
        return erstellungsDatum;
    }
    
    public void setErstellungsDatum(Date erstellungsDatum){
        this.erstellungsDatum=erstellungsDatum;
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
    //</editor-fold>
}

