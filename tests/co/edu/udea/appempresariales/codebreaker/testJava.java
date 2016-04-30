package co.edu.udea.appempresariales.codebreaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class testJava {
	CodeBreaker codeBreaker = new CodeBreaker();
	
	@Test
	/**
	 * Prueba 1: caso ideal
	 * Todos los números coinciden
	 * en valor y posición.
	 */
	public void test1() {
		String respuesta = codeBreaker.testCode("4756");
		assertEquals(respuesta,"XXXX");
	}
	
	@Test
	/**
	 * Prueba 2:
	 * dos números acertados 
	 * en diferente posición.
	 */
	public void test2() {
		String respuesta = codeBreaker.testCode("7412");
		assertEquals(respuesta,"__");
	}
	
	@Test
	/**
	 * Prueba 3:
	 * tres números acertados 
	 * en diferente posición.
	 */
	public void test3() {
		String respuesta = codeBreaker.testCode("6547");
		assertEquals(respuesta,"____");
	}
	
	@Test
	/**
	 * Prueba 4:
	 * Un numero acertado en posición
	 * tres en diferente posición
	 */
	public void test4() {
		String respuesta = codeBreaker.testCode("4567");
		assertEquals("X___",respuesta);
	}
	
	@Test
	/**
	 * Prueba 5:
	 * Ninguna coincidencia
	 * 
	 */
	public void test5() {
		String respuesta = codeBreaker.testCode("3333");
		assertEquals("",respuesta);
	}
	
	@Test
	/**
	 * Prueba 6:
	 * Dos números coinciden en valor y posición.
	 * 
	 */
	public void test6() {
		String respuesta = codeBreaker.testCode("3758");
		assertEquals("XX",respuesta);
	}
	
	@Test
	/**
	 * Prueba 7:
	 * Dos números coinciden en valor
	 * pero no en posición.	
	 */
	public void test7() {
		String respuesta = codeBreaker.testCode("7385");
		assertEquals("__",respuesta);
	}
	
	@Test
	/**
	 * Prueba 8:
	 * Dos números están en posición
	 * un número coincide en valor
	 * pero en diferente posición.
	 */
	public void test8() {
		String respuesta = codeBreaker.testCode("3754");
		assertEquals("XX_",respuesta);
	}
	
	@Test
	/**
	 * Prueba 9:
	 * El tamaño del número ingresado
	 * no coincide con el número secreto.
	 */
	public void test9() {
		String respuesta = codeBreaker.testCode("37545");
		assertEquals("",respuesta);
	}
	
	@Test
	/**
	 * Prueba 10:
	 * El valor ingresado
	 * tiene caracteres alfabeticos
	 */
	public void test10() {
		String respuesta = codeBreaker.testCode("45AA");
		assertEquals("",respuesta);
	}

}
