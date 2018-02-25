/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules;

import parcDeVehicules.Exceptions.KilometrageNegatifException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.LimKilometrageDepasseException;
import parcDeVehicules.TypeVehicule;
import parcDeVehicules.Parc;
import parcDeVehicules.Vehicule;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;



/**
 * Classe de test de la classe Parc.
 * @author aprobst
 */
public class ParcTest {
    private Vehicule vehicule;
    private Parc parc;

    
    @Before
    public void setUp() throws DureeDeVieDepasseException, VehiculeInvalideException {
        parc = new Parc("yololand");
        vehicule = new Vehicule(0,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
        parc.ajouterVehicule(vehicule);

    }
    
    @After
    public void tearDown() {
        parc=null;
        vehicule=null;
        vehicule=null;
    }

    /**
     * On vérifie que la méthode ajoute bien les véhicules a la liste du parc
     * Test of ajouterVehicule method, of class Parc.
     */
    @Test
    public void testAjouterVehicule() {
        System.out.println("ajouterVehicule");
        assertTrue(parc.getListe().contains(vehicule));
        
    }

    /**
     * On fait les test au limites pour être sur que la méthode nous renvoie bien les voitures que l'on veut et pas les autres.
     * Test of retournerListeVehiculesVert method, of class Parc.
     * @throws parcDeVehicules.Exceptions.LimKilometrageDepasseException
     * @throws parcDeVehicules.Exceptions.KilometrageNegatifException
     */
    @Test
    public void testRetournerListeVehiculesVert() throws LimKilometrageDepasseException, KilometrageNegatifException {
        System.out.println("retournerListeVehiculesVert");
        //test de lim apres revision (on fait des tests aux limites.)
        vehicule.setKilometrage(0);
        assertTrue(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrage(3999);
        assertTrue(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrage(4000);
        assertFalse(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrage(4001);
        assertFalse(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrage(5001);
        assertFalse(parc.retournerListeVehiculesVert().contains(vehicule));
        //test de limAnnee (on fait des tests au limites)
        vehicule.setKilometrageApresRevision(0);
        vehicule.setKilometrage(7499);
        assertTrue(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrage(7500);
        assertFalse(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrage(7501);
        assertFalse(parc.retournerListeVehiculesVert().contains(vehicule));
        vehicule.setKilometrageApresRevision(0);
        vehicule.setKilometrage(14001);
        assertFalse(parc.retournerListeVehiculesVert().contains(vehicule));
    }

    /**
     * On fait les test au limites pour être sur que la méthode nous renvoie bien les voitures que l'on veut et pas les autres.
     * Test of retournerListeVehiculesOrange method, of class Parc.
     * @throws parcDeVehicules.Exceptions.LimKilometrageDepasseException
     * @throws parcDeVehicules.Exceptions.KilometrageNegatifException
     */
    @Test
    public void testRetournerListeVehiculesOrange() throws LimKilometrageDepasseException, KilometrageNegatifException {
        System.out.println("retournerListeVehiculesOrange");
           //test de lim apres revision (on fait des tests aux limites)
        vehicule.resetKilometrage();
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrage(3999);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrage(4000);
        assertTrue(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrage(4001);
        assertTrue(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrage(5999);
        assertTrue(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrage(6000);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrageAnnuel(0);
        vehicule.setKilometrage(7999);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        
        //test de limAnnee (on fait des tests aux limites)
        
        vehicule.resetKilometrage();
        vehicule.setKilometrage(7499);
        vehicule.setKilometrageApresRevision(0);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        
        vehicule.setKilometrage(7500);
        assertTrue(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrageApresRevision(0);
       vehicule.setKilometrage(11249);
        assertTrue(parc.retournerListeVehiculesOrange().contains(vehicule));
        
        vehicule.setKilometrage(11250);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        
        vehicule.setKilometrage(11251);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));
        vehicule.setKilometrageApresRevision(0);
        vehicule.setKilometrage(14000);
        assertFalse(parc.retournerListeVehiculesOrange().contains(vehicule));


    }

    /**
     * Test of retournerListeVehiculesRouge method, of class Parc.
     * On fait les test au limites pour être sur que la méthode nous renvoie bien les voitures que l'on veut et pas les autres.
     * @throws parcDeVehicules.Exceptions.LimKilometrageDepasseException
     * @throws parcDeVehicules.Exceptions.KilometrageNegatifException
     */
    @Test
    public void testRetournerListeVehiculesRouge() throws LimKilometrageDepasseException, KilometrageNegatifException {
        System.out.println("retournerListeVehiculesRouge");
        //test de lim apres revision (on fait des tests aux limites)
        vehicule.resetKilometrage();
        assertFalse(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(5999);
        assertFalse(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(6000);
        assertTrue(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(6001);
        assertTrue(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(7999);
        assertTrue(parc.retournerListeVehiculesRouge().contains(vehicule));
        
        //test de limAnnee (on fait des tests aux limites)
        vehicule.setKilometrageApresRevision(0);
        assertFalse(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(11249);
        assertFalse(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(11250);
        assertTrue(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrage(11251);
        assertTrue(parc.retournerListeVehiculesRouge().contains(vehicule));
        vehicule.setKilometrageApresRevision(0);
        vehicule.setKilometrage(14999);
        assertTrue(parc.retournerListeVehiculesRouge().contains(vehicule));
        
    }
    
}
