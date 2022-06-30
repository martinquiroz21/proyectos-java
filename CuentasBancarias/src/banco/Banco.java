package banco;

import java.util.*;

public class Banco {
	
	private List<Cliente> clientes;
	private List<Cuenta> cuentas;
	
	public Banco() {
		this.clientes = new LinkedList<Cliente>();
		this.cuentas = new LinkedList<Cuenta>();
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

}
