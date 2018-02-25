/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules;

import parcDeVehicules.InterventionMecanique;
import parcDeVehicules.PiecesMecanique;
import parcDeVehicules.TypeInterventionMecanique;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 * Classe de test de la classe InterventionMecanique
 * @author aprobst
 */
public class InterventionMecaniqueTest {
    private InterventionMecanique intervention;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        intervention = new InterventionMecanique(TypeInterventionMecanique.reparation,"Reparation ventilateur", "J'ai réparer le ventilateur de la 206",  PiecesMecanique.ventilateur);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Permet de savoir si le getter du typeInterventionMecanique fonctionne correctement.
     * Test of getTypeInterventionMecanique method, of class InterventionMecanique.
     */
    @Test
    public void testGetTypeInterventionMecanique() {
        System.out.println("getTypeInterventionMecanique");
        TypeInterventionMecanique yolo;
        yolo=intervention.getTypeInterventionMecanique();
        assertTrue(yolo==TypeInterventionMecanique.reparation);
    }

    /**
     * Permet de savoir si le getter du Libelle fonctionne correctement et nous renvoie la bonne valeur.
     */
    @Test
    public void testGetLibelle() {
        System.out.println("getLibelle");
        String yolo;
        yolo=intervention.getLibelle();
        assertEquals("Reparation ventilateur",yolo);
    }

    /**
     * Permet de savoir si la méthode getMessage d'InterventionMecanique fonctionne correctement et renvoie le bon message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        String yolo;
        yolo=intervention.getMessage();
        assertEquals("J'ai réparer le ventilateur de la 206",yolo);
    }

    /**
     * Permet de tester si la méthode getPiece d'InterventionMecanique fonctionne correctement et renvoie le bon message
     */
    @Test
    public void testGetPiece() {
        System.out.println("getPiece");
        PiecesMecanique yolo;
        yolo=intervention.getPiece();
        assertEquals(yolo,intervention.getPiece());
    }
    
}
