/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules;

import parcDeVehicules.TypeVehicule;
import parcDeVehicules.InterventionCarrosserie;
import parcDeVehicules.Parc;
import parcDeVehicules.PiecesCarrosserie;
import parcDeVehicules.InterventionMecanique;
import parcDeVehicules.TypeInterventionCarrosserie;
import parcDeVehicules.PiecesMecanique;
import parcDeVehicules.TypeInterventionMecanique;
import parcDeVehicules.Vehicule;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.KilometrageNegatifException;
import parcDeVehicules.Exceptions.LimKilometrageDepasseException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;


/**
 * Ceci est la classe de test de la classe Vehicule.
 * @author aprobst
 */
public class VehiculeTest extends TestCase {
    private Vehicule vehicule;
    private Parc parc;
    

    
    @Before
    public void setUp() throws LimKilometrageDepasseException, DureeDeVieDepasseException, VehiculeInvalideException {
        parc = new Parc("yololand");
        vehicule = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
    }
    
    @After
    public void tearDown() {
        parc=null;
        vehicule=null;
    }

    /**
     * Test of afficherVehicule method, of class Vehicule.
     * On test si l'affichage se fait correctement.
     */
    @Test
    public void testAfficherVehicule() {
        System.out.println("afficherVehicule");
        String yolo=vehicule.afficherVehicule();
        assertEquals("Vehicule{kilometrage=500.0, marque=YOLO, dureeDeVie=3.0, categorie=vehicules_de_Service_pour_les_Responsables}",yolo);
    }
    
    /**
     * Test of immobiliserVehicule method, of class Vehicule.
     * On test si la méthode immobiliser immobile correctement le vehicule.
     */
    @Test
    public void testImmobiliserVehicule() {
        System.out.println("immobiliserVehicule");
        vehicule.immobiliserVehicule();
        assertTrue(vehicule.isImmobilise());
    }

    /**
     * Test of renseignerInterventionCarrosserie method, of class Vehicule.
     * Vérification de si la méthode renseignerInterventionMecanique ajoute correctement l'intervention au véhicule concerné.
     */
    @Test
    public void testRenseignerInterventionMecanique() {
        System.out.println("renseignerInterventionMecanique");
        InterventionMecanique intervention = new InterventionMecanique(TypeInterventionMecanique.reparation,"Reparation ventilateur", "J'ai réparer le ventilateur de la 206",  PiecesMecanique.ventilateur);
        vehicule.renseignerInterventionMecanique(intervention);
        assertTrue(vehicule.getInterventionsMecanique().contains(intervention));
    }

    /**
     * Test of renseignerInterventionMecanique method, of class Vehicule.
     * Vérification de si la méthode renseignerInterventionCarrosserie ajoute correctement l'intervention au véhicule concerné.
     */
    @Test
    public void testRenseignerInterventionCarrosserie() {
        System.out.println("renseignerInterventionCarrosserie");
        InterventionCarrosserie intervention = new InterventionCarrosserie(TypeInterventionCarrosserie.rayure,"Reparation coffre", "J'ai poncé la rayure",  PiecesCarrosserie.coffre);
        InterventionCarrosserie intervention1 = new InterventionCarrosserie(TypeInterventionCarrosserie.rayure,"Reparation coffre", "J'ai poncé la rayure",  PiecesCarrosserie.coffre);
        vehicule.renseignerInterventionCarrosserie(intervention);
        vehicule.renseignerInterventionCarrosserie(intervention1);
        assertTrue(vehicule.getInterventionsCarrosserie().contains(intervention) && vehicule.getInterventionsCarrosserie().contains(intervention1));
    }

    /**
     * Test of getKilometrage method, of class Vehicule.
     * On vérifie que la méthode getKilométrage renvoie le bon kilométrage.
     */
    @Test
    public void testGetKilometrage() {
        System.out.println("getKilometrage");
        assertEquals(500.0,vehicule.getKilometrage());
    }

    /**
     * Test of getMarque method, of class Vehicule.
     * On vérifie que la méthode getMarque renvoie la marque correspondant a ce véhicule.
     */
    @Test
    public void testGetMarque() {
        System.out.println("getMarque");
        assertEquals("YOLO",vehicule.getMarque());
    }

    /**
     * Test of getDureeDeVie method, of class Vehicule.
     * On vérifie que la méthode getDureeDeVie renvoie la bonne durée de vie.
     */
    @Test
    public void testGetDureeDeVie() {
        System.out.println("getDureeDeVie");
        assertEquals(3.0,vehicule.getDureeDeVie());
    }

    /**
     * Test of getCategorie method, of class Vehicule.
     * On vérrifie que le getCategorie renvoie la catégorie correspondant au véhicule.
     */
    @Test
    public void testGetCategorie() {
        System.out.println("getCategorie");
        assertEquals(vehicules_de_Service_pour_les_Responsables,vehicule.getCategorie());
    }

