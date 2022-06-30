package clases;

public class Veh�culoDeportivo extends Veh�culo {

	private Integer cilindrada;
	
	public Veh�culoDeportivo(String matricula, String marca, String modelo, Integer cilindrada) {
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
