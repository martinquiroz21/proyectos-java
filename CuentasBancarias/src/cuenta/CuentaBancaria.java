package cuenta;

public class CuentaBancaria {
	
	private Double saldo;
	
	public CuentaBancaria(Double importe) {
		this.saldo = importe;
	}

	public Boolean depositar(Double importe) {
		this.saldo += importe;
		return true;
	}

	public Double extraer(Double importeAExtraer) {
		Double importeRetirado = 0.;
		
		if(importeAExtraer <= this.saldo) {
			this.saldo -= importeAExtraer;
			importeRetirado = importeAExtraer;
		}
		return importeRetirado;
	}
	
	public Double getSaldo() {
		return saldo;
	}

}
