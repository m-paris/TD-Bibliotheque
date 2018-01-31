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
    
    private String nom,prenom,anneeNaissance,AnneeDeces;

    public Auteur(String nom, String prenom, String anneeNaissance, String AnneeDeces) {
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

    public String getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(String anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public String getAnneeDeces() {
        return AnneeDeces;
    }

    public void setAnneeDeces(String AnneeDeces) {
        this.AnneeDeces = AnneeDeces;
    }

    @Override
    public String toString() {
        return "Auteur{" + "nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", AnneeDeces=" + AnneeDeces + '}';
    }
    
    
}
