package pb1eva0320202cTMQuirozMartin42284532;
import java.util.Scanner;

public class AdministracionDeEncomiendas {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Deposito deposito = new Deposito(3,100);
		byte opcion = 0;
		
		//Menu
		do {
			mostrarMenu();
			opcion = teclado.nextByte();
			
			switch(opcion) {
			
			case 1:
				//Informa si la encomienda se recibio en el deposito
				ingresarEncomienda(deposito);
				break;
				
			case 2:
				//Informa si dicha encomienda se puede subir al montacargas
				subirEncomiendaAlMontacargas(deposito);
				break;
				
			case 3:
				//Informa si se pudo subir la encomienda o no al montacargas
				subirMontacargas(deposito);
				break;
				
			case 4:
				//Informa todos los datos de la encomienda detectada como la de mayor peso
				mostrarEncomiendaMasPesadaDelMontacargas(deposito);
				break;
				
			case 5:
				//Muestra los datos de todas las encomiendas que se encuentran en el montacargas
				mostrarTodasLasEncomiendasDelMontacargas(deposito);
				break;
			
			case 0:
				System.out.println("El programa finalizo");
				break;
			
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		} while(opcion != 0);
		
	}

	private static void mostrarTodasLasEncomiendasDelMontacargas(Deposito deposito) {
		Encomienda encomiendas[] = deposito.obtenerEncomiendasDelMontaCargas();
		for (int i = 0; i < encomiendas.length; i++) {
			
			if(encomiendas[i] != null) {
				System.out.println(encomiendas[i].toString());
				System.out.println();
			}
		}
	}

	private static void mostrarEncomiendaMasPesadaDelMontacargas(Deposito deposito) {
		Encomienda encomiendaDetectada = deposito.obtenerEncomiendaMasPesadaDelMontacargas();
		if(encomiendaDetectada != null) {
			System.out.println(encomiendaDetectada.toString());
		}
		else {
			System.out.println("El montacargas se encuentra vacio");
		}
	}
	
	private static void subirMontacargas(Deposito deposito) {
		boolean subio = deposito.subirMontaCargas();
		if(subio) {
			System.out.println("Se subieron las encomiendas del montacargas");
		}
		else {
			System.out.println("No se puede subir las encomiendas del montacargas");
		}
	}

	private static void subirEncomiendaAlMontacargas(Deposito deposito) {
		System.out.println("Ingresar identificador de la encomienda:");
		int identificador = teclado.nextInt();
		boolean seCargo = deposito.cargarEncomiendaEnMontaCarga(identificador);
		if(seCargo) {
			System.out.println("La encomienda se puede subir al montacarga");
		}
		else {
			System.out.println("La encomienda no se puede subir al montacarga");
		}
	}

	private static void ingresarEncomienda(Deposito deposito) {
		System.out.println("Ingresar el identificador de la encomienda:");
		int identificador = teclado.nextInt();
		System.out.println("Ingresar el peso de la encomienda:");
		int peso = teclado.nextInt();
		System.out.println("Ingresar el nombre del propietario de la encomienda:");
		String propietario = teclado.next();
		Encomienda encomienda = new Encomienda(identificador, peso, propietario);
		boolean ingreso = deposito.ingresarEncomienda(encomienda);
		if(ingreso) {
			System.out.println("La encomienda se recibio");
		}
		else {
			System.out.println("La encomienda no se recibio");
		}
	}

	private static void mostrarMenu() {
		System.out.println("Ingresar una opcion");
		System.out.println("1- Ingresar una encomienda al deposito");
		System.out.println("2- Ingresar la ID de una encomienda para subir al montacargas");
		System.out.println("3- Subir el monta cargas");
		System.out.println("4- Obtener la encomienda mas pesada del monta cargas");
		System.out.println("5- Mostrar todas las encomiendas que estan subidas al monta cargas");
		System.out.println("0- Salir");
	}

}
