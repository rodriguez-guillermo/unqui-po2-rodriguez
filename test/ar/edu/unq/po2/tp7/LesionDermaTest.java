package ar.edu.unq.po2.tp7;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionDermaTest {

	LesionDerma rojo;
	LesionDerma amarillo;
	LesionDerma gris;
	LesionDerma miel;
	
	@BeforeEach
	void setUp() {
		rojo = LesionDerma.ROJO;
		amarillo = LesionDerma.AMARILLO;
		gris = LesionDerma.GRIS;
		miel = LesionDerma.MIEL;
	}

	@Test
	void elProximoDeGrisEsRojo() {
		assertEquals(gris, rojo.proximoColor());
	}
	
	@Test 
	void enumRotativoVuelveAEmpezar() {
		assertEquals(rojo, miel.proximoColor());
	}
	
	@Test 
	void testGetDefinicion() {
		assertEquals("Curado", miel.getDefinicion());
	}
	
	@Test 
	void testGetNivelDeRiesgoMiel() {
		assertEquals(4, miel.getNivelDeRiesgo());
	}
	
	@Test 
	void testGetNivelDeRiesgoRojo() {
		assertEquals(1, rojo.getNivelDeRiesgo());
	}
}
