package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Trabajador trabajadorNuevo;
	private Trabajador trabajador1;
	private Trabajador trabajador2;
	private Trabajador trabajador3;
	private Trabajador trabajador4;
	private Trabajador trabajador5;
	private Trabajador trabajador6;
	
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private Ingreso ingreso3;
	private Ingreso ingreso4;
	private Ingreso ingreso5;
	private Ingreso ingreso6;
	
	@BeforeEach
	void setUp(){
		
		List<Ingreso> listaDeIngresos1 = new ArrayList<Ingreso>();
		List<Ingreso> listaDeIngresos2 = new ArrayList<Ingreso>();
		List<Ingreso> listaDeIngresos3 = new ArrayList<Ingreso>();
		List<Ingreso> listaDeIngresos4 = new ArrayList<Ingreso>();
		List<Ingreso> listaDeIngresos5 = new ArrayList<Ingreso>();
		List<Ingreso> listaDeIngresos6 = new ArrayList<Ingreso>();
		
		ingreso1 = new Ingreso("Octubre", "Aguinaldo", 20d);
		ingreso2 = new Ingreso("Noviembre", "Sueldo", 40d);
		ingreso3 = new Ingreso("Diciembre", "Basico", 60d);
		
		ingreso4 = new IngresoPorHorasExtras("Octubre", "Aguinaldo", 20d, 10d);
		ingreso5 = new IngresoPorHorasExtras("Noviembre", "Sueldo", 30d, 20d);
		ingreso6 = new IngresoPorHorasExtras("Diciembre", "Basico", 60d, 30d);
		
		listaDeIngresos1.add(ingreso1);
		
		listaDeIngresos2.add(ingreso1);
		listaDeIngresos2.add(ingreso2);
		
		listaDeIngresos3.add(ingreso1);
		listaDeIngresos3.add(ingreso2);
		listaDeIngresos3.add(ingreso3);
		
		listaDeIngresos4.add(ingreso4);
		
		listaDeIngresos5.add(ingreso1);
		listaDeIngresos5.add(ingreso4);
		
		listaDeIngresos6.add(ingreso1);
		listaDeIngresos6.add(ingreso2);
		listaDeIngresos6.add(ingreso3);
		listaDeIngresos6.add(ingreso4);
		listaDeIngresos6.add(ingreso5);
		listaDeIngresos6.add(ingreso6);
		
		trabajadorNuevo = new Trabajador("Trabajador Nuevo");
		trabajador1 = new Trabajador("Trabajador 1", listaDeIngresos1);
		trabajador2 = new Trabajador("Trabajador 2", listaDeIngresos2);
		trabajador3 = new Trabajador("Trabajador 3", listaDeIngresos3);
		trabajador4 = new Trabajador("Trabajador 4", listaDeIngresos4);
		trabajador5 = new Trabajador("Trabajador 5", listaDeIngresos5);
		trabajador6 = new Trabajador("Trabajador 6", listaDeIngresos6);
		
	}
	
	@Test
	void testTrabajadorNuevoNoTieneIngresos() {
		
		assertEquals(0, trabajadorNuevo.getIngresos().size());	
	}
	
	@Test
	void testTrabajadorNuevoTotalPercibido() {
		
		assertEquals(0, trabajadorNuevo.getTotalPercibido());	
	}
	
	@Test
	void testTrabajadorNuevoMontoImponible() {
		
		assertEquals(0, trabajadorNuevo.getMontoImponible());	
	}
	
	@Test
	void testTrabajadorNuevoImpuestoAPagar() {
		
		assertEquals(0, trabajadorNuevo.getImpuestoAPagar());	
	}
	
	@Test
	void testTrabajador1CantidadDeIngresos() {
		
		assertEquals(1, trabajador1.getIngresos().size());	
	}
	
	@Test
	void testTrabajador1TotalPercibido() {
		
		assertEquals(20d, trabajador1.getTotalPercibido());	
	}
	
	@Test
	void testTrabajador1MontoImponible() {
		
		assertEquals(20d, trabajador1.getMontoImponible());	
	}
	
	@Test
	void testTrabajador1ImpuestoAPagar() {
		
		assertEquals(0.4d, trabajador1.getImpuestoAPagar());	
	}
	
	@Test
	void testTrabajador2CantidadDeIngresos() {
		
		assertEquals(2, trabajador2.getIngresos().size());	
	}
	
	@Test
	void testTrabajador2TotalPercibido() {
		
		assertEquals(60d, trabajador2.getTotalPercibido());	
	}
	
	@Test
	void testTrabajador2MontoImponible() {
		
		assertEquals(60d, trabajador2.getMontoImponible());	
	}
	
	@Test
	void testTrabajador2ImpuestoAPagar() {
		
		assertEquals(1.2d, trabajador2.getImpuestoAPagar());	
	}
	
	@Test
	void testTrabajador3CantidadDeIngresos() {
		
		assertEquals(3, trabajador3.getIngresos().size());	
	}
	
	@Test
	void testTrabajador3TotalPercibido() {
		
		assertEquals(120d, trabajador3.getTotalPercibido());	
	}
	
	@Test
	void testTrabajador3MontoImponible() {
		
		assertEquals(120d, trabajador3.getMontoImponible());	
	}
	
	@Test
	void testTrabajador3ImpuestoAPagar() {
		
		assertEquals(2.4d, trabajador3.getImpuestoAPagar());	
	}
	
	@Test
	void testTrabajador4CantidadDeIngresos() {
		
		assertEquals(1, trabajador4.getIngresos().size());	
	}
	
	@Test
	void testTrabajador4TotalPercibido() {
		
		assertEquals(20d, trabajador4.getTotalPercibido());	
	}
	
	@Test
	void testTrabajador4MontoImponible() {
		
		assertEquals(0d, trabajador4.getMontoImponible());	
	}
	
	@Test
	void testTrabajador4ImpuestoAPagar() {
		
		assertEquals(0d, trabajador4.getImpuestoAPagar());	
	}
	
	@Test
	void testTrabajador5CantidadDeIngresos() {
		
		assertEquals(2, trabajador5.getIngresos().size());	
	}
	
	@Test
	void testTrabajador5TotalPercibido() {
		
		assertEquals(40d, trabajador5.getTotalPercibido());	
	}
	
	@Test
	void testTrabajador5MontoImponible() {
		
		assertEquals(20d, trabajador5.getMontoImponible());	
	}
	
	@Test
	void testTrabajador5ImpuestoAPagar() {
		
		assertEquals(0.4d, trabajador5.getImpuestoAPagar());	
	}

	@Test
	void testTrabajador6CantidadDeIngresos() {
		
		assertEquals(6, trabajador6.getIngresos().size());	
	}
	
	@Test
	void testTrabajador6TotalPercibido() {
		
		assertEquals(230d, trabajador6.getTotalPercibido());	
	}
	
	@Test
	void testTrabajador6MontoImponible() {
		
		assertEquals(120d, trabajador6.getMontoImponible());	
	}
	
	@Test
	void testTrabajador6ImpuestoAPagar() {
		
		assertEquals(2.4d, trabajador6.getImpuestoAPagar());	
	}
}
