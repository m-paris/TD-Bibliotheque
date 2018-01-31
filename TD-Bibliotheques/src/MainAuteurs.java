/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-paris
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainAuteurs {
    
    public static void main(String[]args){
        String tab[];
        tab = new String[4];
        ArrayList<Auteur> lesAuteurs = new ArrayList<Auteur>();
       ArrayList <String> words = new ArrayList<String> ();
      
        try {
            String csvFile = "/home/m-paris/NetBeansProjects/TD-Bibliotheques/TD-Bibliotheques/src/auteurs.csv";
            
            String delimiter = ",";
            String line;
            StringTokenizer strToken;
            BufferedReader bufferReader;

            // Ouvrir le fichier CSV
            bufferReader = new BufferedReader(new FileReader(csvFile));

            // parcourir les lignes du fichier CSV
            while ((line = bufferReader.readLine()) != null) {
                int i = 0;
                // Parcourir les champs sÃ©parÃ©s par delimiter
                strToken = new StringTokenizer(line, delimiter);
                while (strToken.hasMoreTokens()) {
                    tab[i] = strToken.nextToken();
                    
                    i++;
                }
                lesAuteurs.add(new Auteur(tab[0],tab[1], Integer.parseInt(tab[2]), Integer.parseInt(tab[3])));
               
               
                
           }
       } catch (IOException ex) {
           Logger.getLogger(MainAuteurs.class.getName()).log(Level.SEVERE, null, ex);
       }
        for (int i=0; i<lesAuteurs.size(); i++){
            System.out.println(lesAuteurs.get(i));
        }
   }
    }

