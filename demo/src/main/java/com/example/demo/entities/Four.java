package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Four extends Machine {
    private String typeFour;
    private String typeCuisson;
    private int capacite;
    private int nbrModeCuisson;
    private String typeNettoyage;
    private String ouverturePort;
    private boolean porteFroide;
    private boolean fonctionTournebroche;
    private boolean fonctionDecongelation;
    private boolean fonctionMaintienAuChaud;
    private boolean fonctionVapeur;
    private boolean departDiffere;
    private boolean minuteur;


    public Four() {
    }

    public Four(String typeFour, String typeCuisson, int capacite, int nbrModeCuisson, String typeNettoyage, String ouverturePort, boolean porteFroide, boolean fonctionTournebroche, boolean fonctionDecongelation, boolean fonctionMaintienAuChaud, boolean fonctionVapeur, boolean departDiffere, boolean minuteur) {
        this.typeFour = typeFour;
        this.typeCuisson = typeCuisson;
        this.capacite = capacite;
        this.nbrModeCuisson = nbrModeCuisson;
        this.typeNettoyage = typeNettoyage;
        this.ouverturePort = ouverturePort;
        this.porteFroide = porteFroide;
        this.fonctionTournebroche = fonctionTournebroche;
        this.fonctionDecongelation = fonctionDecongelation;
        this.fonctionMaintienAuChaud = fonctionMaintienAuChaud;
        this.fonctionVapeur = fonctionVapeur;
        this.departDiffere = departDiffere;
        this.minuteur = minuteur;
    }

    public String getTypeFour() {
        return this.typeFour;
    }

    public void setTypeFour(String typeFour) {
        this.typeFour = typeFour;
    }

    public String getTypeCuisson() {
        return this.typeCuisson;
    }

    public void setTypeCuisson(String typeCuisson) {
        this.typeCuisson = typeCuisson;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getNbrModeCuisson() {
        return this.nbrModeCuisson;
    }

    public void setNbrModeCuisson(int nbrModeCuisson) {
        this.nbrModeCuisson = nbrModeCuisson;
    }

    public String getTypeNettoyage() {
        return this.typeNettoyage;
    }

    public void setTypeNettoyage(String typeNettoyage) {
        this.typeNettoyage = typeNettoyage;
    }

    public String getOuverturePort() {
        return this.ouverturePort;
    }

    public void setOuverturePort(String ouverturePort) {
        this.ouverturePort = ouverturePort;
    }

    public boolean isPorteFroide() {
        return this.porteFroide;
    }

    public boolean getPorteFroide() {
        return this.porteFroide;
    }

    public void setPorteFroide(boolean porteFroide) {
        this.porteFroide = porteFroide;
    }

    public boolean isFonctionTournebroche() {
        return this.fonctionTournebroche;
    }

    public boolean getFonctionTournebroche() {
        return this.fonctionTournebroche;
    }

    public void setFonctionTournebroche(boolean fonctionTournebroche) {
        this.fonctionTournebroche = fonctionTournebroche;
    }

    public boolean isFonctionDecongelation() {
        return this.fonctionDecongelation;
    }

    public boolean getFonctionDecongelation() {
        return this.fonctionDecongelation;
    }

    public void setFonctionDecongelation(boolean fonctionDecongelation) {
        this.fonctionDecongelation = fonctionDecongelation;
    }

    public boolean isFonctionMaintienAuChaud() {
        return this.fonctionMaintienAuChaud;
    }

    public boolean getFonctionMaintienAuChaud() {
        return this.fonctionMaintienAuChaud;
    }

    public void setFonctionMaintienAuChaud(boolean fonctionMaintienAuChaud) {
        this.fonctionMaintienAuChaud = fonctionMaintienAuChaud;
    }

    public boolean isFonctionVapeur() {
        return this.fonctionVapeur;
    }

    public boolean getFonctionVapeur() {
        return this.fonctionVapeur;
    }

    public void setFonctionVapeur(boolean fonctionVapeur) {
        this.fonctionVapeur = fonctionVapeur;
    }

    public boolean isDepartDiffere() {
        return this.departDiffere;
    }

    public boolean getDepartDiffere() {
        return this.departDiffere;
    }

    public void setDepartDiffere(boolean departDiffere) {
        this.departDiffere = departDiffere;
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


}

