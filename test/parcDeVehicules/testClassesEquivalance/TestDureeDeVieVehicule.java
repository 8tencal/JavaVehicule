/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules.testClassesEquivalance;

import static junit.framework.Assert.fail;
import org.junit.After;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.internal.matchers.StringContains.containsString;
import parcDeVehicules.CategorieVehicule;
import static parcDeVehicules.CategorieVehicule.vehicules_de_Service_pour_les_Responsables;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;
import parcDeVehicules.Parc;
import parcDeVehicules.TypeVehicule;
import parcDeVehicules.Vehicule;

/**
 *
 * @author aprobst
 */
public class TestDureeDeVieVehicule { 
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
    public void setUp() throws DureeDeVieDepasseException, DureeDeVieDepasseException, VehiculeInvalideException {
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
    public void testDureeDeVieVoitureDeService() throws DureeDeVieDepasseException{
         vehicule.setAge(0);
         vehicule.setAge(2);
        try {
        vehicule.setAge(3);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule.setAge(4);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule.setAge(8);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieVoitureIntervention() throws DureeDeVieDepasseException{
         vehicule1.setAge(0);
         vehicule1.setAge(7);
        try {
        vehicule1.setAge(8);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule1.setAge(9);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule1.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieVoitureTransportEmployes() throws DureeDeVieDepasseException{
         vehicule2.setAge(0);
         vehicule2.setAge(2);
        try {
        vehicule2.setAge(3);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule2.setAge(4);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule2.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieUtilitaireDeService() throws DureeDeVieDepasseException{
         vehicule3.setAge(0);
         vehicule3.setAge(7);
        try {
        vehicule3.setAge(8);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule3.setAge(9);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule3.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieUtilitaireDintervention() throws DureeDeVieDepasseException{
         vehicule4.setAge(0);
         vehicule4.setAge(7);
        try {
        vehicule4.setAge(8);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule4.setAge(9);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule4.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieCamionnetteTransportEmployes() throws DureeDeVieDepasseException{
         vehicule5.setAge(0);
         vehicule5.setAge(4);
        try {
        vehicule5.setAge(5);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule5.setAge(6);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule5.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieCamionnetteTransportPassager() throws DureeDeVieDepasseException{
         vehicule6.setAge(0);
         vehicule6.setAge(4);
        try {
        vehicule6.setAge(5);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule6.setAge(6);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule6.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieBusTransportEmployes() throws DureeDeVieDepasseException{
         vehicule7.setAge(0);
         vehicule7.setAge(9);
        try {
        vehicule7.setAge(10);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule7.setAge(11);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule7.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
    
    @Test
    public void testDureeDeVieBusTransportPassager() throws DureeDeVieDepasseException{
         vehicule8.setAge(0);
         vehicule8.setAge(9);
        try {
        vehicule8.setAge(10);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule8.setAge(11);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
        
        try {
        vehicule8.setAge(40);
        fail("Suppose to raise exception.");
        } catch (DureeDeVieDepasseException e) {
                    assertThat(e.getMessage(), containsString("Durée de vie dépassé, le véhicule est retiré du parc"));

                }
    }
}
