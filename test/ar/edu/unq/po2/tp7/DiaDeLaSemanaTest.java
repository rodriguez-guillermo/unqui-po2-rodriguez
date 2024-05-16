package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiaDeLaSemanaTest {
	DiaDeLaSemana martes;
	DiaDeLaSemana jueves;
	
	@BeforeEach
	void setUp() {
		
		martes = DiaDeLaSemana.MARTES;
		jueves = DiaDeLaSemana.JUEVES;
	
	}

	@Test
	void diasConcurrentes() {
		assertFalse(martes.esDiaConcurrente());
		assertTrue(jueves.esDiaConcurrente());
	}

}
