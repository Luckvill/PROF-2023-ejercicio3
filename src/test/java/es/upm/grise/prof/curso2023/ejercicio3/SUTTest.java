package es.upm.grise.prof.curso2023.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SUTTest {
	
	SUT sut;
	
	@BeforeEach
	public void setUp() {
		this.sut = new SUT();
	}
	
	@Test
	public void assertionRouletteExample() {
		SUT sut = new SUT();
		final int ZERO = 0;
		assertEquals(ZERO, sut.doSomething());
		assertEquals(ZERO, sut.doSomethingElse());
	}
	
	@Test
	public void magicNumberExample() {
		assertEquals(0, sut.doSomething());
		assertEquals(0, sut.doSomethingElse());
	}
	
}
