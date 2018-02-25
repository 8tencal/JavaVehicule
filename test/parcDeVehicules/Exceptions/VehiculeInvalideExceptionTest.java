/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules.Exceptions;

import parcDeVehicules.Exceptions.VehiculeInvalideException;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.internal.matchers.StringContains.containsString;
import parcDeVehicules.CategorieVehicule;
import parcDeVehicules.Parc;
import parcDeVehicules.TypeVehicule;
import parcDeVehicules.Vehicule;

/**
 *
 * @author aprobst
 */
public class VehiculeInvalideExceptionTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() throws DureeDeVieDepasseException, VehiculeInvalideException {
        Parc parc = new Parc("yooolooo");
        try {
        Vehicule vehicule = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Service_pour_les_Responsables,TypeVehicule.bus,parc,1);
        fail("Suppose to raise exception.");
        } catch (VehiculeInvalideException e) {
                    assertThat(e.getMessage(), containsString("Ce type de véhicule associé a cette catégorie n'est pas autorisé dans le parc"));

                }
    }
    
}
