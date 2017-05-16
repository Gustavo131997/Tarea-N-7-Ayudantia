package eventodci;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Carrera {

	Academico coordinador;
	ArrayList<Estudiante> asistentes;
	ArrayList<Vehiculo> vehiculosCompetidores;

    public void iniciarEventoCarrera() throws AWTException {
        Robot robot = new Robot();
        this.coordinador = new Academico();
        System.out.println("Bienvenidos abbsima carrera del DCI");
        robot.delay(2000);
        coordinador.setNombre("Carlos Cares");
        System.out.println("Soy el coordinador de la carrera "+coordinador.getNombre());
        robot.delay(3000);
        coordinador.setRol("Director del DCI");
        System.out.println(coordinador.getRol());
        coordinador.mostrarDatosCarrera(this);
    }
    public String inscripcionEvento(){
        this.asistentes = new ArrayList<>();
        this.vehiculosCompetidores = new ArrayList<>();
        do{
        System.out.println("Empezó la inscripcion del evento");
        System.out.println("1.- Inscripción de Asistentes");
        System.out.println("2.- Inscripción de competidores con sus respectivo vehículo");
        System.out.println("3.- Cualquier cosa para finalizar la inscripción");
        switch(leer()){
            case "1": 
                this.inscribirAsistente();
            break;
            case "2" :
               this.menuVehiculo();
            break;
            default : return "salir";
        }
        }while(true);
    } 

    private String leer() {
        Scanner leer = new Scanner(System.in);
        return leer.nextLine();
    }
    public void inscribirAsistente(){
        boolean ok = false;
        Estudiante estudiante = new Estudiante();
        do{
            System.out.println("Ingresar Nombre del Estudiante");
            String nombre = leer();
            estudiante.setNombre(nombre);
            System.out.println("Ingresar Carrera a la que pertenece");
            String carrera = leer();
            estudiante.setCarreraUniversitaria(carrera);
            System.out.println("Ingresar nivel de la carrera");
            String nivel = leer();
            if (this.validarInt(nivel)) {
                int nivel1 = Integer.parseInt(nivel);
                estudiante.setNivelMalla(nivel1);
            }
            System.out.println("Ingresar numero de matricula");
            String matricula = leer();
            if (validarFormatoMatricula(matricula)) {
                estudiante.setNMatricula(matricula);
            }
            System.out.println(estudiante.toString());
            boolean validar = false;
            do{
                System.out.println("¿Seguro de inscripción del estudiante?(s/n)");
                String opc = leer();
                switch (opc) {
                    case "s":
                        this.asistentes.add(estudiante);
                        ok = true;
                        validar = true;
                        break;
                    case "n":
                        validar = true;
                        break;
                    default:
                        validar = false;
                        System.out.println("Opción no valida");
                        break;
                }
            }while(validar != true);
        }while(ok == false);
    }
    public boolean validarInt(String nivel){
        Pattern pat = Pattern.compile("[0-9]{1}[0-9]{0,1}");
        Matcher mac = pat.matcher(nivel);
        return mac.matches();
    }
    public boolean validarFormatoMatricula(String matricula){
        Pattern pat = Pattern.compile("[0-1]{0,1}[0-9]{1}[0-9]{7}[1|2|9]{1}[0-9]{1}");
        Matcher mac = pat.matcher(matricula);
        return mac.matches();
    }
    
    public int asignarVelocidadMax(){
        Random azar = new Random();
        return 10*(azar.nextInt(10) + 10);
    }
    
    public void menuVehiculo(){
        boolean opc;
        do{
        System.out.println("1. Auto");
        System.out.println("2. Tanque");
        System.out.println("3. Tractor");
        System.out.println("4. Moto");
        switch(leer()){
            case "1": 
                Auto auto = new Auto();
                auto.setNumeroRueda(4);
                auto.setTipoRueda("Rueda de neumatico");
                auto.conductor = new Conductor();
                System.out.println("Ingresar nombre del conductor");
                auto.conductor.setNombre(leer());
                System.out.println("Ingresar marca del vehiculo");
                auto.setMarca(leer());
                System.out.println("Ingresar modelo del vehiculo");
                auto.setModelo(leer());
                auto.setVelocidadMaxima(asignarVelocidadMax());
                this.vehiculosCompetidores.add(auto);
                auto.toString();
                opc = true;
            break;
            case "2":
                Tanque tanque = new Tanque();
                tanque.setNumeroRueda(2);
                tanque.setTipoRueda("Rueda Oruga");
                tanque.conductor = new Conductor();
                System.out.println("Ingresar nombre del conductor");
                tanque.conductor.setNombre(leer());
                System.out.println("Ingresar marca del vehiculo");
                tanque.setMarca(leer());
                System.out.println("Ingresar modelo del vehiculo");
                tanque.setModelo(leer());
                tanque.setVelocidadMaxima(asignarVelocidadMax());
                this.vehiculosCompetidores.add(tanque);
                opc = true;
            break;
            case "3":
                Tractor tractor = new Tractor();
                tractor.setNumeroRueda(3);
                tractor.setTipoRueda("Rueda de neumatico");
                tractor.conductor = new Conductor();
                System.out.println("Ingresar nombre del conductor");
                tractor.conductor.setNombre(leer());
                System.out.println("Ingresar marca del vehiculo");
                tractor.setMarca(leer());
                System.out.println("Ingresar modelo del vehiculo");
                tractor.setModelo(leer());
                tractor.setVelocidadMaxima(asignarVelocidadMax());
                this.vehiculosCompetidores.add(tractor);
                opc = true;
            break;
            case "4":
                Moto moto = new Moto();
                moto.setNumeroRueda(2);
                moto.setTipoRueda("Rueda de neumatico");
                moto.conductor = new Conductor();
                System.out.println("Ingresar nombre del conductor");
                moto.conductor.setNombre(leer());
                System.out.println("Ingresar marca del vehiculo");
                moto.setMarca(leer());
                System.out.println("Ingresar modelo del vehiculo");
                moto.setModelo(leer());
                moto.setVelocidadMaxima(asignarVelocidadMax());
                this.vehiculosCompetidores.add(moto);
                opc = true;
            break;
            default:
                System.out.println("Opcion no valida");
                opc = false;
            break;
        }
        
        }while(opc != true);
    }
}