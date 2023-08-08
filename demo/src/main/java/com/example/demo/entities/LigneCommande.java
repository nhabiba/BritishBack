package com.example.demo.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LigneCommande {
    @EmbeddedId
    private LigneCommandePk code;
    private int quantite;
    @ManyToOne()
    @JoinColumn(referencedColumnName = "code",insertable = false,updatable = false)
    private Machine machine;
    @ManyToOne()
    @JoinColumn(referencedColumnName = "code",insertable = false,updatable = false)
    private Commande commande;

    public LigneCommande() {
    }


    public LigneCommandePk getCode() {
        return this.code;
    }

    public void setCode(LigneCommandePk code) {
        this.code = code;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Machine getMachine() {
        return this.machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Commande getCommande() {
        return this.commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
}

