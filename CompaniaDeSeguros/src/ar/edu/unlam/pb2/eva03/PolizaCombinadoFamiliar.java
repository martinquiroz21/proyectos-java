package ar.edu.unlam.pb2.eva03;

import java.util.*;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida {

	private Map<Persona, TipoDeBeneficiario> beneficiarios;
	private Vivienda casa;
	
	public PolizaCombinadoFamiliar(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA, asegurado, sUMA_ASEGURADA, pRIMA);
		beneficiarios = new HashMap<>();
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipo) {
		beneficiarios.put(beneficiario, tipo);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}

	public void agregarBienAsegurado(Vivienda casa) {
		this.casa = casa;
	}

}
