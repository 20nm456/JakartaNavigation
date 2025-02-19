/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navigation;

import jakarta.faces.context.FacesContext;
import java.io.IOException;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named(value="navgationController")
@RequestScoped

/**
 *
 * @author g
 */
public class NavigationBean {
    
    
    public void voirAjouter(){
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("ajouter.xhtml");
        }catch (IOException e){
            e.printStackTrace();
                }
    }
    public void voirApropos(){
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("a_propos.xhtml");
        }catch (IOException e){
            e.printStackTrace();
                }
    }
    
    public void voirVisiter(){
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("visiter.xhtml");
        }catch (IOException e){
            e.printStackTrace();
                }
    }
}
