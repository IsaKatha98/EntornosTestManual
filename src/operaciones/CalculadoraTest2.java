package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTest2 {

	@ParameterizedTest
	@MethodSource("division")
	void divide(int num1, int num2, int expected) {

		Calculadora calc = new Calculadora(num1, num2);
		int res = calc.divide();
		assertEquals(expected, res);

	}

	private static Stream<Arguments> division() {

		return Stream.of(

				Arguments.of(20, 10, 2), Arguments.of(30, -2, -15), Arguments.of(5, 2, 2)

		);

	}

	@ParameterizedTest
	@MethodSource("suma")
	void suma(int num1, int num2, int expected) {

		Calculadora calc = new Calculadora(num1, num2);
		int res = calc.suma();
		assertEquals(expected, res);

	}

	private static Stream<Arguments> suma() {

		return Stream.of(

				Arguments.of(20, 10, 30), Arguments.of(30, -2, 28), Arguments.of(5, 2, 7)

		);

	}

	@ParameterizedTest
	@MethodSource("multiplicacion")
	void multiplica(int num1, int num2, int expected) {

		Calculadora calc = new Calculadora(num1, num2);
		int res = calc.multiplica();
		assertEquals(expected, res);

	}

	private static Stream<Arguments> multiplicacion() {

		return Stream.of(

				Arguments.of(20, 10, 200), Arguments.of(4, -2, -8), Arguments.of(5, 2, 10)

		);

	}

	@ParameterizedTest
	@MethodSource("resta")
	void resta(int num1, int num2, int expected) {

		Calculadora calc = new Calculadora(num1, num2);
		int res = calc.resta();
		assertEquals(expected, res);

	}

	private static Stream<Arguments> resta() {

		return Stream.of(

				Arguments.of(20, 10, 10), 
				Arguments.of(4, 10, 6), 
				Arguments.of(5, 2, 3)

		);

	}

	@ParameterizedTest
	@MethodSource("resta2")
	void resta2(int num1, int num2, boolean expected) {

		Calculadora calc = new Calculadora(num1, num2);
		boolean res = calc.resta2();
		assertEquals(expected, res);

	}

	private static Stream<Arguments> resta2() {

		return Stream.of(

				Arguments.of(20, 10, true), 
				Arguments.of(4, 10, false), 
				Arguments.of(5, 2, true)

		);

	}
	
	@ParameterizedTest
	@MethodSource("divide2")
	void divide2 (int num1, int num2, Integer expected) {

		Calculadora calc = new Calculadora(num1, num2);
		Integer res = calc.divide2();
		assertEquals(expected, res);

	}


	private static Stream<Arguments> divide2() {

		return Stream.of(

				Arguments.of(20, 0, null), 
				Arguments.of(4, 2, 2 ), 
				Arguments.of(5, 0, null )

		);
		
	}

}
