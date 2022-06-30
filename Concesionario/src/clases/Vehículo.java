package clases;

public abstract class Vehículo {
	
	private String matricula;
	private String marca;
	private String modelo;
	
	public Vehículo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public abstract String mostrarDatos();


}
