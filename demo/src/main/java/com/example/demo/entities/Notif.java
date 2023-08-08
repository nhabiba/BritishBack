package com.example.demo.entities;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Notif {
  @Id
  @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int id;
   private String objets;
   private String description;
   private String img;
   @OneToMany(fetch = FetchType.EAGER)
   private List<Machine> machines;


    public Notif() {
    }



    public Notif(int id, String objets, String description, String img, List<Machine> machines) {
        this.id = id;
        this.objets = objets;
        this.description = description;
        this.img = img;
        this.machines = machines;
    }
    


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjets() {
        return this.objets;
    }

    public void setObjets(String objets) {
        this.objets = objets;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Machine> getMachines() {
        return this.machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

}


