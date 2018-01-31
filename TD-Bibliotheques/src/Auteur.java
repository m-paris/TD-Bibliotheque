/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-paris
 */
public class Auteur {
    
    private String nom,prenom;
    private int anneeNaissance,AnneeDeces;

    public Auteur(String nom, String prenom, int anneeNaissance, int AnneeDeces) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.AnneeDeces = AnneeDeces;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   

    @Override
    public String toString() {
        return "Auteur{" + "nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", AnneeDeces=" + AnneeDeces + '}';
    }
    
    
}
