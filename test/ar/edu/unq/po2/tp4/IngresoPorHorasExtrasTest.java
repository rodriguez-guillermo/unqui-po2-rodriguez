package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTest {
	
	private IngresoPorHorasExtras ingresoHsExtras10;
	private IngresoPorHorasExtras ingresoHsExtras0;
	
	@BeforeEach
	void setUp() {
		ingresoHsExtras10 = new IngresoPorHorasExtras("Enero", "Basico", 100d, 10d);
		ingresoHsExtras0 = new IngresoPorHorasExtras("Marzo", "Familia", 200d, 0d);
	}
	
	@Test
	void testMontoImponibleHsExtrasIgualCero() {
		assertEquals(0d, ingresoHsExtras0.getMontoImponible());
		assertEquals("Marzo", ingresoHsExtras0.getMes());
		
		assertEquals(0d, ingresoHsExtras10.getMontoImponible());
		assertEquals("Enero", ingresoHsExtras10.getMes());
	}
	
	@Test
	void testCantidadHsExtras() {
		assertEquals(0d, ingresoHsExtras0.getCantidadHorasExtras());
		assertEquals("Marzo", ingresoHsExtras0.getMes());
		
		assertEquals(10d, ingresoHsExtras10.getCantidadHorasExtras());
		assertEquals("Enero", ingresoHsExtras10.getMes());
	}

}