    /**
     * Test of isImmobilise method, of class Vehicule.
     */
    @Test
    public void testIsImmobilise() {
        System.out.println("isImmobilise");
        vehicule.immobiliserVehicule();
        assertTrue(vehicule.isImmobilise());
    }

    /**
     * Test of getLimKilometrageAnnuel method, of class Vehicule.
     * On test si le getLimKilometrageAnnuel renvoie la bonne limite du kilométrage annuel du véhicule.
     */
    @Test
    public void testGetLimKilometrageAnnuel() {
        System.out.println("getLimKilometrageAnnuel");
        assertEquals(15000.0,vehicule.getLimKilometrageAnnuel());
    }

    /**
     * Test of getLimKilometrageApresRevision method, of class Vehicule.
     * On test si le getLimKilometrageApresRevision renvoie la bonne limite de kilométrage avant une révision du véhicule.
     */
    @Test
    public void testGetLimKilometrageAvantRevision() {
        System.out.println("getLimKilometrageApresRevision");
        assertEquals(8000.0,vehicule.getLimKilometrageApresRevision());
    }

    /**
     * Test of getInterventionsCarrosserie method, of class Vehicule.
     * On test si le getInterventionCarrosserie nous renvoie bien les interventions Carrosserie qu'on a ajouté au Vehicule.
     */
    @Test
    public void testGetInterventionsCarrosserie() {
        System.out.println("getInterventionsCarrosserie");
        InterventionCarrosserie intervention = new InterventionCarrosserie(TypeInterventionCarrosserie.rayure,"Reparation coffre", "J'ai poncé la rayure",  PiecesCarrosserie.coffre);
        vehicule.renseignerInterventionCarrosserie(intervention);
        assertTrue(vehicule.getInterventionsCarrosserie().contains(intervention));
    }

    /**
     * Test of getInterventionsMecanique method, of class Vehicule.
     * On test si le getInterventionMecanique nous renvoie bien les interventions Mécaniques qu'on a ajouté au Vehicule.
     */
    @Test
    public void testGetInterventionsMecanique() {
        System.out.println("getInterventionsMecanique");
        InterventionMecanique intervention = new InterventionMecanique(TypeInterventionMecanique.reparation,"Reparation ventilateur", "J'ai réparer le ventilateur de la 206",  PiecesMecanique.ventilateur);
        vehicule.renseignerInterventionMecanique(intervention);
        assertTrue(vehicule.getInterventionsMecanique().contains(intervention));
    }

    /**
     * Test of setKilometrage method, of class Vehicule.
     * On regarde si la méthode setKilométrage marche correctement.
     * @throws parcDeVehicules.Exceptions.LimKilometrageDepasseException
     * @throws parcDeVehicules.Exceptions.KilometrageNegatifException
     */
    @Test
    public void testSetKilometrage() throws LimKilometrageDepasseException, KilometrageNegatifException {
        System.out.println("setKilometrage");
        vehicule.setKilometrage(550);
        assertEquals(550.0,vehicule.getKilometrage());
        assertEquals(50.0,vehicule.getKilometrageApresRevision());
        assertEquals(50.0,vehicule.getKilometrageAnnuel());
    }

    

    /**
     * Test of getType method, of class Vehicule.
     * On verifie que le getType renvoie le bon type de véhicule.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        assertEquals(TypeVehicule.voiture,vehicule.getType());
    }

    /**
     * Test of getKilometrageAnnuel method, of class Vehicule.
     * On vérifie que la méthode getKilometrageAnnuel renvoie la bonne valeur.
     */
    @Test
    public void testGetKilometrageAnnuel() throws LimKilometrageDepasseException, KilometrageNegatifException {
        System.out.println("getKilometrageAnnuel");
        vehicule.setKilometrage(550);
        assertEquals(50.0,vehicule.getKilometrageAnnuel());
    }

    /**
     * Test of getKilometrageApresRevision method, of class Vehicule.
     * On vérigie que la méthode getKilométrageAvantRévision renvoie la bonne valeur.
     */
    @Test
    public void testGetKilometrageAvantRevision() throws LimKilometrageDepasseException, KilometrageNegatifException {
        System.out.println("getKilometrageApresRevision");
        vehicule.setKilometrage(550);
        assertEquals(50.0,vehicule.getKilometrageApresRevision());
    }
    @Test
    public void testSetAge() throws KilometrageNegatifException, LimKilometrageDepasseException, DureeDeVieDepasseException {
        System.out.println("testSetAge");
        vehicule.setAge(2);
        assertEquals(2.0,vehicule.getAge());
    }
    @Test
    public void testGetAge() {
        System.out.println("testGetAge");
        assertEquals(0.0,vehicule.getAge());
    }
}
