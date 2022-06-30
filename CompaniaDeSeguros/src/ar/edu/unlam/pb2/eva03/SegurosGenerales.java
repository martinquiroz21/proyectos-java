package ar.edu.unlam.pb2.eva03;

public interface SegurosGenerales {

	void agregarBienAsegurado(Auto auto);
	
	Integer getNumeroDePoliza();

	Auto getAuto();

	Persona getAsegurado();

	Double getPremio();

}
