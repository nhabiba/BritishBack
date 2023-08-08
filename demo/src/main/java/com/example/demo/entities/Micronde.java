package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Micronde extends Machine {

    private float capacite;
    private String programmation;
    private String puissance_micro_onde; 
    private int puissance_grill;
    private String type;
    private boolean encastrable;
    private int poid_en_kg ;



    public Micronde() {
    }
    


    public Micronde(float capacite, String programmation, String puissance_micro_onde, int puissance_grill, String type, boolean encastrable, int poid_en_kg) {
        this.capacite = capacite;
        this.programmation = programmation;
        this.puissance_micro_onde = puissance_micro_onde;
        this.puissance_grill = puissance_grill;
        this.type = type;
        this.encastrable = encastrable;
        this.poid_en_kg = poid_en_kg;
    }

    public float getCapacite() {
        return this.capacite;
    }

    public void setCapacite(float capacite) {
        this.capacite = capacite;
    }

    public String getProgrammation() {
        return this.programmation;
    }

    public void setProgrammation(String programmation) {
        this.programmation = programmation;
    }

    public String getPuissance_micro_onde() {
        return this.puissance_micro_onde;
    }

    public void setPuissance_micro_onde(String puissance_micro_onde) {
        this.puissance_micro_onde = puissance_micro_onde;
    }

    public int getPuissance_grill() {
        return this.puissance_grill;
    }

    public void setPuissance_grill(int puissance_grill) {
        this.puissance_grill = puissance_grill;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEncastrable() {
        return this.encastrable;
    }

    public boolean getEncastrable() {
        return this.encastrable;
    }

    public void setEncastrable(boolean encastrable) {
        this.encastrable = encastrable;
    }

    public int getPoid_en_kg() {
        return this.poid_en_kg;
    }

    public void setPoid_en_kg(int poid_en_kg) {
        this.poid_en_kg = poid_en_kg;
    }
}

