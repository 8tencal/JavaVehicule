/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules;

import parcDeVehicules.InterventionCarrosserie;
import parcDeVehicules.PiecesCarrosserie;
import parcDeVehicules.TypeInterventionCarrosserie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test de la classe interventionCarrosserie
 * @author aprobst
 */
public class InterventionCarrosserieTest {
InterventionCarrosserie intervention;

    @Before
    public void setUp() {
        intervention = new InterventionCarrosserie(TypeInterventionCarrosserie.debosselage,"Debosselage Capot", "J'ai débosselé la 206",  PiecesCarrosserie.capot);
   
    }
    
    @After
    public void tearDown() {
        intervention=null;
    }

    /**
     * On vérifie que le type intervention carrosserie renvoyé est bien le bon
     * Test of getTypeInterventionCarrosserie method, of class InterventionCarrosserie.
     */
    @Test
    public void testGetTypeInterventionCarrosserie() {
        System.out.println("getTypeInterventionCarrosserie");
        TypeInterventionCarrosserie yolo;
        yolo=intervention.getTypeInterventionCarrosserie();
        assertTrue(yolo==TypeInterventionCarrosserie.debosselage);
    }

    /**
     * On test si le libellé renvoyé par la méthode est bien le bon.
     */
    @Test
    public void testGetLibelle() {
        System.out.println("getLibelle");
        String yolo;
        yolo=intervention.getLibelle();
        assertEquals("Debosselage Capot",yolo);
    }

    /**
     * On test si le message de l'intervention renvoyé est bien le bon.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        String yolo;
        yolo=intervention.getMessage();
        assertEquals("J'ai débosselé la 206",yolo);
    }

    /**
     * On test si la pièce renvoyé par la méthode est bien la bonne.
     */
    @Test
    public void testGetPiece() {
        System.out.println("getPiece");
        PiecesCarrosserie yolo;
        yolo=intervention.getPiece();
        assertEquals(yolo,intervention.getPiece());
    }
    
}
