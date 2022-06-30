package martin2;

import java.util.Scanner;

public class AdministracionEstacionamiento {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Estacionamiento est = new Estacionamiento("unlam", 10, 4);

		byte opcion = 0;
		
		//Menu
		do {
			// Muestra el menú
			mostrarMenu();
			opcion = teclado.nextByte();

			switch (opcion) {
			case 1:
				// Se estaciona el auto ingresando sus datos
				estacionarAuto(est);
				break;
				
			case 2:
				// Se retira el auto del espacio alojado ingresando la patente
				retirarAuto(est);
				break;
				
			case 3:
				// Se obtienen todas las patentes de los autos que se encuentran en el estacionamiento
				mostrarTodasLasPatentes(est);
				break;

			case 4:
				// Se obtiene el total facturado de los autos por hora
				mostrarTotalFacturado(est);
				break;

			case 5:
				// Se obtiene todos los datos del auto ingresando la patente
				mostrarDatosDelAuto(est);
				break;
				
			case 6:
				// Se obtiene la posicion de un auto por su patente
				mostrarPosicion(est);
				break;
				
			case 7:
				// Se obtiene el auto que mas tiempo estubo estacionado
				mostrarAutoConMasTiempoEstacionado(est);
				break;
				
			case 0:
				System.out.println("El programa de administrar estacionamiento finalizó");
				break;
				
			default:
				System.out.println("Opción incorrecta");
				break;

			}

		} while (opcion != 0);
		
	}
	
	//Metodos
	private static void mostrarAutoConMasTiempoEstacionado(Estacionamiento est) {
		
		Auto auto = est.obtenerAutoConMasTiempo();
		if(auto != null) {
			System.out.println("A continuación, se muestran los datos del auto con mayor tiempo.");
			System.out.println("Marca: "+ auto.getMarca());
			System.out.println("Modelo: "+ auto.getModelo());
			System.out.println("Patente: "+ auto.getPatente());
		}
		else {
			System.out.println("No se encuentra el registro de ningun auto");
		}
	}

	private static void mostrarDatosDelAuto(Estacionamiento est) {
		
		System.out.print("Ingrese la patente del auto a buscar: ");
		String patente = teclado.next();
		String datos[] = est.obtenerDatos(patente);
		if(datos != null) {
			System.out.println("El auto con la patente ingresada se encontro de manera exitosa");
			for (int i = 0; i < datos.length; i++) {
				System.out.println(datos[i]);
			}
		}
		else {
			System.out.println("El auto con la patente ingresada no se encuentro");
		}
	}

	private static void mostrarPosicion(Estacionamiento est) {
		
		System.out.print("Ingrese la patente: ");
		String patente = teclado.next();
		Posicion posicion = est.obtenerPosicion(patente);
		if(posicion != null) {
			System.out.println("El auto con la patente "+ patente +" se encuentra en la fila "+ posicion.getFila() +", columna "+ posicion.getColumna());
		}
		else {
			System.out.println("El auto con la patente ingresada no se encontro");
		}
	}

	private static void mostrarTotalFacturado(Estacionamiento est) {
		
		int totalFacturado = est.obtenerTotalFacturado();
		System.out.println("El total facturado es: "+ totalFacturado);
	}

	private static void mostrarTodasLasPatentes(Estacionamiento est) {
		
		String patentes[] = est.obtenerPatentes();
		
		for (int i = 0; i < patentes.length; i++) {
			
			if(patentes[i] != null) {
				System.out.println(patentes[i]);
			}
		}
	}
	
	private static void retirarAuto(Estacionamiento est) {
		
		
		System.out.print("Ingrese la patente del auto a salir: ");
		String patente = teclado.next();
		System.out.print("Ingrese la hora de salida: ");
		int horaSalida = teclado.nextInt();
		boolean salio = est.salirAuto(patente, horaSalida);
		if(salio == true) {
			System.out.println("Se hiso un nuevo lugar en el estacionamiento");
		}
		else {
			System.out.println("No se encuentra la patente del auto en el estacionamiento");
		}
	}
	
	private static void estacionarAuto(Estacionamiento est) {
		
		System.out.print("Ingrese la patente del auto: ");
		String patente = teclado.next();
		System.out.print("Ingrese la marca del auto: ");
		String marca = teclado.next();
		System.out.print("Ingrese el modelo del auto: ");
		String modelo = teclado.next();
		System.out.print("Ingrese el horario de entrada: ");
		int horaEntrada = teclado.nextInt();
		Auto auto = new Auto(patente, marca, modelo, horaEntrada);
		if(est.estacionarAuto(auto)) {
			System.out.println("El auto se estaciono correctamente");
		}
		else {
			System.out.println("No hay lugar para estacionar");
		}
	}
	
	private static void mostrarMenu() {
		
		System.out.println();
		System.out.println("Ingrese una opcion:");
		System.out.println("1- Estacionar un auto");
		System.out.println("2- Retirar un auto por patente");
		System.out.println("3- Mostrar las patentes de los autos");
		System.out.println("4- Mostrar lo facturado en el estacionamiento ");
		System.out.println("5- Buscar auto por patente");
		System.out.println("6- Averiguar la posicion de un auto");
		System.out.println("7- Averiguar el auto con mas tiempo");
		System.out.println("0- Salir");
	}

}
