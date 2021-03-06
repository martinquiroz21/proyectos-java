package clases;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Concesionario c = new Concesionario("Lala");
		
		try {
			c.agregarVehiculo(new VehÝculoTurismo("abc", "ford", "ka", 20));
			c.agregarVehiculo(new VehÝculoTurismo("def", "wolks", "vagen", 10));
			c.agregarVehiculo(new VehÝculoTurismo("abc", "renault", "iha", 20));
			c.agregarVehiculo(new VehÝculoTurismo("ghi", "ranger", "4x4", 10));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Ingrese un auto con diferente numero de matricula..");
		}
		
		c.eliminarVehiculo(new VehÝculoTurismo("def", "wolks", "vagen", 10));
		
		LinkedList<VehÝculo> cc = c.getVehiculos();
		
		for (VehÝculo vehiculo : cc) {
			
			System.out.println(vehiculo.mostrarDatos());
		}

	}

}
