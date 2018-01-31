/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-paris
 */
public class Livre {
    
    private String titre, genre, anneeSortie, auteur;

    public Livre(String titre, String genre, String anneeSortie, String auteur) {
        this.titre = titre;
        this.genre = genre;
        this.anneeSortie = anneeSortie;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(String anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", genre=" + genre + ", anneeSortie=" + anneeSortie + ", auteur=" + auteur + '}';
    }
    
    
}
