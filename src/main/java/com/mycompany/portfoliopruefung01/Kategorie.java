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
import javax.persistence.OneToMany;

/**
 *
 * @author Vera
 */
@Entity
public class Kategorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long slug;
    @OneToMany
    private String name;

    public Long getSlug() {
        return slug;
    }

    public void setSlug(Long slug) {
        this.slug = slug;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
}
