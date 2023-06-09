package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	private Welcome w;
	@BeforeEach
	void setUp() throws Exception{
		this.w = new Welcome();
	}
	@Test
	void testBob() {
		assertEquals("Hello, Bob", w.welcome("bob"));
	}
	@Test
	void testAndreas() {
		assertEquals("Hello, Andreas", w.welcome("andreas"));
	}
	@Test
	void testBilli() {
		assertEquals("Hello, Billi", w.welcome("billi"));
	}
	@Test
	void testBlanc() {
		assertEquals("Hello, my friend", w.welcome("   "));
	}
	@Test
	void testVide() {
		assertEquals("Hello, my friend", w.welcome(""));
	}
	@Test
	void testNull() {
		assertEquals("Hello, my friend", w.welcome(null));
	}
	@Test
	void testCRIS() {
		assertEquals("HELLO, JEREMY !", w.welcome("JEREMY"));
	}
	@Test
	void testMajDebut() {
		assertEquals("Hello, JErry", w.welcome("jErry"));
	}
	@Test
	void testDeuxNomEnImput() {
		assertEquals("Hello, Leo and Lea", w.welcome("leo, lea"));
	}
	@Test
	void testPlusieursNomEnImput() {
		assertEquals("Hello, Leo, Lea and Theo", w.welcome("leo, lea, theo"));
	}
	@Test
	void testPlusieursNomEnImput2() {
		assertEquals("Hello, Leo, Lea, Theo and Lucas", w.welcome("leo, lea, theo, Lucas"));
	}
	@Test
	void testPlusieursNomEnImput3() {
		assertEquals("Hello, Leo, Lea, Theo and Lucas", w.welcome("leo, lea, theo, lucas"));
	}
	@Test
	void testPlusieursNomEnImputAvecCris() {
		assertEquals("Hello, Leo. AND HELLO, LUCAS !", w.welcome("leo, LUCAS"));
	}
	@Test
	void testAndPourLeDernierNom() {
		assertEquals("Hello, Leo and Lea. AND HELLO, LUCAS !", w.welcome("leo, lea, LUCAS"));
		assertEquals("Hello, Leo. AND HELLO, LUCAS AND LEA !", w.welcome("leo, LUCAS, LEA"));
		assertEquals("Hello, Leo. AND HELLO, LUCAS AND LEA !", w.welcome("LUCAS, leo, LEA"));
	}


}
