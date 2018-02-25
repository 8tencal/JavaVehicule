/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcDeVehicules;

import java.util.ArrayList;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.KilometrageNegatifException;
import parcDeVehicules.Exceptions.LimKilometrageDepasseException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;


/**
 * Ceci est la classe qui nous sert de Main.
 * @author aprobst
 */
public class ParcDeVehicules {

    /**
     * C'est le Main.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LimKilometrageDepasseException, KilometrageNegatifException, DureeDeVieDepasseException, VehiculeInvalideException {
            Parc parc = new Parc("yololand");
           Vehicule vehicule = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
           Vehicule vehicule1 = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
                 System.out.println(vehicule.afficherVehicule());
           /*  System.out.println(vehicule.afficherVehicule());
                   InterventionMecanique intervention = new InterventionMecanique(TypeInterventionMecanique.reparation,"Reparation ventilateur", "J'ai réparer le ventilateur de la 206",  PiecesMecanique.ventilateur);
   
                   PiecesMecanique test;
        test=intervention.getPiece();
        System.out.println(test);
        System.out.println(intervention.getPiece());*/
ArrayList liste2 = parc.retournerListeVehiculesRouge();
			for (int j = 0; j < liste2.size(); j++) {
				Vehicule yolo=(Vehicule) liste2.get(j);
                                yolo.afficherVehicule();
			}
         /*  boolean vrai=false;
           if (300<301)
           {
               vrai=true;
           }
           System.out.print(vrai);
                      vehicule.setKilometrage(750);
           
        System.out.println(vehicule.afficherVehicule());
*/
    }
}
