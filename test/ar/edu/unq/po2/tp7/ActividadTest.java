package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadTest {
	
	Deporte futbol;
	Deporte running;
	Deporte basket;
	
	@BeforeEach
	void setUp() {
		futbol = Deporte.FUTBOL;
		running = Deporte.RUNNING;
		basket = Deporte.BASKET;
	}

	@Test
	void complejidadTest() {
		assertEquals(2, futbol.getComplejidad());
		assertEquals(2, basket.getComplejidad());
		assertEquals(1, running.getComplejidad());
	}

}
