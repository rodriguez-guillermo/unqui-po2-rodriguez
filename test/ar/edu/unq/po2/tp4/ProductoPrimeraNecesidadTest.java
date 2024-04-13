package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad lecheDefault;
	private ProductoPrimeraNecesidad arroz8;
	private ProductoPrimeraNecesidad leche11;
	private ProductoPrimeraNecesidad vino100;
	
	@BeforeEach
	public void setUp() {
		lecheDefault = new ProductoPrimeraNecesidad("Leche - 10% de descuento (default)", 8d, false);
		arroz8 = new ProductoPrimeraNecesidad("Leche - 8% de descuento", 5d, true, 8d);
		leche11 = new ProductoPrimeraNecesidad("Leche - 11% de descuento", 8d, true, 11d);
		vino100 = new ProductoPrimeraNecesidad("Vino - 100% de descuento", 3d, false, 100d);
	}
	
	@Test
	public void testCalcularPrecioLecheDescuentoDefault() {
		assertEquals(7.2, lecheDefault.getPrecio());
	}
	
	@Test
	public void testCalculaPrecioArroz8PorCientoDeDescuento() {
		assertEquals(4.6, arroz8.getPrecio());
	}
	
	@Test
	public void testCalculaPrecioLeche11PorCientoDeDescuento() {
		assertEquals(7.12, leche11.getPrecio());
	}
	
	@Test
	public void testCalculaPrecioVino100PorCientoDeDescuento() {
		assertEquals(0d, vino100.getPrecio());
	}
}
