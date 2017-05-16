package eventodci;


public class Conductor extends Persona {

	Vehiculo Vehiculo;

    @Override
    public String toString() {
        return "Conductor"+ super.toString();
    }

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }
    
    
}