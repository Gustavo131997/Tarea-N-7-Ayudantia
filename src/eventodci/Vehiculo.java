package eventodci;

public class Vehiculo {

	Conductor conductor;
	protected String marca;
	protected String modelo;
	protected String tipoRueda;
	protected int numeroRueda;
	protected int velocidadMaxima;
	protected int velocidad;

	public String getMarca() {
		return this.marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoRueda() {
		return this.tipoRueda;
	}

	/**
	 * 
	 * @param tipoRueda
	 */
	public void setTipoRueda(String tipoRueda) {
		this.tipoRueda = tipoRueda;
	}

	public int getNumeroRueda() {
		return this.numeroRueda;
	}

	/**
	 * 
	 * @param numeroRueda
	 */
	public void setNumeroRueda(int numeroRueda) {
		this.numeroRueda = numeroRueda;
	}

	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

	/**
	 * 
	 * @param velocidadMaxima
	 */
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

    @Override
    public String toString() {
        return conductor.toString()+ "\n Datos del "+tipoVehiculo()+" \n marca: " + marca + "\t modelo: " + modelo + "\n Tipo de rueda: " + tipoRueda + "\t Numero de rueda: " + numeroRueda + "\n Velocidad maxima: " + velocidadMaxima+ "km/hrs." ;
    }
    public String tipoVehiculo(){
        switch(this.numeroRueda){
            case 2 : 
                if("Rueda Oruga".equals(this.tipoRueda)){
                return "Tanque";
                }else{ return "Moto";}
            case 3 :
                return "Tractor";
            case 4 :
                return "Auto";
            default : return "Error";
        }
    }
        
}