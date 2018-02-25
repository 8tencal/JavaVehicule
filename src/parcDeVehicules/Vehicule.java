/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcDeVehicules;

import java.util.ArrayList;
import parcDeVehicules.Exceptions.DureeDeVieDepasseException;
import parcDeVehicules.Exceptions.KilometrageNegatifException;
import parcDeVehicules.Exceptions.LimKilometrageDepasseException;
import parcDeVehicules.Exceptions.VehiculeInvalideException;





/**
 * Ceci est la classe véhicule, une des plus importantes.
 * @author aprobst
 */
public class Vehicule {
    private double kilometrage;
    private double kilometrageAnnuel;
    private double kilometrageApresRevision;
    private String marque;
    private double dureeDeVie;
    private CategorieVehicule categorie;
    private TypeVehicule Type;
    private boolean immobilise;
    private double limKilometrageAnnuel;
    private double limKilometrageApresRevision;
    private ArrayList<InterventionCarrosserie> interventionsCarrosserie;
    private ArrayList<InterventionMecanique> interventionsMecanique;
    private Parc parc;
    private double age;

    /**
     * Constructeur de la classe véhicule
     * @param kilometrage Permet de savoir le nombre de kilomètres parcourus par la voiture
     * @param marque Correspond a la marque de la voiture
     * @param dureeDeVie Définie la durée de vie de la voiture
     * @param categorie Renseigne la catégorie du véhicule
     * @param immobilise Permet de savoir si le véhicule et immobilisé ou non
     * @param limKilometrageAnnuel Limite de kilomètres que le véhicule a le droit de parcourir en une année.
     * @param limKilometrageAvantRevision Limite de kilomètres que le véhicule a le droit de parcourir avant une révision
     * @param type C'est le type du véhicule
     * @param parc C'est le parc auquel appartient le véhicule
     * @param age Permet de spécifier l'âge qu'a le véhicule actuellement.
     * @throws parcDeVehicules.Exceptions.DureeDeVieDepasseException
     * @throws parcDeVehicules.Exceptions.VehiculeInvalideException
     */
    public Vehicule(double kilometrage, String marque, CategorieVehicule categorie,TypeVehicule type,Parc parc,double age) throws DureeDeVieDepasseException, VehiculeInvalideException {   
        if(categorie==CategorieVehicule.vehicules_de_Service_pour_les_Responsables)
        {
            if(type==TypeVehicule.voiture)
            {
        this.dureeDeVie = 3;
        this.limKilometrageAnnuel = 15000;
        this.limKilometrageApresRevision = 8000;
            }
            else if(type==TypeVehicule.utilitaire)
            {
        this.dureeDeVie = 8;
        this.limKilometrageAnnuel = 15000;
        this.limKilometrageApresRevision = 10000;
            }
         else
        {
            throw new VehiculeInvalideException("Ce type de véhicule associé a cette catégorie n'est pas autorisé dans le parc");
        }
        }
        else if(categorie==CategorieVehicule.vehicules_de_Transport_des_Employes)
        {
            if(type==TypeVehicule.voiture)
            {
        this.dureeDeVie = 3;
        this.limKilometrageAnnuel = 20000;
        this.limKilometrageApresRevision = 5000;
            }
            else if(type==TypeVehicule.camionnette)
            {
        this.dureeDeVie = 5;
        this.limKilometrageAnnuel = 40000;
        this.limKilometrageApresRevision = 5000;
            }
            else if(type==TypeVehicule.bus)
            {
        this.dureeDeVie = 10;
        this.limKilometrageAnnuel = 60000;
        this.limKilometrageApresRevision = 3000;
            }  
            else
        {
            throw new VehiculeInvalideException("Ce type de véhicule associé a cette catégorie n'est pas autorisé dans le parc");
        }
        }
        else if(categorie==CategorieVehicule.vehicules_de_Transport_de_Passagers)
        {
                        if(type==TypeVehicule.camionnette)
            {
        this.dureeDeVie = 5;
        this.limKilometrageAnnuel = 40000;
        this.limKilometrageApresRevision = 5000;
            }
            else if(type==TypeVehicule.bus)
            {
        this.dureeDeVie = 10;
        this.limKilometrageAnnuel = 60000;
        this.limKilometrageApresRevision = 3000;
            }
        else
        {
            throw new VehiculeInvalideException("Ce type de véhicule associé a cette catégorie n'est pas autorisé dans le parc");
        }
        }
        else if(categorie==CategorieVehicule.vehicules_dIntervention_pour_les_Techniciens)
        {
            if(type==TypeVehicule.voiture)
            {
                this.dureeDeVie = 8;
                this.limKilometrageAnnuel = 20000;
                this.limKilometrageApresRevision = 10000;
            }
            else if(type==TypeVehicule.utilitaire)
            {
                this.dureeDeVie = 8;
                this.limKilometrageAnnuel = 20000;
                this.limKilometrageApresRevision = 10000;
            }
         else
        {
            throw new VehiculeInvalideException("Ce type de véhicule associé a cette catégorie n'est pas autorisé dans le parc");
        }
        }


        this.age=age;
        if(age>=dureeDeVie)
        {
        throw new DureeDeVieDepasseException("Le véhicule a déja dépassé sa durée de vie");
        }

        
        this.kilometrage = kilometrage;
        this.kilometrageAnnuel=0;
        this.kilometrageApresRevision=0;
        this.marque = marque;
        this.Type=type;
        
        this.categorie = categorie;
        this.immobilise = false;
        this.interventionsCarrosserie = new ArrayList();
        this.interventionsMecanique = new ArrayList();
        this.parc=parc;
        


    }

