package ar.edu.unq.po2.tp7;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {
	
	ActividadSemanal futbol5hs;
	ActividadSemanal basket6hs;
	DiaDeLaSemana miercoles;
	DiaDeLaSemana jueves;
	
	@BeforeEach
	void setUp() {
		miercoles = DiaDeLaSemana.MIERCOLES;
		jueves = DiaDeLaSemana.JUEVES;
		futbol5hs = new ActividadSemanal(miercoles,5,Deporte.FUTBOL, 1);// Actividad disenada para testear un dia no concurrente
		basket6hs = new ActividadSemanal(jueves, 6, Deporte.BASKET, 1);
	}
	
	@Test 
	void complejidad() {
		assertTrue(futbol5hs.esDeComplejidad(2));
		assertFalse(basket6hs.esDeComplejidad(4));
	}
	
	@Test
	void costos() {
		assertEquals(900, futbol5hs.getCosto());
		assertEquals(1400, basket6hs.getCosto());
	}
	
	@Test 
	void seSabenDescrbir() {
		assertTrue(futbol5hs.toString().equalsIgnoreCase("Deporte: FUTBOL. Dia: MIERCOLES a las 5. Duracion: 1 hora/s."));
	}

}