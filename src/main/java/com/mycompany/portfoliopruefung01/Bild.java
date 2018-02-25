
package com.mycompany.portfoliopruefung01;

import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Bild implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;
    
    private String bezeichnung = "";
    private Image bild;
    
    @ManyToOne
    Artikel artikel = null;
    
    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Bild() {
    }

    public Bild(String bezeichnung, Image bild) {
        this.bezeichnung = bezeichnung;
        this.bild = bild;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    //</editor-fold>
}
