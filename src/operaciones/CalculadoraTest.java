package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	static Calculadora calc1;
	
	@BeforeAll
	
	void CrearCalculadora(){
		
		calc1= new Calculadora (20,10);
		
	}
	
	@AfterAll
	
	void borrarCalculadora() {
		
		calc1=null;
	}
	

	@Test
	void testSuma() {

		Calculadora calc = new Calculadora(20, 10);
		int res = calc.suma();
		assertEquals(30, res);
	}

	@Test
	void testResta() {

		Calculadora calc = new Calculadora(20, 10);
		int res = calc.resta();
		assertEquals(10, res);

	}
	
	@Test
	void testMultiplica() {

		Calculadora calc = new Calculadora(20, 10);
		int res = calc.multiplica();
		assertEquals(200, res);
	}

	@Test
	void testDivide() {

		Calculadora calc = new Calculadora(20, 10);
		int res = calc.divide();
		assertEquals(2, res);
	}

	@Test
	void testResta2_true() {

		Calculadora calc = new Calculadora(20, 10);
		boolean res = calc.resta2();
		assertTrue(res);

	}
	@Test
	void testResta2_false() {

		Calculadora calc = new Calculadora(10,20);
		boolean res = calc.resta2();
		assertFalse(res);

	}
	@Test
	void testDivide2_null() {

		Calculadora calc = new Calculadora(20, 0);
		Integer res = calc.divide2();
		assertNull(res);

	}
	@Test
	void testDivide2_NotNull() {

		Calculadora calc = new Calculadora(20, 10);
		Integer res = calc.divide2();
		assertNotNull(res);

	}
	@Test
	void testDivide2_Integer() {

		Calculadora calc = new Calculadora(20, 10);
		Integer res = calc.divide2();
		assertEquals(2, res);

	}

}
