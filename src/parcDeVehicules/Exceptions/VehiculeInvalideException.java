/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcDeVehicules.Exceptions;

/**
 *
 * @author aprobst
 */
public class VehiculeInvalideException extends Exception {
            public VehiculeInvalideException() {
    }

    public VehiculeInvalideException(String message) {
        super(message);
    }
}
