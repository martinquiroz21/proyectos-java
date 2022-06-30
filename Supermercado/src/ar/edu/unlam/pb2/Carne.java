package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {
	
	private String f_fabricacion;
	private String f_caducidad;
	private Double kilos;
	
	public Carne(Integer codigo, String descripcion, String f_fabricacion, String f_caducidad, Double kilos, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.f_fabricacion = f_fabricacion;
		this.f_caducidad = f_caducidad;
		this.kilos = kilos;
	}

	@Override
	public String getFechaDeElaboracion() {
		return f_fabricacion;
	}

	@Override
	public void setFechaDeElaboracion(String fechaElaboracion) {
		this.f_fabricacion = fechaElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return f_caducidad;
	}

	@Override
	public void setFechaDeVencimiento(String fechaVencimiento) {
		this.f_caducidad = fechaVencimiento;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

}
