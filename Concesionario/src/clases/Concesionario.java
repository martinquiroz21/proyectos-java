package clases;

import java.util.*;

public class Concesionario {

	private String nombre;
	private LinkedList<Vehículo> vehiculos;
	private LinkedList<Cliente> clientes;
	
	public Concesionario(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new LinkedList<Vehículo>();
		this.clientes = new LinkedList<Cliente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Vehículo> getVehiculos() {
		return vehiculos;
	}

	public void agregarVehiculo(Vehículo vehiculo) throws VehiculoDuplicadoException {
		
		boolean seEncontroElVehiculo = verificarSiYaSeEncuentraElVehiculo(vehiculo);
		if (seEncontroElVehiculo) {
			throw new VehiculoDuplicadoException();
		}
		this.vehiculos.add(vehiculo);
	}

	private Boolean verificarSiYaSeEncuentraElVehiculo(Vehículo vehiculo) {
		
		for (int i = 0; i < this.vehiculos.size(); i++) {
			
			if (vehiculos.get(i).getMatricula().equals(vehiculo.getMatricula())) {
				return true;
			}
		}
		return false;
	}

	public Boolean eliminarVehiculo(Vehículo vehiculo) {
		
		for (int i = 0; i < this.vehiculos.size(); i++) {
			
			if (vehiculos.get(i).getMatricula().equals(vehiculo.getMatricula())) {
				this.vehiculos.remove(i);
				return true;
			}
		}
		return false;
	}

	public LinkedList<Cliente> getClientes() {
		return clientes;
	}

	public Boolean agregarCliente(Cliente cliente) {
		
		if (!verificarSiYaSeEncuentraElCliente(cliente)) {
			this.clientes.add(cliente);
			return true;
		}
		return false;
	}

	private Boolean verificarSiYaSeEncuentraElCliente(Cliente cliente) {
		
		for (int i = 0; i < this.clientes.size(); i++) {
			
			if (clientes.get(i).getDni() == cliente.getDni()) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean eliminarCliente(Cliente cliente) {
		
		for (int i = 0; i < this.clientes.size(); i++) {
			
			if (clientes.get(i).getDni() == cliente.getDni()) {
				this.clientes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
}
