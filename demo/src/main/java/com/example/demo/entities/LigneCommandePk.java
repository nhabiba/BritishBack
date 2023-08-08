package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class LigneCommandePk implements Serializable {
    private int machine;
    private int commande;

    public LigneCommandePk() {
    }

    public int getMachine() {
        return this.machine;
    }

    public void setMachine(int machine) {
        this.machine = machine;
    }

    public int getCommande() {
        return this.commande;
    }

    public void setCommande(int commande) {
        this.commande = commande;
    }

}

