package ar.edu.unlam.pb2.eva03;

public class Poliza implements Comparable<Poliza> {
	
	private final Integer NUMERO_DE_POLIZA;
	private final Double SUMA_ASEGURADA;
	private final Double PREMIO;
	private Persona asegurado;
	
	public Poliza(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		NUMERO_DE_POLIZA = nUMERO_DE_POLIZA;
		SUMA_ASEGURADA = sUMA_ASEGURADA;
		PREMIO = pRIMA + 1000.;
		this.asegurado = asegurado;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}
	
	public Integer getNumeroDePoliza() {
		return NUMERO_DE_POLIZA;
	}

	public Double getSumaAsegurada() {
		return SUMA_ASEGURADA;
	}

	public Double getPremio() {
		return PREMIO;
	}

	@Override
	public int compareTo(Poliza poliza) {
		return this.NUMERO_DE_POLIZA.compareTo(poliza.getNumeroDePoliza());
	}

}
