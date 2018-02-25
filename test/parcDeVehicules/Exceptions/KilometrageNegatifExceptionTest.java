/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules.Exceptions;

import parcDeVehicules.Exceptions.KilometrageNegatifException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.LimKilometrageDepasseException;
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
 * Test de l'exception KilometrageNegatifException
 * @author aprobst
 */
public class KilometrageNegatifExceptionTest {
    private Vehicule vehicule;
    private Parc parc;
    

    @Before
    public void setUp() throws DureeDeVieDepasseException, VehiculeInvalideException {
        vehicule = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
    }
    
    /**
     * On vérifie que l'exception KilometrageNegatifException se déclanche bien.
     * @throws KilometrageNegatifException
     * @throws LimKilometrageDepasseException
     */
    @Test
    public void testSomeMethod() throws KilometrageNegatifException, LimKilometrageDepasseException {
              try {
                 vehicule.setKilometrage(-950);
                 fail("Suppose to raise exception");
                } catch (KilometrageNegatifException e) {
                    assertThat(e.getMessage(), containsString("Vous rentrez un kilométrage négatif"));

                }
    }
    
}
