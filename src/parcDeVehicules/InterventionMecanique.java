/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcDeVehicules;

/**
 * Ceci est la classe permettant la création d'interventions de type Mécaniques.
 * @author aprobst
 */
public class InterventionMecanique{
    
    private TypeInterventionMecanique typeInterventionMecanique;
    private String libelle;
    private String message;
    private PiecesMecanique piece;

    /**
     * C'est le constructeur des interventions de type mécanique.
     * @param typeInterventionMecanique
     * @param libelle
     * @param message
     * @param piece
     */
    public InterventionMecanique(TypeInterventionMecanique typeInterventionMecanique, String libelle, String message, PiecesMecanique piece) {
        this.typeInterventionMecanique = typeInterventionMecanique;
        this.libelle = libelle;
        this.message = message;
        this.piece = piece;
    }



    /**
     * Retourne le Type de l'intervention
     * @return TypeInterventionMecanique
     */
    public TypeInterventionMecanique getTypeInterventionMecanique() {
        return typeInterventionMecanique;
    }

    /**
     *  Retourne le titre de l'intervention
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * retourne le message de l'intervention, sa description.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Retourne la pièce cible de l'intervention.
     * @return piece
     */
    public PiecesMecanique getPiece() {
        return piece;
    }
    
    
    
    
}
