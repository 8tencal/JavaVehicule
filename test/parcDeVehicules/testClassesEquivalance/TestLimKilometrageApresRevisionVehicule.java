/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules.testClassesEquivalance;

import static junit.framework.Assert.fail;
import junit.framework.TestCase;
import org.junit.After;
import static org.junit.Assert.assertThat;
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
public class TestLimKilometrageApresRevisionVehicule extends TestCase {
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
    public void testKilometrageMaxApresRevisionVoitureDeService() throws LimKilometrageDepasseException{
         vehicule.setKilometrageApresRevision(0);
         vehicule.setKilometrageApresRevision(7999);
        try {
        vehicule.setKilometrageApresRevision(8000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule.setKilometrageApresRevision(8001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule.setKilometrageApresRevision(14000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionVoitureIntervention() throws LimKilometrageDepasseException{
         vehicule1.setKilometrageApresRevision(0);
         vehicule1.setKilometrageApresRevision(9999);
        try {
        vehicule1.setKilometrageApresRevision(10000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule1.setKilometrageApresRevision(10001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule1.setKilometrageApresRevision(14000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionVoitureTransportEmployes() throws LimKilometrageDepasseException{
         vehicule2.setKilometrageApresRevision(0);
         vehicule2.setKilometrageApresRevision(4999);
        try {
        vehicule2.setKilometrageApresRevision(5000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule2.setKilometrageApresRevision(5001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule2.setKilometrageApresRevision(9000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionUtilitaireDeService() throws LimKilometrageDepasseException{
         vehicule3.setKilometrageApresRevision(0);
         vehicule3.setKilometrageApresRevision(9999);
        try {
        vehicule3.setKilometrageApresRevision(10000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule3.setKilometrageApresRevision(10001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule3.setKilometrageApresRevision(30000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionUtilitaireDintervention() throws LimKilometrageDepasseException{
         vehicule4.setKilometrageApresRevision(0);
         vehicule4.setKilometrageApresRevision(9999);
        try {
        vehicule4.setKilometrageApresRevision(10000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule4.setKilometrageApresRevision(10001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule4.setKilometrageApresRevision(30000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionCamionnetteTransportEmployes() throws LimKilometrageDepasseException{
         vehicule5.setKilometrageApresRevision(0);
         vehicule5.setKilometrageApresRevision(4999);
        try {
        vehicule5.setKilometrageApresRevision(5000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule5.setKilometrageApresRevision(5001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule5.setKilometrageApresRevision(60000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionCamionnetteTransportPassager() throws LimKilometrageDepasseException{
         vehicule6.setKilometrageApresRevision(0);
         vehicule6.setKilometrageApresRevision(4999);
        try {
        vehicule6.setKilometrageApresRevision(5000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule6.setKilometrageApresRevision(5001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule6.setKilometrageApresRevision(60000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionBusTransportEmployes() throws LimKilometrageDepasseException{
         vehicule7.setKilometrageApresRevision(0);
         vehicule7.setKilometrageApresRevision(2999);
        try {
        vehicule7.setKilometrageApresRevision(3000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule7.setKilometrageApresRevision(3001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule7.setKilometrageApresRevision(40000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    @Test
    public void testKilometrageMaxApresRevisionBusTransportPassager() throws LimKilometrageDepasseException{
         vehicule8.setKilometrageApresRevision(0);
         vehicule8.setKilometrageApresRevision(2999);
        try {
        vehicule8.setKilometrageApresRevision(3000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule8.setKilometrageApresRevision(3001);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
        
        try {
        vehicule8.setKilometrageApresRevision(40000);
        fail("Suppose to raise exception.");
        } catch (LimKilometrageDepasseException e) {
                    assertThat(e.getMessage(), containsString("Limite kilomètres apres révision dépassé, véhicule immobilisé"));

                }
    }
    
    
}

