package clases;

public class Veh�culoTurismo extends Veh�culo {

	private Integer puertas;
	
	public Veh�culoTurismo(String matricula, String marca, String modelo, Integer puertas) {
		super(matricula, marca, modelo);
		this.puertas = puertas;
	}
	
	public Integer getPuertas() {
		return puertas;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nNumero de puertas: "+puertas;
	}

}
