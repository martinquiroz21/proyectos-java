package cuenta;

public class CajaDeAhorro extends CuentaBancaria {

	private final Double COSTO_ADICIONAL = 6.;
	private int num_extracciones;
	
	public CajaDeAhorro(Double importe) {
		super(importe);
		this.num_extracciones = 0;
	}

	@Override
	public Double extraer(Double importeAExtraer) {
		Double importeRetirado = 0.;
		this.num_extracciones++;
		
		if(this.num_extracciones > 5) {
			importeRetirado = super.extraer(importeAExtraer);
			importeRetirado -= COSTO_ADICIONAL;
		}
		else {
			importeRetirado = super.extraer(importeAExtraer);
		}
		return importeRetirado;
	}

}
