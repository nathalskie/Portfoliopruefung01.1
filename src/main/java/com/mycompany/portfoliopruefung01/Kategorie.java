
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
public class Kategorie implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long slug = 0;
    
    private String name = "";
    
    @OneToMany(mappedBy="kategorie")
    List<Artikel> artikel = new ArrayList<>();

    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Kategorie() {
    }

    public Kategorie(String name) {
        this.name = name;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
    public long getSlug() {
        return slug;
    }

    public void setSlug(long slug) {
        this.slug = slug;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    //</editor-fold>
}
