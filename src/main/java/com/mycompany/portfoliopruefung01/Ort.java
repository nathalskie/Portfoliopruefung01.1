
package com.mycompany.portfoliopruefung01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Ort implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;
    
    private int postleitzahl = 0;
    private String name = "";
    private String land = "";
    private boolean aktivKennzeichen = false;
    
    @OneToMany(mappedBy="ort")
    List <Artikel> artikel = new ArrayList<>();
    
    @OneToMany (mappedBy="ort")
    List <Benutzer> benutzer = new ArrayList<>();

    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Ort() {
    }

    public Ort(int postleitzahl, String name, String land, boolean aktivKennzeichen) {
        this.postleitzahl = postleitzahl;
        this.name = name;
        this.land = land;
        this.aktivKennzeichen = aktivKennzeichen;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPostleitzahl(){
        return postleitzahl;
    }
    
    public void setPostleitzahl(int postleitzahl){
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
    //</editor-fold>
}
