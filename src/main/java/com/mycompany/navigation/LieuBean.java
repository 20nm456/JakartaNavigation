/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navigation;

/**
 *
 * @author g
 */
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named(value="lieuBean")
/**
 *
 * @author g
 */
public class LieuBean {
    private String nom;
    private String description;
    private String latitude;
    private String longitude;
    private List<Lieu> lieux = new ArrayList<>();
    private String message;

    // Getters et Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLatitude() { return latitude; }
    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }
    public void setLongitude(String longitude) { this.longitude = longitude; }

    public List<Lieu> getLieux() { return lieux; }

    public String getMessage() { return message; }

    public void ajouterLieu() {
        Lieu lieu = new Lieu(nom, description, latitude, longitude);
        lieux.add(lieu);
        message = "Lieu ajouté avec succès!";
        // Réinitialiser les champs
        nom = "";
        description = "";
        latitude = "";
        longitude = "";
    }
}

class Lieu {
    private String nom;
    private String description;
    private String latitude;
    private String longitude;

    public Lieu(String nom, String description, String latitude, String longitude) {
        this.nom = nom;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public String getLatitude() { return latitude; }
    public String getLongitude() { return longitude; }
}
