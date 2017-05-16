/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventodci;

import java.awt.AWTException;

/**
 *
 * @author Gustavo Huerta
 */
public class Evento {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     */
    public static void main(String[] args) throws AWTException {
        Carrera carrera = new Carrera();
        if (carrera.inscripcionEvento().equals("salir")) {
            carrera.iniciarEventoCarrera();
        }else{ System.exit(0);}
    }
    
}
