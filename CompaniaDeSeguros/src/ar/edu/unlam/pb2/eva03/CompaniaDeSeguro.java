package ar.edu.unlam.pb2.eva03;

import java.util.*;

public class CompaniaDeSeguro {
	
	private String nombre;
	private Set<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		polizas = new TreeSet<Poliza>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarPoliza(Poliza poliza) {
		polizas.add(poliza);
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}

	public void denunciarSiniestro(int numeroDePoliza) throws PolizaInexistente {
		boolean seEncontro = false;
		
		for (Poliza poliza : polizas) {
			
			if (poliza.getNumeroDePoliza() == numeroDePoliza) {
				
				if (poliza instanceof PolizaDeAuto) {
					((PolizaDeAuto)poliza).setFueRobado(true);
					pagarImporteAlAsegurado(poliza);
					seEncontro = true;
					break;
				}
				if (poliza instanceof PolizaAccidentesPersonales) {
					((PolizaAccidentesPersonales)poliza).setTuvoAlgunAccidente(true);;
					pagarImporteAlAsegurado(poliza);
					seEncontro = true;
					break;
				}
				if (poliza instanceof PolizaCombinadoFamiliar) {
					pagarImporteAlAsegurado(poliza);
					seEncontro = true;
					break;
				}
			}
		}
		if (!seEncontro) {
			throw new PolizaInexistente();
		}
	}

	private void pagarImporteAlAsegurado(Poliza poliza) {
		poliza.getAsegurado().setSaldo(poliza.getSumaAsegurada());
	}

	public Poliza getPoliza(int numeroDePoliza) {
		
		for (Poliza poliza : polizas) {
			
			if(poliza.getNumeroDePoliza() == numeroDePoliza) {
				return poliza;
			}
		}
		return null;
	}
	
	

}
