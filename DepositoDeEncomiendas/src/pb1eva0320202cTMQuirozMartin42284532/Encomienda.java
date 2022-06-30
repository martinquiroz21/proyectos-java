package pb1eva0320202cTMQuirozMartin42284532;

public class Encomienda {
	
	private int identificador;
	private int peso;
	private String propietario;
	
	
	public Encomienda(int identificador, int peso, String propietario) {
		this.identificador = identificador;
		this.peso = peso;
		this.propietario = propietario;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public String toString() {
		
		return "Identificador: "+this.identificador+"\n"+"Peso: "+this.peso+"\n"+"Propietario: "+this.propietario;
	}
	
}
