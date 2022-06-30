package clases;

public class VehículoDeportivo extends Vehículo {

	private Integer cilindrada;
	
	public VehículoDeportivo(String matricula, String marca, String modelo, Integer cilindrada) {
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
