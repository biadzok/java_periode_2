package cours_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Hello_world {

	@Test
	void testBasique() {
		org.junit.jupiter.api.Assertions.assertEquals("Bonjour, Arthur.", Hello_world.bonjour("Arthur"));
	}
	
	@Test
	void testNull() {
		org.junit.jupiter.api.Assertions.assertEquals("Bonjour, ami.", Hello_world.bonjour(null));
	}
	
	@Test
	void testVide() {
		org.junit.jupiter.api.Assertions.assertEquals("Bonjour, ami.", Hello_world.bonjour(""));
	}
	
	@Test
	void testHurle() {
		org.junit.jupiter.api.Assertions.assertEquals("BONJOUR NORBERT !", Hello_world.bonjour("NORBERT"));
	}
}