    /**
     * afficherVehicule permet de retourner les caractéristiques importante du véhicule.
     * @return La description du véhicule
     */
    public String afficherVehicule() {
        return "Vehicule{" + "kilometrage=" + kilometrage + ", marque=" + marque + ", dureeDeVie=" + dureeDeVie + ", categorie=" + categorie + '}';
    }

    /**
     * Cette fonction permet d'immobiliser le véhicule si celui ci a dépassé sa limite annuel/avant révision/durée de vie de kilomètres parcourues.
     */
    public void immobiliserVehicule(){
        this.immobilise=true;
    }

    /**
     * Ajoute une intervention de type carrosserie sur le véhicule
     * @param intervention Correspond a l'intervention carrosserie effectuée.
     */
    public void renseignerInterventionCarrosserie(InterventionCarrosserie intervention){
        interventionsCarrosserie.add(intervention);   
    }

    /**
     * Ajoute une intervention de type Mécanique sur le véhicule
     * @param intervention Correspond a l'intervention mecanique effectuée.
     */
    public void renseignerInterventionMecanique(InterventionMecanique intervention){
        interventionsMecanique.add(intervention);   
    }

    /**
     * Cette fonction permet de retourner le nombre total de kilomètres parcourus par la voiture
     * @return kilometrage (le kilometrage total parcouru)
     */
    public double getKilometrage() {
        return kilometrage;
    }

    /**
     * Cette fonction permet de connâitre la marque du véhicule
     * @return marque (la marque du véhicule)
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Permet de savoir la durée de vie du véhicule choisi.
     * @return dureeDeVie (la durée de vie du véhicule)
     */
    public double getDureeDeVie() {
        return dureeDeVie;
    }

    /**
     * Cette fonction renvoie la catégorie auquel appartient le véhicule.
     * @return la catégorie du véhicule
     */
    public CategorieVehicule getCategorie() {
        return categorie;
    }

    /**
     * Cette fonction permet de savoir si le véhicule est en état de marche ou non (immobilisé ou non)
     * @return un boolean permettant de savoir si le véhicule est immobilisé ou non
     */
    public boolean isImmobilise() {
        return immobilise;
    }

    /**
     * Permet de savoir la limite de kilomètres que le véhicule est autorisé a parcourir en un an
     * @return la limite de kilomètre qu'il est possible de parcourir en un an
     */
    public double getLimKilometrageAnnuel() {
        return limKilometrageAnnuel;
    }

    /**
     * Permet de connaître la limite de kilomètres que le véhicule est autorisé à parcourir après une révision
     * @return la limite de kilomètres que le véhicule est autorisé à parcourir avant une révision
     */
    public double getLimKilometrageApresRevision() {
        return limKilometrageApresRevision;
    }

    /**
     * Permet d'obtenir les interventions de type carroserie qui ont étés effectués sur le véhicule.
     * @return la liste des interventions de type carrosserie qui ont étés effectués sur le véhicule.
     */
    public ArrayList<InterventionCarrosserie> getInterventionsCarrosserie() {
        return interventionsCarrosserie;
    }

