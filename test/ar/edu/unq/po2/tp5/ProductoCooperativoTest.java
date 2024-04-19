package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativoTest {
	
	private ProductoCooperativo prodCoop1;
	private ProductoCooperativo prodCoop2;
	
	@BeforeEach
	void setUp() {
		
		prodCoop1 = new ProductoCooperativo(50d, 5);
		prodCoop2 = new ProductoCooperativo(10d, 3);
	}
	
	@Test
	void testGetStock() {
		
		assertEquals(5, prodCoop1.getStock());
	}

	@Test
	void testGetDescuento() {
		
		assertEquals(10d, prodCoop1.getDescuentoPorcentaje());
	}
	
	@Test
	void testGetPrecioBase() {
		
		assertEquals(50d, prodCoop1.getPrecioBase());
		assertEquals(10d, prodCoop2.getPrecioBase());
	}
	
	@Test
	void testCalcularPrecioFinal() {
		
		assertEquals(55.5d, prodCoop1.calcularPrecioFinal());
		assertEquals(11.1d, prodCoop2.calcularPrecioFinal());
	}
	
	@Test
	void testCalcularDescuento() {
		
		assertEquals(5d, prodCoop1.calcularDescuento());
		assertEquals(1d, prodCoop2.calcularDescuento());
	}
}
