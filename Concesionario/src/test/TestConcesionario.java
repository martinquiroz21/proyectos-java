package test;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.*;

public class TestConcesionario {

	@Test
	public void queSePuedanMostrarLosDatosDeUnVehiculoDeportivo() throws VehiculoDuplicadoException {
		Concesionario c = new Concesionario("Label");
		
		c.agregarVehiculo(new VehículoDeportivo("iny 354", "ford", "ka", 20));
		
		System.out.println(c.getVehiculos().get(0).mostrarDatos());
	}
	
	@Test
	public void queSePuedanMostrarLosDatosDeUnVehiculoTurismo() throws VehiculoDuplicadoException {
		Concesionario c = new Concesionario("Label");
		
		c.agregarVehiculo(new VehículoTurismo("ace 009", "ford", "ka", 20));
		
		System.out.println(c.getVehiculos().get(0).mostrarDatos());
	}
	
	@Test
	public void queSePuedaEliminarUnVehiculoDelConcesionario() throws VehiculoDuplicadoException {
		Concesionario c = new Concesionario("Label");
		c.agregarVehiculo(new VehículoTurismo("ace 009", "ford", "ka", 20));
		
		assertTrue(c.eliminarVehiculo(new VehículoTurismo("ace 009", "ford", "ka", 20)));
	}
	
	@Test
	public void queNoSePuedaEliminarUnVehiculoDelConcesionario() throws VehiculoDuplicadoException {
		Concesionario c = new Concesionario("Label");
		c.agregarVehiculo(new VehículoTurismo("ace 009", "ford", "ka", 20));
		
		assertFalse(c.eliminarVehiculo(new VehículoTurismo("iny 354", "ford", "ka", 20)));
	}
	
	@Test (expected = VehiculoDuplicadoException.class)
	public void verificarQueNoSePuedaAgregarUnVehiculoDuplicado() throws VehiculoDuplicadoException {
		Concesionario c = new Concesionario("Label");
		
		c.agregarVehiculo(new VehículoTurismo("abc", "ford", "ka", 20));
		c.agregarVehiculo(new VehículoTurismo("wqts", "ford", "ka", 20));
		c.agregarVehiculo(new VehículoTurismo("abc", "ford", "ka", 20));
	}

}
