package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class CompanyTest {
	
	private Company company1 = new Company("Compania de Prueba", "27-9408024-3");
	private List<Employee> employees;
	private Employee employee1;
	
	@BeforeEach
	void setUp() {
		
		employees = new ArrayList<Employee>();
		employee1 = mock(Employee.class);
	}
	
	@Test
	void testNombreCompania() {
		
		assertEquals("Compania de Prueba", company1.getName());
	}
	
	@Test
	void testCuitCompania() {
		
		assertEquals("27-9408024-3", company1.getCuit());
	}
	
	@Test
	void testGetEmployees() {
		
		assertEquals(employees, company1.getEmployees());
		assertEquals(0, company1.getEmployees().size());
	}
	
	@Test
	void testAddEmployee() {
		
		assertEquals(0, company1.getEmployees().size());
		
		company1.addEmployee(employee1);
		
		assertEquals(1, company1.getEmployees().size());
		assertTrue(company1.getEmployees().contains(employee1));
	}
	
	@Test
	void testRemoveEmployee() {
		
		assertEquals(0, company1.getEmployees().size());
		
		company1.addEmployee(employee1);
		
		assertEquals(1, company1.getEmployees().size());
		assertTrue(company1.getEmployees().contains(employee1));
		
		company1.removeEmployee(employee1);
		
		assertEquals(0, company1.getEmployees().size());
		assertFalse(company1.getEmployees().contains(employee1));
	}
}
