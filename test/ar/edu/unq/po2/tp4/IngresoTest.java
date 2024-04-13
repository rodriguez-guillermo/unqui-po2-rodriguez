package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	
	@BeforeEach
	void setUp() {
		ingreso1 = new Ingreso("Julio", "Aguinaldo", 1000d);
		ingreso2 = new Ingreso("Agosto", "Asistencia", 2000d);
	}
	
	@Test
	void testGetMontoPercibido() {
		assertEquals(1000d, ingreso1.getMontoPercibido());
		assertEquals("Aguinaldo", ingreso1.getConcepto());
		
		assertEquals(2000, ingreso2.getMontoPercibido());
		assertEquals("Asistencia", ingreso2.getConcepto());
	}
	
	@Test
	void testGetMontoImponible() {
		assertEquals(1000d, ingreso1.getMontoImponible());
		assertEquals("Julio", ingreso1.getMes());
		
		assertEquals(2000, ingreso2.getMontoImponible());
		assertEquals("Agosto", ingreso2.getMes());
	}

}
