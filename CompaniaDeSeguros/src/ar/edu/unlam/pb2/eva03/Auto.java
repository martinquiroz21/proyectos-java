package ar.edu.unlam.pb2.eva03;

public class Auto {
	
	private String marca;
	private String modelo;
	private Integer a�o;
	private Double precio;
	
	public Auto(String marca, String modelo, Integer a�o, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