    /**
     * Permet d'obtenir les interventions de type mécanique qui ont étés effectués sur le véhicule.
     * @return la liste des interventions de type mécanique qui ont étés effectués sur le véhicule
     */
    public ArrayList<InterventionMecanique> getInterventionsMecanique() {
        return interventionsMecanique;
    }

    /**
     * Cette fonction permet de reset le kilométrage du véhicule.
     */
    public void resetKilometrage()
    {
        this.kilometrageAnnuel = 0;
        this.kilometrageApresRevision = 0;
        this.kilometrage = 0;
    }
    
    /**
     * Cette fonction permet de relever le kilométrage de la voiture chaque jour et de le renseigner dans le SI.
     * Si une des limites a été atteinte, on affiche une erreur et on immobilise le véhicule.
     * @param kilometrage On envoie a la fonction le kilometrage actuel de la voiture
     * @throws parcDeVehicules.Exceptions.KilometrageNegatifException
     * @throws parcDeVehicules.Exceptions.LimKilometrageDepasseException
     * @throws limKilometrageDepasseException Erreur si le kilométrage max est dépassé pour un des critères (annuel/avant révision/durée de vie)
     */
    public void setKilometrage(double kilometrage) throws KilometrageNegatifException, LimKilometrageDepasseException {
        if(kilometrage<this.kilometrage)
        {
            throw new KilometrageNegatifException("Vous rentrez un kilométrage négatif");
        }
        else
        {

        this.kilometrageAnnuel += (kilometrage - this.kilometrage);
        this.kilometrageApresRevision += (kilometrage - this.kilometrage);
        this.kilometrage = kilometrage;

        if(this.kilometrageAnnuel>=this.limKilometrageAnnuel)
        {
            immobiliserVehicule();
            throw new LimKilometrageDepasseException("Limite kilomètres annuel dépassé, véhicule immobilisé");
        }
        else if (this.kilometrageApresRevision>=this.limKilometrageApresRevision)
        {
            immobiliserVehicule();
            throw new LimKilometrageDepasseException("Limite kilomètres apres révision dépassé, véhicule immobilisé");
        }
        }
    }

    /**
     * Cette fonction sert principalement a réinitialiser le compteur kilométrique annuel a la date d'anniversaire du véhicule.
     * @param kilometrageAnnuel On donne le kilometrageAnnuel que l'on veut fixer
     */
    public void setKilometrageAnnuel(double kilometrageAnnuel) throws LimKilometrageDepasseException {
        this.kilometrageAnnuel = kilometrageAnnuel;
        if(this.kilometrageAnnuel>=limKilometrageAnnuel)
        {
            this.immobiliserVehicule();
            throw new LimKilometrageDepasseException("Kilométrage annuel dépassé, véhicule immobilisé");
        }
        
    }

    /**
     * Cette fonction sert principalement a réinitialiser le compteur kilométrique avant révision après qu'une révision ait été faite.
     * @param kilometrageApresRevision on donne le kilometrageApresRevision que l'on veut fixer
     */
    public void setKilometrageApresRevision(double kilometrageApresRevision) throws LimKilometrageDepasseException {
        this.kilometrageApresRevision = kilometrageApresRevision;
       if (this.kilometrageApresRevision>=this.limKilometrageApresRevision)
        {
            immobiliserVehicule();
            throw new LimKilometrageDepasseException("Limite kilomètres apres révision dépassé, véhicule immobilisé");
        }
    }
    
    /**
     * Permet d'obtenir le type du véhicule
     * @return le type du véhicule
     */
    public TypeVehicule getType() {
        return Type;
    }

    /**
     * Permet d'obtenir le nombre de kilomètres parcouru par le véhicule depuis sa date d'anniversaire.
     * @return le kilométrage annule du véhicule
     */
    public double getKilometrageAnnuel() {
        return kilometrageAnnuel;
    }

    /**
     * Permet d'obtenir le nombre de kilomètres parcourus par le véhicule après qu'il ait fait une révision.
     * @return le nombre de kilomètres avant révision du véhicule
     */
    public double getKilometrageApresRevision() {
        return kilometrageApresRevision;
    }

    public void setAge(double age) throws DureeDeVieDepasseException {
        this.age = age;
        if(this.age>=dureeDeVie)
        {
            throw new DureeDeVieDepasseException("Durée de vie dépassé, le véhicule est retiré du parc");
            
        }
        parc.retirerVehicule(this);
    }

    public double getAge() {
        return age;
    }
    



}
