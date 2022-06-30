package test;

import static org.junit.Assert.*;

import org.junit.Test;

import cuenta.*;

public class TestCuenta {
	
	
	@Test
	public void queSePuedaCrearUnaCuentaBancaria() {
		CuentaBancaria cuenta = new CuentaBancaria(200.);
		
		assertEquals(200., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaDepositarElSaldoDeUnaCuentaBancaria() {
		CuentaBancaria cuenta = new CuentaBancaria(200.);
		
		assertTrue(cuenta.depositar(300.));
		assertEquals(500., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerElSaldoDeUnaCuentaBancaria() {
		CuentaBancaria cuenta = new CuentaBancaria(400.);
		
		assertEquals(300., cuenta.extraer(300.), 0.01);
		assertEquals(100., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queNoSePuedaExtraerElSaldoDeUnaCuentaBancaria() {
		CuentaBancaria cuenta = new CuentaBancaria(400.);
		
		assertTrue(0.0 == cuenta.extraer(500.));
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo(200.);
		
		assertEquals(200., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaCrearUnaCajaDeAhorro() {
		CajaDeAhorro cuenta = new CajaDeAhorro(200.);
		
		assertEquals(200., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente(200.);
		
		assertEquals(200., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo(200.);
		
		assertTrue(cuenta.depositar(300.));
		assertEquals(500., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeLaCuentaSueldoUnImporteMenorAlSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo(400.);
		
		assertEquals(300., cuenta.extraer(300.), 0.01);
		assertEquals(100., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeLaCuentaSueldoUnImporteIgualAlSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo(400.);
		
		assertEquals(400., cuenta.extraer(400.), 0.01);
		assertEquals(0., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queNoSePuedaExtraerDeLaCuentaSueldoUnImporteMayorAlSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo(400.);
		
		assertEquals(0., cuenta.extraer(500.), 0.01);
		assertEquals(400., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaDeAhorro()  {
		CajaDeAhorro cuenta = new CajaDeAhorro(200.);
		
		assertTrue(cuenta.depositar(300.));
		assertEquals(500., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeLaCuentaDeAhorroUnImporteMenorAlSaldo() {
		CajaDeAhorro cuenta = new CajaDeAhorro(400.);
		
		assertEquals(300., cuenta.extraer(300.), 0.01);
		assertEquals(100., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeLaCuentaDeAhorroUnImporteIgualAlSaldo() {
		CajaDeAhorro cuenta = new CajaDeAhorro(400.);
		
		assertEquals(400., cuenta.extraer(400.), 0.01);
		assertEquals(0., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queNoSePuedaExtraerDeLaCuentaDeAhorroUnImporteMayorAlSaldo() {
		CajaDeAhorro cuenta = new CajaDeAhorro(400.);
		
		assertEquals(0., cuenta.extraer(500.), 0.01);
		assertEquals(400., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSeCobreSeisPesosAdicionalesLuegoDeLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorro cuenta = new CajaDeAhorro(1500.);
		
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		// Extraccion con costo adicional
		assertEquals(194., cuenta.extraer(200.), 0.01);
		assertEquals(300., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queNoSeCobreNingunAdicionalAntesDeLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorro cuenta = new CajaDeAhorro(1500.);
		
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(900., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queNoSeCobreNingunAdicionalEnLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorro cuenta = new CajaDeAhorro(1500.);
		
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(200., cuenta.extraer(200.), 0.01);
		assertEquals(500., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente(200.);
		
		assertTrue(cuenta.depositar(300.));
		assertEquals(500., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteUnImporteMenorAlSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente(400.);
		
		assertEquals(300., cuenta.extraer(300.), 0.01);
		assertEquals(100., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteUnImporteIgualAlSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente(400.);
		
		assertEquals(400., cuenta.extraer(400.), 0.01);
		assertEquals(0., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteUnImporteIgualAlSaldoMasElDescubierto() {
		CuentaCorriente cuenta = new CuentaCorriente(400.);
		
		assertEquals(500., cuenta.extraer(500.), 0.01);
		assertEquals(0., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queNoSePuedaExtraerDeUnaCuentaCorrienteUnImporteMayorAlSaldoMasElDescubierto() {
		CuentaCorriente cuenta = new CuentaCorriente(400.);
		
		assertEquals(0., cuenta.extraer(600.), 0.01);
		assertEquals(400., cuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente(400.);
		cuenta.extraer(500.0);
		cuenta.depositar(200.);
		assertEquals(95., cuenta.getSaldo(), 0.01); 
	}
	
	@Test
	public void queNoSeDepositeUnImporteMenorAlDineroAdeudado() {
		CuentaCorriente cuenta = new CuentaCorriente(400.);
		cuenta.extraer(500.);
		cuenta.depositar(100.);
		assertEquals(0., cuenta.getSaldo(), 0.01);
	}

}
