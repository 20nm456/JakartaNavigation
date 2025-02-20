/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navigation;

/**
 *
 * @author g
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author user
 */

@Entity
@Table(name = "lieu")
public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom_lieu;
    private String description;
    private double longitude;
    private double latitude;


    public Lieu() {
    }

    public Lieu(String nom, String description, double longitude, double latitude) {
        this.nom_lieu = nom;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public int getId() { return id; }
    public String getNom() { return nom_lieu; }
    public void setNom(String nom) { this.nom_lieu = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
}
