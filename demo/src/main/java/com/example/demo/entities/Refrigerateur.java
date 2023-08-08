package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Refrigerateur extends Machine {
    
    private double volumeTotale;
    private boolean distributeurD_Eau;
    private boolean encastrable;
    private String classeEnergitique;
    private String classeClimatique;
    private int autonomieCongelateur;
    private double volumeUtileDeRefrigerateur;
    private double volumeUtileDeCongelateur;
    private int nombreDeClayetteDansLeRefrigerateur;
    private int nombreDeClayetteDansLeCongelateur;
    private int niveauSonore;
    private boolean zoneUltraFroide;
    private boolean zoneFraiche;
    private boolean eclairageInterieurLed;
    private String froidDuCongelateur;
    private String froidDuRefrigerateur;


    public Refrigerateur() {
    }

    public Refrigerateur(double volumeTotale, boolean distributeurD_Eau, boolean encastrable, String classeEnergitique, String classeClimatique, int autonomieCongelateur, double volumeUtileDeRefrigerateur, double volumeUtileDeCongelateur, int nombreDeClayetteDansLeRefrigerateur, int nombreDeClayetteDansLeCongelateur, int niveauSonore, boolean zoneUltraFroide, boolean zoneFraiche, boolean eclairageInterieurLed, String froidDuCongelateur, String froidDuRefrigerateur) {
        this.volumeTotale = volumeTotale;
        this.distributeurD_Eau = distributeurD_Eau;
        this.encastrable = encastrable;
        this.classeEnergitique = classeEnergitique;
        this.classeClimatique = classeClimatique;
        this.autonomieCongelateur = autonomieCongelateur;
        this.volumeUtileDeRefrigerateur = volumeUtileDeRefrigerateur;
        this.volumeUtileDeCongelateur = volumeUtileDeCongelateur;
        this.nombreDeClayetteDansLeRefrigerateur = nombreDeClayetteDansLeRefrigerateur;
        this.nombreDeClayetteDansLeCongelateur = nombreDeClayetteDansLeCongelateur;
        this.niveauSonore = niveauSonore;
        this.zoneUltraFroide = zoneUltraFroide;
        this.zoneFraiche = zoneFraiche;
        this.eclairageInterieurLed = eclairageInterieurLed;
        this.froidDuCongelateur = froidDuCongelateur;
        this.froidDuRefrigerateur = froidDuRefrigerateur;
    }


    public double getVolumeTotale() {
        return this.volumeTotale;
    }

    public void setVolumeTotale(double volumeTotale) {
        this.volumeTotale = volumeTotale;
    }

    public boolean isDistributeurD_Eau() {
        return this.distributeurD_Eau;
    }

    public boolean getDistributeurD_Eau() {
        return this.distributeurD_Eau;
    }

    public void setDistributeurD_Eau(boolean distributeurD_Eau) {
        this.distributeurD_Eau = distributeurD_Eau;
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

    public String getClasseEnergitique() {
        return this.classeEnergitique;
    }

    public void setClasseEnergitique(String classeEnergitique) {
        this.classeEnergitique = classeEnergitique;
    }

    public String getClasseClimatique() {
        return this.classeClimatique;
    }

    public void setClasseClimatique(String classeClimatique) {
        this.classeClimatique = classeClimatique;
    }

    public int getAutonomieCongelateur() {
        return this.autonomieCongelateur;
    }

    public void setAutonomieCongelateur(int autonomieCongelateur) {
        this.autonomieCongelateur = autonomieCongelateur;
    }

    public double getVolumeUtileDeRefrigerateur() {
        return this.volumeUtileDeRefrigerateur;
    }

    public void setVolumeUtileDeRefrigerateur(double volumeUtileDeRefrigerateur) {
        this.volumeUtileDeRefrigerateur = volumeUtileDeRefrigerateur;
    }

    public double getVolumeUtileDeCongelateur() {
        return this.volumeUtileDeCongelateur;
    }

    public void setVolumeUtileDeCongelateur(double volumeUtileDeCongelateur) {
        this.volumeUtileDeCongelateur = volumeUtileDeCongelateur;
    }

    public int getNombreDeClayetteDansLeRefrigerateur() {
        return this.nombreDeClayetteDansLeRefrigerateur;
    }

    public void setNombreDeClayetteDansLeRefrigerateur(int nombreDeClayetteDansLeRefrigerateur) {
        this.nombreDeClayetteDansLeRefrigerateur = nombreDeClayetteDansLeRefrigerateur;
    }

    public int getNombreDeClayetteDansLeCongelateur() {
        return this.nombreDeClayetteDansLeCongelateur;
    }

    public void setNombreDeClayetteDansLeCongelateur(int nombreDeClayetteDansLeCongelateur) {
        this.nombreDeClayetteDansLeCongelateur = nombreDeClayetteDansLeCongelateur;
    }

    public int getNiveauSonore() {
        return this.niveauSonore;
    }

    public void setNiveauSonore(int niveauSonore) {
        this.niveauSonore = niveauSonore;
    }

    public boolean isZoneUltraFroide() {
        return this.zoneUltraFroide;
    }

    public boolean getZoneUltraFroide() {
        return this.zoneUltraFroide;
    }

    public void setZoneUltraFroide(boolean zoneUltraFroide) {
        this.zoneUltraFroide = zoneUltraFroide;
    }

    public boolean isZoneFraiche() {
        return this.zoneFraiche;
    }

    public boolean getZoneFraiche() {
        return this.zoneFraiche;
    }

    public void setZoneFraiche(boolean zoneFraiche) {
        this.zoneFraiche = zoneFraiche;
    }

    public boolean isEclairageInterieurLed() {
        return this.eclairageInterieurLed;
    }

    public boolean getEclairageInterieurLed() {
        return this.eclairageInterieurLed;
    }

    public void setEclairageInterieurLed(boolean eclairageInterieurLed) {
        this.eclairageInterieurLed = eclairageInterieurLed;
    }

    public String getFroidDuCongelateur() {
        return this.froidDuCongelateur;
    }

    public void setFroidDuCongelateur(String froidDuCongelateur) {
        this.froidDuCongelateur = froidDuCongelateur;
    }

    public String getFroidDuRefrigerateur() {
        return this.froidDuRefrigerateur;
    }

    public void setFroidDuRefrigerateur(String froidDuRefrigerateur) {
        this.froidDuRefrigerateur = froidDuRefrigerateur;
    }

}
