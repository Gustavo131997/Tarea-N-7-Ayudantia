package eventodci;

public abstract class Persona {

	protected String nombre;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    @Override
    public String toString() {
        return " " + nombre ;
    }
        
        

}