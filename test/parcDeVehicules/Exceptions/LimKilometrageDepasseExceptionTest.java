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
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.internal.matchers.StringContains.containsString;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;
import parcDeVehicules.Parc;
import parcDeVehicules.TypeVehicule;
import parcDeVehicules.Vehicule;

/**
 * Cette classe permet de tester si les exceptions se lancent bel et bien.
 * @author aprobst
 */
public class LimKilometrageDepasseExceptionTest {
    private Vehicule vehicule2;
    private Vehicule vehicule3;
    

    
    @Before
    public void setUp() throws DureeDeVieDepasseException, VehiculeInvalideException {
                Parc parc = new Parc("yololand");
        vehicule2 = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
        vehicule3 = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
    }

    /**
     *  On vérifie que l'exception LimKilometrageDepasseException se déclanche bien.
     * @throws LimKilometrageDepasseException
     * @throws KilometrageNegatifException
     */
    @Test
    public void testSomeMethod() throws LimKilometrageDepasseException, KilometrageNegatifException {
                try {
                    vehicule3.resetKilometrage();
                 vehicule3.setKilometrage(8001);
                 fail("Suppose to raise exception");
                } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé"));

                }
                                try {
                 vehicule2.setKilometrage(15001);
                 fail("Suppose to raise exception");
                } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
}
