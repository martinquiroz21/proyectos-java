package martin2;

public class Auto {

	private String patente;
	private String marca;
	private String modelo;
	private int horaEntrada;
	private int horaSalida;

	public Auto(String patente, String marca, String modelo, int horaEntrada) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.horaEntrada = horaEntrada;
		this.horaSalida = 0;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public int obtenerTiempoEstacionado() {
		return this.horaSalida - this.horaEntrada;
	}
	
	public boolean validarPatente(String patente) {
		// En argentina, una patente es válida cuando es: "LLNNNLL"
		
		boolean validacion1 = Character.isLetter(patente.charAt(0));
		boolean validacion2 = Character.isLetter(patente.charAt(1));
		boolean validacion3 = Character.isDigit(patente.charAt(2));
		boolean validacion4 = Character.isDigit(patente.charAt(3));
		boolean validacion5 = Character.isDigit(patente.charAt(4));
		boolean validacion6 = Character.isLetter(patente.charAt(5));
		boolean validacion7 = Character.isLetter(patente.charAt(6));
		
		if(validacion1 && validacion2 && validacion3 && validacion4 && validacion5 && validacion6 && validacion7 && patente.length() == 7) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verificarContraseña(String contraseña) {
		
		boolean validacion1 = verificarSiComienzaConNumero(contraseña);
		boolean validacion2 = contraseña.length() >= 8;
		boolean validacion3 = verificarQueTengaUnSimbolo(contraseña);
		
		return validacion1 && validacion2 && validacion3;
	}

	private boolean verificarQueTengaUnSimbolo(String contraseña) {
		
		for (int i = 0; i < contraseña.length(); i++) {
			
			if(!Character.isDigit(contraseña.charAt(i)) && !Character.isLetter(contraseña.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private boolean verificarSiComienzaConNumero(String contraseña) {
		boolean validacion = Character.isDigit(contraseña.charAt(0));
		
		return validacion;
	}
	
}
