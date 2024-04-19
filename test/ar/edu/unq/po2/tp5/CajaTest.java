package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Producto producto1;
	private Producto producto2;
	
	private ProductoCooperativo prodCoop1;
	private ProductoCooperativo prodCoop2;
	
	private List<Producto> productosACobrar;
	
	private Caja caja1;
	
	@BeforeEach
	void setUp() {
		
		producto1 = new Producto(100d, 15);
		producto2 = new Producto(120d, 10);
		
		prodCoop1 = new ProductoCooperativo(50d, 5);
		prodCoop2 = new ProductoCooperativo(10d, 3);
		
		productosACobrar = Arrays.asList(producto1, producto2, prodCoop1, prodCoop2);
		
		caja1 = new Caja(productosACobrar);
	}

	@Test
	void testCaja1ListaProductos() {
		
		assertEquals(productosACobrar, caja1.getProductos());
	}
	
	@Test
	/* Calcula el monto total a pagar de la lista "productosACobrar".
	 * 
	 * Producto1 precio base = 100 + 21% = $ 121
	 * Producto2 precio base = 120 + 21% = $ 145,2
	 * 
	 * ProdCoop1 precio base = 50 + 21% - 10% del precio base = $ 60,5 - $ 5 = $ 55,5
	 * ProdCoop2 precio base = 10 + 21% - 10% del precio base = $ 12,1 - $ 1 = $ 11,1
	 * 
	 * Total = 121 + 145,2 + 55,5 + 11,1 = 332,8
	 * */
	void testCaja1MontoTotalDeCompra() {
		
		assertEquals(332.8d, caja1.calcularMontoTotalDeCompra());
	}
	
	@Test
	/*
	 * Producto1 stock = 14
	 * Producto2 stock = 9
	 * 
	 * ProdCoop1 stock = 4
	 * ProdCoop2 stock = 2
	 * */
	void testCaja1RegistrarProductosConStock() {
		
		caja1.registrarProductos();
		assertEquals(14, producto1.getStock());
		assertEquals(9, producto2.getStock());
		assertEquals(4, prodCoop1.getStock());
		assertEquals(2, prodCoop2.getStock());
	}
	
	@Test
	void testCaja1RegistrarProductosSinStock() {
		
		Producto productoSinStock = new Producto(85d, 0);
		List<Producto> productosSinStock = Arrays.asList(productoSinStock);
		Caja cajaNoPuedeRegistrar = new Caja(productosSinStock);
		
		assertEquals(productosSinStock, cajaNoPuedeRegistrar.getProductos());
		
		//Exception exception = assertThrows(Exception.class, () -> {
		//	cajaNoPuedeRegistrar.registrarProductos(); // Método que registra el producto
        //});

        //assertEquals("No hay stock suficiente", exception.getMessage());
		
		//cajaNoPuedeRegistrar.registrarProductos();
	}

}
