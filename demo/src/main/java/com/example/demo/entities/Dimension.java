package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private double hauteur;
    private double largeur;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Television> tv;


    public Dimension() {
    }

    public Dimension(int id, double hauteur, double largeur, List<Television> tv) {
        this.id = id;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.tv = tv;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHauteur() {
        return this.hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public List<Television> getTv() {
        return this.tv;
    }

    public void setTv(List<Television> tv) {
        this.tv = tv;
    }


    
}

