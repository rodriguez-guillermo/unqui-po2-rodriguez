package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	private Producto producto1;
	private Producto producto2;
	
	private Producto productoSinStock = new Producto(85d, 0);
	
	@BeforeEach
	void setUp() {
		
		producto1 = new Producto(100d, 15);
		producto2 = new Producto(120d, 0);
	}

	@Test
	void testGetPrecioBase() {
		
		assertEquals(100d, producto1.getPrecioBase());
	}
	
	@Test
	void testGetStock() {
		
		assertEquals(15, producto1.getStock());
	}
	
	@Test
	void testGetIva() {
		
		assertEquals(21d, producto1.getIva());
	}
	
	@Test
	void testCalcularPrecioFinal() {
		
		assertEquals(121d, producto1.calcularPrecioFinal());
		assertEquals(145.2, producto2.calcularPrecioFinal());
	}
	
	@Test
	void testCalcularIvaProducto() {
		
		assertEquals(21d, producto1.calcularIvaProducto());
		assertEquals(25.2, producto2.calcularIvaProducto());
	}
	
	@Test
	void testRegistrarOK() throws Exception {
		
		producto1.registrar();
		assertEquals(14, producto1.getStock());
	}
	
	@Test
	void testRegistrarFail() throws Exception {
		
		Exception exception = assertThrows(Exception.class, () -> {
			productoSinStock.registrar();
        });

        assertEquals("No hay stock suficiente", exception.getMessage());
	}
	
	@Test
	void testReducirStock() {
		
		producto1.reducirStock();
		assertEquals(14, producto1.getStock());
	}
}
