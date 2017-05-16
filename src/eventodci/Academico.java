/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventodci;

import java.awt.AWTException;
import java.awt.Robot;

/**
 *
 * @author Gustavo Huerta
 */
public class Academico extends Persona {
     Carrera carreraCoordinada;
     String rol;
     public void mostrarDatosCarrera(Carrera carrera) throws AWTException{
         this.carreraCoordinada = carrera;
         System.out.println("Numero de vehiculos y competidores: "+this.carreraCoordinada.vehiculosCompetidores.size());
         System.out.println("Numero de Asitentes: "+ this.carreraCoordinada.asistentes.size());
         System.out.println("Estos son los competidores");
         mostrarCompetidores();
     }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void mostrarCompetidores() throws AWTException{
        Robot robot = new Robot();
        this.carreraCoordinada.vehiculosCompetidores.forEach((vehiculo) -> {
            System.out.println(vehiculo.toString());
            robot.delay(3000);
         });
    }
     
}
