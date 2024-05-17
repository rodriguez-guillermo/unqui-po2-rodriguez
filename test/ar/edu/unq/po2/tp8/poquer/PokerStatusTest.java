package ar.edu.unq.po2.tp8.poquer;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	
	// Setup
	
	private PokerStatus pokerStatus;
	
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	
	private String cartaDistinta;
	
	@BeforeEach
	void setUp() {
		
		pokerStatus = new PokerStatus();
		
		carta1 = "1P";
		carta2 = "1C";
		carta3 = "1D";
		carta4 = "1T";
		carta5 = "2P";
		
		cartaDistinta = "2C";
	}
	
	// Exercise
	
	@Test
	public void testNoHayPoker() {
		// Verify
		assertFalse(pokerStatus.verificar(carta1, carta2, carta3, cartaDistinta, carta5));
	}
	
	@Test
	public void testSiHayPoker() {
		assertTrue(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	// Teardown
}
