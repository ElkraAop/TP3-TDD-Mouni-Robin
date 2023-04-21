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
		assertEquals("HELLO, JEREMY", w.welcome("JEREMY"));
	}
	void testMajDebut() {
		assertEquals("Hello, JErry", w.welcome("jErry"));
	}

}
