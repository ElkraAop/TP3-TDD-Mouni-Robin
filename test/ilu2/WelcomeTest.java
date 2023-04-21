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
	void test() {
		assertEquals("Hello, Bob", w.welcome("bob"));
		assertEquals("Hello, Andreas", w.welcome("andreas"));
		assertEquals("Hello, Billi", w.welcome("billi"));
		
	}

}
