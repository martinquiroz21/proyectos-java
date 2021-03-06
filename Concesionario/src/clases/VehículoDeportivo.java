package clases;

public class VehÝculoDeportivo extends VehÝculo {

	private Integer cilindrada;
	
	public VehÝculoDeportivo(String matricula, String marca, String modelo, Integer cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	public Integer getCilindrada() {
		return cilindrada;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nCilindrada: "+cilindrada;
	}

}
