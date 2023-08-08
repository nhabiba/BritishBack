package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Franke extends Machine {
    private String lypeFoyer;
    private int nombreFoyer;
    private String typeGrilles;
    private String dispositionCommandes;
    private String natureCommande;
    private boolean minuteur;
    private boolean securiteThermocouple;
    private boolean allumageElectrique;


    public Franke() {
    }
   

    public Franke(String lypeFoyer, int nombreFoyer, String typeGrilles, String dispositionCommandes, String natureCommande, boolean minuteur, boolean securiteThermocouple, boolean allumageElectrique) {
        this.lypeFoyer = lypeFoyer;
        this.nombreFoyer = nombreFoyer;
        this.typeGrilles = typeGrilles;
        this.dispositionCommandes = dispositionCommandes;
        this.natureCommande = natureCommande;
        this.minuteur = minuteur;
        this.securiteThermocouple = securiteThermocouple;
        this.allumageElectrique = allumageElectrique;
    }

    public String getLypeFoyer() {
        return this.lypeFoyer;
    }

    public void setLypeFoyer(String lypeFoyer) {
        this.lypeFoyer = lypeFoyer;
    }

    public int getNombreFoyer() {
        return this.nombreFoyer;
    }

    public void setNombreFoyer(int nombreFoyer) {
        this.nombreFoyer = nombreFoyer;
    }

    public String getTypeGrilles() {
        return this.typeGrilles;
    }

    public void setTypeGrilles(String typeGrilles) {
        this.typeGrilles = typeGrilles;
    }

    public String getDispositionCommandes() {
        return this.dispositionCommandes;
    }

    public void setDispositionCommandes(String dispositionCommandes) {
        this.dispositionCommandes = dispositionCommandes;
    }

    public String getNatureCommande() {
        return this.natureCommande;
    }

    public void setNatureCommande(String natureCommande) {
        this.natureCommande = natureCommande;
    }

    public boolean isMinuteur() {
        return this.minuteur;
    }

    public boolean getMinuteur() {
        return this.minuteur;
    }

    public void setMinuteur(boolean minuteur) {
        this.minuteur = minuteur;
    }

    public boolean isSecuriteThermocouple() {
        return this.securiteThermocouple;
    }

    public boolean getSecuriteThermocouple() {
        return this.securiteThermocouple;
    }

    public void setSecuriteThermocouple(boolean securiteThermocouple) {
        this.securiteThermocouple = securiteThermocouple;
    }

    public boolean isAllumageElectrique() {
        return this.allumageElectrique;
    }

    public boolean getAllumageElectrique() {
        return this.allumageElectrique;
    }

    public void setAllumageElectrique(boolean allumageElectrique) {
        this.allumageElectrique = allumageElectrique;
    }

    

}



