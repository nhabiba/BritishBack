package com.example.demo.entities;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private LocalDate date_commande;
    private LocalDate date_reception;
    private LocalDate date_emission;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Machine>machines;
    public Commande() {
    }


    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDate_commande() {
        return this.date_commande;
    }

    public void setDate_commande(LocalDate date_commande) {
        this.date_commande = date_commande;
    }

    public LocalDate getDate_reception() {
        return this.date_reception;
    }

    public void setDate_reception(LocalDate date_reception) {
        this.date_reception = date_reception;
    }

    public LocalDate getDate_emission() {
        return this.date_emission;
    }

    public void setDate_emission(LocalDate date_emission) {
        this.date_emission = date_emission;
    }

    public List<Machine> getMachines() {
        return this.machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

}

