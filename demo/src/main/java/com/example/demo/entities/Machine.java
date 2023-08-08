package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Machine {
    protected String code;
    protected String marque;
    protected float hauteur;
    protected float largeur;
    protected float profondeur;
    protected int garantie;
    protected String reference_fournisseur;
    protected String finition;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "machine")
    @JsonManagedReference
    protected List<Photo> photos;
    @ManyToMany(fetch = FetchType.EAGER,mappedBy ="machines")
    protected List<Commande>commandes;
    @ManyToOne()
    protected Notif notifs;


    public Machine() {
    }

    public Machine(String code, String marque, float hauteur, float largeur, float profondeur, int garantie, String reference_fournisseur, String finition, List<Photo> photos, List<Commande> commandes, Notif notifs) {
        this.code = code;
        this.marque = marque;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.profondeur = profondeur;
        this.garantie = garantie;
        this.reference_fournisseur = reference_fournisseur;
        this.finition = finition;
        this.photos = photos;
        this.commandes = commandes;
        this.notifs = notifs;
    }


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getHauteur() {
        return this.hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public float getLargeur() {
        return this.largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getProfondeur() {
        return this.profondeur;
    }

    public void setProfondeur(float profondeur) {
        this.profondeur = profondeur;
    }

    public int getGarantie() {
        return this.garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    public String getReference_fournisseur() {
        return this.reference_fournisseur;
    }

    public void setReference_fournisseur(String reference_fournisseur) {
        this.reference_fournisseur = reference_fournisseur;
    }

    public String getFinition() {
        return this.finition;
    }

    public void setFinition(String finition) {
        this.finition = finition;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Commande> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public Notif getNotifs() {
        return this.notifs;
    }

    public void setNotifs(Notif notifs) {
        this.notifs = notifs;
    }

   

    
}
