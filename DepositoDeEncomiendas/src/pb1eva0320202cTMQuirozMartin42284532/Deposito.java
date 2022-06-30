package pb1eva0320202cTMQuirozMartin42284532;

/*
 * Completar la clase deposito para que realice las siguientes funcionalidades:
 * en el deposito se almancen todas las encomiendas, cita en un subsuelo y 
 * Para que estas  puedan ser despachadas hay que subirlas a un montancarga
 * El montacarga no pueden subir mas carga de la establecida como peso maximo 
 * 
 */
public class Deposito {

	private Encomienda []  encomiendas;
	private Encomienda []  montaCarga;
	private int pesoMaximoDelMontaMontaCarga;

	
	public Deposito (int cantidadDePedidos, int pesoMaximoDelMontaMontaCarga ) {
		this.pesoMaximoDelMontaMontaCarga = pesoMaximoDelMontaMontaCarga;
		this.montaCarga = new Encomienda[cantidadDePedidos];
		this.encomiendas = new Encomienda[20];
	}
	
	public boolean ingresarEncomienda (Encomienda encomienda) {
		
		for (int i = 0; i < encomiendas.length; i++) {
			
			if(encomiendas[i] == null) {
				encomiendas[i] = encomienda;
				return true;
			}
		}
		return false;
	}
	
	public boolean cargarEncomiendaEnMontaCarga (int identificador) {
		
		for (int i = 0; i < encomiendas.length; i++) {
			
			if(encomiendas[i] != null) {
				
				if(encomiendas[i].getIdentificador() == identificador) {
					
					for (int j = 0; j < montaCarga.length; j++) {
						
						if(montaCarga[j] == null) {
							montaCarga[j] = encomiendas[i];
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean subirMontaCargas() {
		int pesoTotalDeEncomiendas = obtenerPesoMontaCarga();
		
		if(pesoTotalDeEncomiendas <= this.pesoMaximoDelMontaMontaCarga) {
			eliminarEncomiendasDelDeposito();
			descargarMontacargas();
			return true;
		}
		return false;
	}
	
	private void descargarMontacargas() {
		
		for (int i = 0; i < montaCarga.length; i++) {
			
			if(montaCarga[i] != null) {
				montaCarga[i] = null;
			}
		}
	}
	
	private void eliminarEncomiendasDelDeposito() {
		
		for (int i = 0; i < montaCarga.length; i++) {
			
			if(montaCarga[i] != null) {
				
				for (int j = 0; j < encomiendas.length; j++) {
					
					if(encomiendas[j] != null) {
						if(montaCarga[i].getIdentificador() == encomiendas[j].getIdentificador()) {
							encomiendas[j] = null;
							break;
						}
					}
				}
			}
		}
	}
	
	public int obtenerPesoMontaCarga() {
		int pesoTotalDeEncomiendas = 0;
		
		for (int i = 0; i < montaCarga.length; i++) {
			
			if(montaCarga[i] != null) {
				pesoTotalDeEncomiendas += montaCarga[i].getPeso();
			}
		}
		return pesoTotalDeEncomiendas;
	}
	
	public Encomienda obtenerEncomiendaMasPesadaDelMontacargas() {
		Encomienda encomiendaMasPesada = null;
		
		for (int i = 0; i < montaCarga.length; i++) {
			
			if(montaCarga[i] != null) {
				
				if(encomiendaMasPesada == null) {
					encomiendaMasPesada = montaCarga[i];
				}
				else {
					if(montaCarga[i].getPeso() > encomiendaMasPesada.getPeso()) {
						encomiendaMasPesada = montaCarga[i];
					}
				}
			}
		}
		return encomiendaMasPesada;
	}
	
	public Encomienda[] obtenerEncomiendasDelMontaCargas() {
		Encomienda encomiendasDelMontaCargas[] = new Encomienda[montaCarga.length];
		int contadorEncomiendas = 0;
		
		for (int i = 0; i < montaCarga.length; i++) {
			
			if(montaCarga[i] != null) {
				encomiendasDelMontaCargas[contadorEncomiendas] = montaCarga[i];
				contadorEncomiendas++;
			}
		}
		return encomiendasDelMontaCargas;
	}
	
	public Encomienda[] getEncomiendas() {
		return encomiendas;
	}

	public void setEncomiendas(Encomienda[] encomiendas) {
		this.encomiendas = encomiendas;
	}

	public Encomienda[] getMontaCarga() {
		return montaCarga;
	}

	public void setMontaCarga(Encomienda[] montaCarga) {
		this.montaCarga = montaCarga;
	}

	public int getPesoMaximoDelMontaMontaCarga() {
		return pesoMaximoDelMontaMontaCarga;
	}

	public void setPesoMaximoDelMontaMontaCarga(int pesoMaximoDelMontaMontaCarga) {
		this.pesoMaximoDelMontaMontaCarga = pesoMaximoDelMontaMontaCarga;
	}
	
}
