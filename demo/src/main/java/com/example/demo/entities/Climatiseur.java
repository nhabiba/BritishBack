package com.example.demo.entities;


import jakarta.persistence.Entity;

@Entity
public class Climatiseur extends Machine {
    
  
    private String categorie;
    private boolean monosplit;
    private boolean reversible;
    private String fonctions;
    private int puissance;
    private boolean fonctionVentilation;
    private int vitessesVentilation;
    private boolean appareilConnecte;


    public Climatiseur() {
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public boolean isMonosplit() {
        return this.monosplit;
    }

    public boolean getMonosplit() {
        return this.monosplit;
    }

    public void setMonosplit(boolean monosplit) {
        this.monosplit = monosplit;
    }

    public boolean isReversible() {
        return this.reversible;
    }

    public boolean getReversible() {
        return this.reversible;
    }

    public void setReversible(boolean reversible) {
        this.reversible = reversible;
    }

    public String getFonctions() {
        return this.fonctions;
    }

    public void setFonctions(String fonctions) {
        this.fonctions = fonctions;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public boolean isFonctionVentilation() {
        return this.fonctionVentilation;
    }

    public boolean getFonctionVentilation() {
        return this.fonctionVentilation;
    }

    public void setFonctionVentilation(boolean fonctionVentilation) {
        this.fonctionVentilation = fonctionVentilation;
    }

    public int getVitessesVentilation() {
        return this.vitessesVentilation;
    }

    public void setVitessesVentilation(int vitessesVentilation) {
        this.vitessesVentilation = vitessesVentilation;
    }

    public boolean isAppareilConnecte() {
        return this.appareilConnecte;
    }

    public boolean getAppareilConnecte() {
        return this.appareilConnecte;
    }

    public void setAppareilConnecte(boolean appareilConnecte) {
        this.appareilConnecte = appareilConnecte;
    }

    public Climatiseur(String categorie, boolean monosplit, boolean reversible, String fonctions, int puissance, boolean fonctionVentilation, int vitessesVentilation, boolean appareilConnecte) {
        this.categorie = categorie;
        this.monosplit = monosplit;
        this.reversible = reversible;
        this.fonctions = fonctions;
        this.puissance = puissance;
        this.fonctionVentilation = fonctionVentilation;
        this.vitessesVentilation = vitessesVentilation;
        this.appareilConnecte = appareilConnecte;
    }


    
}

