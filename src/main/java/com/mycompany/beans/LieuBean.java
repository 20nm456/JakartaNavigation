package com.mycompany.beans;

import business.LieuEntrepriseBean;
import com.mycompany.navigation.Lieu;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "lieuBean")
@RequestScoped
public class LieuBean implements Serializable {

    private int id;
    private String nom;
    private String description;
    private double longitude;
    private double latitude;

    @Inject
    private LieuEntrepriseBean lieuEntrepriseBean;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    
    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    
    public List<Lieu> getLieux() {
        return lieuEntrepriseBean.listerTousLesLieux();
    }
    
    public void ajouterLieu() {
        if (nom != null && !nom.isEmpty() && description != null && !description.isEmpty()) {
            lieuEntrepriseBean.ajouterLieuEntreprise(nom, description, latitude, longitude);
        }
    }
    
    public void supprimerLieu(int id) {
    System.out.println("Suppression du lieu avec ID : " + id);
    lieuEntrepriseBean.supprimerLieu(id);
    }

    
   public void preparerModification(Lieu lieu) {
    System.out.println("Modification du lieu : " + lieu.getId());
    this.id = lieu.getId();
    this.nom = lieu.getNom();
    this.description = lieu.getDescription();
    this.latitude = lieu.getLatitude();
    this.longitude = lieu.getLongitude();
}

    
    public void modifierLieu() {
        Lieu lieu = lieuEntrepriseBean.trouverLieuParId(id);
        if (lieu != null) {
            lieu.setNom(nom);
            lieu.setDescription(description);
            lieu.setLatitude(latitude);
            lieu.setLongitude(longitude);
            lieuEntrepriseBean.mettreAJourLieu(lieu);
        }
    }
}