package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	private Map<Venta, Producto> carrito;
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre = nombre;
		productosExistentes = new HashSet<Producto>();
		productosDisponibles = new ArrayList<Producto>();
		ventasRealizadas = new HashMap<Integer, Venta>();
		contadorDeVentas = 0;
		carrito = new HashMap<Venta, Producto>();
	}

	public void ingresarProducto(Producto producto) {
		// Ingresa un nuevo producto
		boolean productoExistente = verificarSiYaExisteElProducto(producto);
		if (!productoExistente) {
			this.productosExistentes.add(producto);
			this.productosDisponibles.add(producto);
		}
		else {
			this.productosDisponibles.add(producto);
		}
		
	}

	private boolean verificarSiYaExisteElProducto(Producto producto) {
		
		for (Producto p : productosExistentes) {
			
			if (p.equals(producto)) {
				return true;
			}
		}
		return false;
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
	}
	
	public Integer getStock(Integer codigo) throws ProductoInexistente {
		// Devuelve la cantidad de unidades de un producto determinado
		productoExiste(codigo);
		
		Integer stock = 0;
		
		for (Producto p : productosDisponibles) {
			
			if (p.getCodigo() == codigo) {
				stock++;
			}
		}
		return stock;
	}
	
	private void productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		// Verifica si un producto existe
		boolean productoExiste = false;
		
		for (Producto p : productosExistentes) {
			
			if (p.getCodigo() == codigoDeProducto) {
				productoExiste = true;
				break;
			}
		}
		if (!productoExiste) {
			throw new ProductoInexistente();
		}
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		Producto producto = new Producto();
		boolean productoConStock = false;
		
		for (Producto p : productosDisponibles) {
			
			if (p.getCodigo() == codigoDeProducto) {
				producto = p;
				productoConStock = true;
				break;
			}
		}
		if (!productoConStock) {
			throw new ProductoSinStock();
		}
		return producto;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
		return ventasRealizadas.get(nueroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		productoExiste(codigoDeProducto);
		Producto producto = getProductoPorCodigo(codigoDeProducto);
		Venta venta = getVenta(numeroDeVenta);
		carrito.put(venta, producto);
	}
	
	

}
