package clases;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Concesionario c = new Concesionario("Lala");
		
		try {
			c.agregarVehiculo(new VehículoTurismo("abc", "ford", "ka", 20));
			c.agregarVehiculo(new VehículoTurismo("def", "wolks", "vagen", 10));
			c.agregarVehiculo(new VehículoTurismo("abc", "renault", "iha", 20));
			c.agregarVehiculo(new VehículoTurismo("ghi", "ranger", "4x4", 10));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Ingrese un auto con diferente numero de matricula..");
		}
		
		c.eliminarVehiculo(new VehículoTurismo("def", "wolks", "vagen", 10));
		
		LinkedList<Vehículo> cc = c.getVehiculos();
		
		for (Vehículo vehiculo : cc) {
			
			System.out.println(vehiculo.mostrarDatos());
		}

	}

}
