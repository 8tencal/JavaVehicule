/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcDeVehicules.Exceptions;

import parcDeVehicules.Exceptions.VehiculeInvalideException;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.internal.matchers.StringContains.containsString;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;
import parcDeVehicules.Parc;
import parcDeVehicules.TypeVehicule;
import parcDeVehicules.Vehicule;

/**
 *
 * @author aprobst
 */
public class DureeDeVieDepasseExceptionTest {
    private Vehicule vehicule;
    private Parc parc;
    
    public DureeDeVieDepasseExceptionTest() {
    }
    
    @Before
    public void setUp() throws DureeDeVieDepasseException, VehiculeInvalideException {
        vehicule = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,1);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
           try {
                 vehicule.setAge(9);
                 fail("Suppose to raise exception");
                } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
}