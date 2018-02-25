/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules.testClassesEquivalance;

import junit.framework.TestCase;
import org.junit.After;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import static org.junit.internal.matchers.StringContains.containsString;
import parcDeVehicules.CategorieVehicule;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.LimKilometrageDepasseException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;
import parcDeVehicules.Parc;
import parcDeVehicules.TypeVehicule;
import parcDeVehicules.Vehicule;

/**
 *
 * @author aprobst
 */
public class TestLimKilometrageAnnuelVehicule extends TestCase {
    private Vehicule vehicule;
    private Parc parc;
    private Vehicule vehicule1;
    private Vehicule vehicule2;
    private Vehicule vehicule3;
    private Vehicule vehicule4;
    private Vehicule vehicule5;
    private Vehicule vehicule6;
    private Vehicule vehicule7;
    private Vehicule vehicule8;
    

    
    @Before
    public void setUp() throws LimKilometrageDepasseException, DureeDeVieDepasseException, VehiculeInvalideException {
        parc = new Parc("yololand");
        vehicule = new Vehicule(500,"YOLO",vehicules_de_Service_pour_les_Responsables,TypeVehicule.voiture,parc,0);
        vehicule1 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_dIntervention_pour_les_Techniciens,TypeVehicule.voiture,parc,0);
        vehicule2 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Transport_des_Employes,TypeVehicule.voiture,parc,0);
        vehicule3 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Service_pour_les_Responsables,TypeVehicule.utilitaire,parc,0);
        vehicule4 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_dIntervention_pour_les_Techniciens,TypeVehicule.utilitaire,parc,0);
        vehicule5 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Transport_des_Employes,TypeVehicule.camionnette,parc,0);
        vehicule6 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Transport_de_Passagers,TypeVehicule.camionnette,parc,0);
        vehicule7 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Transport_des_Employes,TypeVehicule.bus,parc,0);
        vehicule8 = new Vehicule(500,"YOLO",CategorieVehicule.vehicules_de_Transport_de_Passagers,TypeVehicule.bus,parc,0);
    }
    
    @After
    public void tearDown() {
        parc=null;
        vehicule=null;
        vehicule1=null;
        vehicule2=null;
        vehicule3=null;
        vehicule4=null;
        vehicule5=null;
        vehicule6=null;
        vehicule7=null;
        vehicule8=null;
        
        
    }
    
    @Test
    public void testKilometrageMaxAnnuelVoitureDeService() throws LimKilometrageDepasseException{
         vehicule.setKilometrageAnnuel(0);
         vehicule.setKilometrageAnnuel(14999);
        try {
        vehicule.setKilometrageAnnuel(15000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule.setKilometrageAnnuel(15001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule.setKilometrageAnnuel(30000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelVoitureIntervention() throws LimKilometrageDepasseException{
         vehicule1.setKilometrageAnnuel(0);
         vehicule1.setKilometrageAnnuel(19999);
        try {
        vehicule1.setKilometrageAnnuel(20000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule1.setKilometrageAnnuel(20001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule1.setKilometrageAnnuel(40000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelVoitureTransportEmployes() throws LimKilometrageDepasseException{
         vehicule2.setKilometrageAnnuel(0);
         vehicule2.setKilometrageAnnuel(19999);
        try {
        vehicule2.setKilometrageAnnuel(20000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule2.setKilometrageAnnuel(20001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule2.setKilometrageAnnuel(40000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelUtilitaireDeService() throws LimKilometrageDepasseException{
         vehicule3.setKilometrageAnnuel(0);
         vehicule3.setKilometrageAnnuel(14999);
        try {
        vehicule3.setKilometrageAnnuel(15000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule3.setKilometrageAnnuel(15001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule3.setKilometrageAnnuel(30000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelUtilitaireDintervention() throws LimKilometrageDepasseException{
         vehicule4.setKilometrageAnnuel(0);
         vehicule4.setKilometrageAnnuel(19999);
        try {
        vehicule4.setKilometrageAnnuel(20000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule4.setKilometrageAnnuel(20001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule4.setKilometrageAnnuel(30000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelCamionnetteTransportEmployes() throws LimKilometrageDepasseException{
         vehicule5.setKilometrageAnnuel(0);
         vehicule5.setKilometrageAnnuel(39999);
        try {
        vehicule5.setKilometrageAnnuel(40000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule5.setKilometrageAnnuel(40001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule5.setKilometrageAnnuel(60000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelCamionnetteTransportPassager() throws LimKilometrageDepasseException{
         vehicule6.setKilometrageAnnuel(0);
         vehicule6.setKilometrageAnnuel(39999);
        try {
        vehicule6.setKilometrageAnnuel(40000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule6.setKilometrageAnnuel(40001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule6.setKilometrageAnnuel(60000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelBusTransportEmployes() throws LimKilometrageDepasseException{
         vehicule7.setKilometrageAnnuel(0);
         vehicule7.setKilometrageAnnuel(59999);
        try {
        vehicule7.setKilometrageAnnuel(60000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule7.setKilometrageAnnuel(60001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule7.setKilometrageAnnuel(70000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxAnnuelBusTransportPassager() throws LimKilometrageDepasseException{
         vehicule8.setKilometrageAnnuel(0);
         vehicule8.setKilometrageAnnuel(59999);
        try {
        vehicule8.setKilometrageAnnuel(60000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule8.setKilometrageAnnuel(60001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule8.setKilometrageAnnuel(70000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Kilométrage annuel dépassé, véhicule immobilisé"));

                }
    }
    
    
}
