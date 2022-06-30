package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {

	private String f_fabricacion;
	private String f_caducidad;
	
	public Galletitas(Integer codigo, String descripcion, String f_fabricacion, String f_caducidad, String marca,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.f_fabricacion = f_fabricacion;
		this.f_caducidad = f_caducidad;
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
	
}
