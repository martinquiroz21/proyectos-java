package test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

import banco.*;

public class TestBanco {

	@Test
	public void queSePuedaAgregarUnCliente() {
		Banco banco = new Banco();
		
		banco.agregarCliente(new Cliente("Martin", 42283532));
		List<Cliente> cl = banco.getClientes();
		
		assertEquals("Martin", cl.get(0).getNombre());
	}

	@Test
	public void queSePuedaAgregarUnaCuenta() {
		Banco banco = new Banco();
		
		banco.agregarCuenta(new Cuenta(2324, 2000.0));
		List<Cuenta> c = banco.getCuentas();
		
		assertEquals((Integer)2324, c.get(0).getCbu());
	}
	
	@Test
	public void queSePuedaSaberElTipoDeCuenta() {
		CuentaSueldo cuenta1 = new CuentaSueldo(0002420, 100000.0);
		assertEquals(TipoCuenta.SUELDO, cuenta1.getTipoCuenta());
		
		CajaDeAhorro cuenta2 = new CajaDeAhorro(0002420, 100000.0);
		assertEquals(TipoCuenta.CAJA_DE_AHORRO, cuenta2.getTipoCuenta());
		
		CuentaCorriente cuenta3 = new CuentaCorriente(0002420, 100000.0);
		assertEquals(TipoCuenta.CORRIENTE, cuenta3.getTipoCuenta());
	}
	
	@Test
	public void queSePuedanMostrarLosDatosDelCliente() {
		Cliente cliente = new Cliente("Martin", 42283532);
		assertNotNull(cliente.mostrarDatos());
	}

}
