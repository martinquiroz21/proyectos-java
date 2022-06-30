package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	private boolean noFrost;
	private Integer garantia;
	
	public Heladera(Integer codigo, String descripcion, boolean noFrost, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.noFrost = noFrost;
		this.garantia = garantia;
	}
	
	@Override
	public Integer getGarantia() {
		return garantia;
	}

	@Override
	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

	public boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}

}
