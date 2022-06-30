package clases;

public class VehiculoDuplicadoException extends Exception {
	
	public VehiculoDuplicadoException() {
		super("El vehiculo ingresado ya se encuentra en el concesionario.");
	}

}
