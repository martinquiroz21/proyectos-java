package ar.edu.unlam.pb2.eva03;

import java.util.*;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {

	private Map<Persona, TipoDeBeneficiario> beneficiarios;
	private Boolean tuvoAccidente;
	
	public PolizaAccidentesPersonales(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA, asegurado, sUMA_ASEGURADA, pRIMA);
		beneficiarios = new HashMap<>();
		tuvoAccidente = false;
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipo) {
		beneficiarios.put(beneficiario, tipo);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}
	
	public void setTuvoAlgunAccidente(Boolean tuvoAccidente) {
		this.tuvoAccidente = tuvoAccidente;
	}

	public Boolean tuvoAlgunAccidente() {
		return tuvoAccidente;
	}

}
