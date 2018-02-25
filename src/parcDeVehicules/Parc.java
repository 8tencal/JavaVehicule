/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcDeVehicules;

import java.util.ArrayList;

/**
 * Ceci est la classe Parc, elle correspond au parc comprenant des voitures.
 * @author aprobst
 */
public class Parc {
    private String nom;
    private ArrayList<Vehicule> liste;

    /**
     * C'est le constructeur de la classe parc, on lui donne un nom et on 
     * instancie une liste qui stockera les véhicules
     * @param nom
     */
    public Parc(String nom) {
        this.nom = nom;
        this.liste = new ArrayList<>();
    }
    
    /**
     * Cette méthode permet l'ajout d'un véhicule dans la liste du parc.
     * @param vehicule
     */
    public void ajouterVehicule(Vehicule vehicule)
    {
        liste.add(vehicule);
    }
    /**
     * Cette méthode permet de retirer un véhicule de la liste du parc
     * @param vehicule
     */
    public void retirerVehicule(Vehicule vehicule)
    {
        liste.remove(vehicule);
    }
    /**
     * Cette méthode permet de retourner tout les véhicules de la liste ayant
     * un kilométrage annuel inférieur a 50% de la limite autorisé ET aussi
     * un kilométrage avant révision inférieur a 50% de la limite autorisé.
     * @return listeVert
     */
    public ArrayList retournerListeVehiculesVert(){
     ArrayList<Vehicule> listeVert = new ArrayList();

            for (Vehicule x : liste)
            {
                 if((x.getKilometrageAnnuel()<(x.getLimKilometrageAnnuel()/2)) && (x.getKilometrageApresRevision()<(x.getLimKilometrageApresRevision()/2)))
                {
                listeVert.add(x);
                }
            }
            return listeVert;        
    }
    
      /**
     * Cette méthode permet de retourner tout les véhicules de la liste ayant
     * un kilométrage annuel entre 50% et 75% de la limite autorisé OU un
     * kilométrage avant révision entre 50% et 75% de la limite autorisé.
     * @return listeOrange
     */
    public ArrayList retournerListeVehiculesOrange(){
     ArrayList<Vehicule> listeOrange = new ArrayList();

            for (Vehicule x : liste)
            {
                if(((x.getLimKilometrageAnnuel()/2<=x.getKilometrageAnnuel() && x.getKilometrageAnnuel()<x.getLimKilometrageAnnuel()*075)||(x.getLimKilometrageApresRevision()/2<=x.getKilometrageApresRevision() && x.getKilometrageApresRevision()<x.getLimKilometrageApresRevision()*075)) && ((x.getKilometrageAnnuel()<x.getLimKilometrageAnnuel()*0.75) && (x.getKilometrageApresRevision() < x.getLimKilometrageApresRevision()*0.75)))
                {
                listeOrange.add(x);
                }
            }
            return listeOrange;        
    }

    /**
     * Cette méthode permet de retourner tout les véhicules de la liste ayant
     * un kilométrage annuel au dessus de 75% de la limite autorisé OU un
     * kilométrage avant révision au dessus de 75% de la limite autorisé.
     * @return listeRouge
     */
    public ArrayList retournerListeVehiculesRouge(){
     ArrayList<Vehicule> listeRouge = new ArrayList();

            for (Vehicule x : liste)
            {
                 if((x.getKilometrageAnnuel()>=x.getLimKilometrageAnnuel()*0.75) || (x.getKilometrageApresRevision()>=x.getLimKilometrageApresRevision()*0.75))
                {
                listeRouge.add(x);
                }
            }
            return listeRouge;        
    }

    /**
     * Cette méthode retourne la liste de tout les véhicules du parc.
     * @return liste
     */
    public ArrayList<Vehicule> getListe() {
        return liste;
    }
         
}
