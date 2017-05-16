package eventodci;

public class Estudiante extends Persona {

	Carrera evento;
	private String carreraUniversitaria;
	private int nivelMalla;
	private String nMatricula;

	public String getCarreraUniversitaria() {
		return this.carreraUniversitaria;
	}

	/**
	 * 
	 * @param carreraUniversitaria
	 */
	public void setCarreraUniversitaria(String carreraUniversitaria) {
		this.carreraUniversitaria = carreraUniversitaria;
	}

	public int getNivelMalla() {
		return this.nivelMalla;
	}

	/**
	 * 
	 * @param nivelMalla
	 */
	public void setNivelMalla(int nivelMalla) {
		this.nivelMalla = nivelMalla;
	}

	public String getNMatricula() {
		return this.nMatricula;
	}

	/**
	 * 
	 * @param nMatricula
	 */
	public void setNMatricula(String nMatricula) {
		this.nMatricula = nMatricula;
	}

    @Override
    public String toString() {
        return super.toString()+"\n Carrera: " + carreraUniversitaria + "\t Nivel: " + nivelMalla +" semestre"+ "\n Numero de matricula: " + nMatricula ;
    }
        
        

}