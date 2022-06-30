package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private Auto auto;
	private Boolean fueRobado;
	
	public PolizaDeAuto(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA, asegurado, sUMA_ASEGURADA, pRIMA);
		fueRobado = false;
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.auto = auto;
	}

	@Override
	public Auto getAuto() {
		return auto;
	}
	
	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}

	public boolean fueRobado() {
		return fueRobado;
	}

}
