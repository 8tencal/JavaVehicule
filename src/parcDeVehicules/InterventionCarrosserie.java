/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcDeVehicules;

/**
 * Ceci est la classe InterventionCarrosserie qui sert a crée des interventions de type Carrosserie.
 * @author aprobst
 * 
 */
public class InterventionCarrosserie{
    
    private TypeInterventionCarrosserie typeInterventionCarrosserie;
    private String libelle;
    private String message;
    private PiecesCarrosserie piece;

    /**
     * C'est le constructeur des interventions de type Carrosserie.
     * @param typeInterventionCarrosserie C'est le type d'intervention
     * @param libelle C'est le titre de l'intervention
     * @param message C'est le message, la description de l'intervention
     * @param piece C'est la pièce cible de l'intervention
     * @see PiecesCarrosserie
     * @see TypeInterventionCarrosserie
     */
    public InterventionCarrosserie(TypeInterventionCarrosserie typeInterventionCarrosserie, String libelle, String message, PiecesCarrosserie piece) {
        this.typeInterventionCarrosserie = typeInterventionCarrosserie;
        this.libelle = libelle;
        this.message = message;
        this.piece = piece;
    }

    

    /**
     * Retourne le type d'intervention Carrosserie
     * @return Retourne le type d'intervention Carrosserie
     */ 
    public TypeInterventionCarrosserie getTypeInterventionCarrosserie() {
        return typeInterventionCarrosserie;
    }

    /**
     *
     * @return Ca retourne le libelle de l'intervention
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     *
     * @return Retourne le message de l'intervention
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @return Retourne la pièce cible de l'intervention carrosserie
     * @see PiecesCarrosserie
     */
    public PiecesCarrosserie getPiece() {
        return piece;
    }
    
    
    
    
}
