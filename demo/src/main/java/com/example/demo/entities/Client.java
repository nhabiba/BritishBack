package com.example.demo.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity
public class Client extends User {
    private Boolean genre;
    private LocalDate dateNaissance;
    private Boolean noti;
    private String adresse_livraison;
    private String adresse_facturation;
    private String ville;
    private String region;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Email> emails;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Commande>commandes;

    public Client() {
    }


    public Boolean isGenre() {
        return this.genre;
    }

    public Boolean getGenre() {
        return this.genre;
    }

    public void setGenre(Boolean genre) {
        this.genre = genre;
    }

    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Boolean isNoti() {
        return this.noti;
    }

    public Boolean getNoti() {
        return this.noti;
    }

    public void setNoti(Boolean noti) {
        this.noti = noti;
    }

    public String getAdresse_livraison() {
        return this.adresse_livraison;
    }

    public void setAdresse_livraison(String adresse_livraison) {
        this.adresse_livraison = adresse_livraison;
    }

    public String getAdresse_facturation() {
        return this.adresse_facturation;
    }

    public void setAdresse_facturation(String adresse_facturation) {
        this.adresse_facturation = adresse_facturation;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Email> getEmails() {
        return this.emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Commande> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

}

