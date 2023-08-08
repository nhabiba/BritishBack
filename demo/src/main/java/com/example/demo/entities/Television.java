package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Television extends Machine {
    private double tailleEcran;
    private String typeEcran;
    private boolean smartTV;
    private String typeRectro;
    private String normeHD;
    private String resolutionAffichage;
    private String fluiditeConstructeur;
    private String tuner;
    private boolean directWifi;
    private int puissanceSonore;
    private int entreeHDMI;
    private int entreeUSB;
    private int entreePrisePeritel;
    private int entreeRCA;
    private int entreeVGA;
    private boolean interfaceCI;
    private boolean entreeOptique;
    private boolean wifiIntegre;
    private boolean bluetooth;
    private Dimension dimension_avec_pied;
    private Dimension dimension_sans_pied;
    
    private String technologie_eclairage;


    public Television() {
    }

    public Television(double tailleEcran, String typeEcran, boolean smartTV, String typeRectro, String normeHD, String resolutionAffichage, String fluiditeConstructeur, String tuner, boolean directWifi, int puissanceSonore, int entreeHDMI, int entreeUSB, int entreePrisePeritel, int entreeRCA, int entreeVGA, boolean interfaceCI, boolean entreeOptique, boolean wifiIntegre, boolean bluetooth, Dimension dimension_avec_pied, Dimension dimension_sans_pied, String technologie_eclairage) {
        this.tailleEcran = tailleEcran;
        this.typeEcran = typeEcran;
        this.smartTV = smartTV;
        this.typeRectro = typeRectro;
        this.normeHD = normeHD;
        this.resolutionAffichage = resolutionAffichage;
        this.fluiditeConstructeur = fluiditeConstructeur;
        this.tuner = tuner;
        this.directWifi = directWifi;
        this.puissanceSonore = puissanceSonore;
        this.entreeHDMI = entreeHDMI;
        this.entreeUSB = entreeUSB;
        this.entreePrisePeritel = entreePrisePeritel;
        this.entreeRCA = entreeRCA;
        this.entreeVGA = entreeVGA;
        this.interfaceCI = interfaceCI;
        this.entreeOptique = entreeOptique;
        this.wifiIntegre = wifiIntegre;
        this.bluetooth = bluetooth;
        this.dimension_avec_pied = dimension_avec_pied;
        this.dimension_sans_pied = dimension_sans_pied;
        this.technologie_eclairage = technologie_eclairage;
    }


    public double getTailleEcran() {
        return this.tailleEcran;
    }

    public void setTailleEcran(double tailleEcran) {
        this.tailleEcran = tailleEcran;
    }

    public String getTypeEcran() {
        return this.typeEcran;
    }

    public void setTypeEcran(String typeEcran) {
        this.typeEcran = typeEcran;
    }

    public boolean isSmartTV() {
        return this.smartTV;
    }

    public boolean getSmartTV() {
        return this.smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public String getTypeRectro() {
        return this.typeRectro;
    }

    public void setTypeRectro(String typeRectro) {
        this.typeRectro = typeRectro;
    }

    public String getNormeHD() {
        return this.normeHD;
    }

    public void setNormeHD(String normeHD) {
        this.normeHD = normeHD;
    }

    public String getResolutionAffichage() {
        return this.resolutionAffichage;
    }

    public void setResolutionAffichage(String resolutionAffichage) {
        this.resolutionAffichage = resolutionAffichage;
    }

    public String getFluiditeConstructeur() {
        return this.fluiditeConstructeur;
    }

    public void setFluiditeConstructeur(String fluiditeConstructeur) {
        this.fluiditeConstructeur = fluiditeConstructeur;
    }

    public String getTuner() {
        return this.tuner;
    }

    public void setTuner(String tuner) {
        this.tuner = tuner;
    }

    public boolean isDirectWifi() {
        return this.directWifi;
    }

    public boolean getDirectWifi() {
        return this.directWifi;
    }

    public void setDirectWifi(boolean directWifi) {
        this.directWifi = directWifi;
    }

    public int getPuissanceSonore() {
        return this.puissanceSonore;
    }

    public void setPuissanceSonore(int puissanceSonore) {
        this.puissanceSonore = puissanceSonore;
    }

    public int getEntreeHDMI() {
        return this.entreeHDMI;
    }

    public void setEntreeHDMI(int entreeHDMI) {
        this.entreeHDMI = entreeHDMI;
    }

    public int getEntreeUSB() {
        return this.entreeUSB;
    }

    public void setEntreeUSB(int entreeUSB) {
        this.entreeUSB = entreeUSB;
    }

    public int getEntreePrisePeritel() {
        return this.entreePrisePeritel;
    }

    public void setEntreePrisePeritel(int entreePrisePeritel) {
        this.entreePrisePeritel = entreePrisePeritel;
    }

    public int getEntreeRCA() {
        return this.entreeRCA;
    }

    public void setEntreeRCA(int entreeRCA) {
        this.entreeRCA = entreeRCA;
    }

    public int getEntreeVGA() {
        return this.entreeVGA;
    }

    public void setEntreeVGA(int entreeVGA) {
        this.entreeVGA = entreeVGA;
    }

    public boolean isInterfaceCI() {
        return this.interfaceCI;
    }

    public boolean getInterfaceCI() {
        return this.interfaceCI;
    }

    public void setInterfaceCI(boolean interfaceCI) {
        this.interfaceCI = interfaceCI;
    }

    public boolean isEntreeOptique() {
        return this.entreeOptique;
    }

    public boolean getEntreeOptique() {
        return this.entreeOptique;
    }

    public void setEntreeOptique(boolean entreeOptique) {
        this.entreeOptique = entreeOptique;
    }

    public boolean isWifiIntegre() {
        return this.wifiIntegre;
    }

    public boolean getWifiIntegre() {
        return this.wifiIntegre;
    }

    public void setWifiIntegre(boolean wifiIntegre) {
        this.wifiIntegre = wifiIntegre;
    }

    public boolean isBluetooth() {
        return this.bluetooth;
    }

    public boolean getBluetooth() {
        return this.bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Dimension getDimension_avec_pied() {
        return this.dimension_avec_pied;
    }

    public void setDimension_avec_pied(Dimension dimension_avec_pied) {
        this.dimension_avec_pied = dimension_avec_pied;
    }

    public Dimension getDimension_sans_pied() {
        return this.dimension_sans_pied;
    }

    public void setDimension_sans_pied(Dimension dimension_sans_pied) {
        this.dimension_sans_pied = dimension_sans_pied;
    }

    public String getTechnologie_eclairage() {
        return this.technologie_eclairage;
    }

    public void setTechnologie_eclairage(String technologie_eclairage) {
        this.technologie_eclairage = technologie_eclairage;
    }

}


    

