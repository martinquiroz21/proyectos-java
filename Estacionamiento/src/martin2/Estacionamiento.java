package martin2;

public class Estacionamiento {

	private String nombre;
	private Auto cocheras[][];
	private Auto registroDeAutos[];
	private int fila;
	private int columna;
	private int precioPorHora = 10;
	private int totalFacturado;
	private int cantidadDeAutosQueSalieron;
	
	public Estacionamiento(String nombre) {
		this.nombre = nombre;
		this.fila = 8;
		this.columna = 3;
		this.cocheras = new Auto[fila][columna];
		this.registroDeAutos = new Auto[1000];
		this.cantidadDeAutosQueSalieron = 0;
	}
	
	public Estacionamiento(String nombre, int fila, int columna) {
		this.nombre = nombre;
		this.fila = fila;
		this.columna = columna;
		this.cocheras = new Auto[fila][columna];
		this.registroDeAutos = new Auto[1000];
		this.cantidadDeAutosQueSalieron = 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean estacionarAuto(Auto auto) {
		
		for (int i = 0; i < cocheras.length; i++) {
			
			for (int j = 0; j < cocheras[i].length; j++) {
				
				if(cocheras[i][j] == null) {
					cocheras[i][j] = auto;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean salirAuto(String patente, int horaSalida) {
		
		for (int i = 0; i < cocheras.length; i++) {
			
			for (int j = 0; j < cocheras[i].length; j++) {
				
				if(this.cocheras[i][j] != null) {
					
					if(cocheras[i][j].getPatente().equals(patente)) {
						cocheras[i][j].setHoraSalida(horaSalida);
						cobrar(cocheras[i][j]);
						this.registroDeAutos[cantidadDeAutosQueSalieron] = this.cocheras[i][j];
						cantidadDeAutosQueSalieron++;
						cocheras[i][j] = null;
						return true;
					}
				}
			}
		}
		return false;
	}

	private void cobrar(Auto auto) {
		
		int totalACobrar = this.precioPorHora * (auto.getHoraSalida() - auto.getHoraEntrada());
		this.totalFacturado += totalACobrar; 
	}

	public String[] obtenerPatentes() {
		
		int contador = 0;
		String lista[] = new String[fila*columna];
		
		for (int i = 0; i < cocheras.length; i++) {
			
			for (int j = 0; j < cocheras[i].length; j++) {
				
				if(this.cocheras[i][j] != null) {
					
					lista[contador] = cocheras[i][j].getPatente();
					contador++;
				}
			}
		}
		return lista;
	}

	public int obtenerTotalFacturado() {
		
		return this.totalFacturado;
	}

	public Posicion obtenerPosicion(String patente) {
		
		for (int i = 0; i < cocheras.length; i++) {
			
			for (int j = 0; j < cocheras[i].length; j++) {
				
				if(cocheras[i][j] != null) {
					
					if(cocheras[i][j].getPatente().equals(patente)) {
						Posicion posicion = new Posicion(i, j);
						return posicion;
					}
				}
			}
		}
		return null;
	}

	public String[] obtenerDatos(String patente) {
		
		String datos[] = new String[3];
		
		for (int i = 0; i < cocheras.length; i++) {
			
			for (int j = 0; j < cocheras[i].length; j++) {
				
				if(cocheras[i][j] != null) {
					
					if(cocheras[i][j].getPatente().equals(patente)) {
						
						datos[0] = cocheras[i][j].getPatente();
						datos[1] = cocheras[i][j].getMarca();
						datos[2] = cocheras[i][j].getModelo();
						return datos;
					}
				}
			}
		}
		return null;
	}

	public Auto obtenerAutoConMasTiempo() {
		
		Auto autoConMayorTiempo = null;
		
		for (int i = 0; i < registroDeAutos.length; i++) {
			
			if(autoConMayorTiempo == null) {
				autoConMayorTiempo = registroDeAutos[i];
			}
			else {
				if(registroDeAutos[i].obtenerTiempoEstacionado() > autoConMayorTiempo.obtenerTiempoEstacionado()) {
					autoConMayorTiempo = registroDeAutos[i];
				}
			}
		}
		return autoConMayorTiempo;
	}
	
	public int obtenerCantidadDeAutos(String marca) {
		
		int cantidad = 0;
		for (int i = 0; i < cocheras.length; i++) {
			
			for (int j = 0; j < cocheras[i].length; j++) {
				
				if(cocheras[i][j] != null) {
					
					if(cocheras[i][j].getMarca().equals(marca)) {
						cantidad++;
					}
				}
			}
		}
		return cantidad;
	}
	
}
