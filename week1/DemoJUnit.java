package week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

class DemoJUnit {

	Demo demo;
	
	@BeforeEach
	void setUp() {
		demo=new Demo();
	}
	
	@RepeatedTest(5)
	void testProgram() {
		assertEquals("Odd",demo.oddEven(-5),"Negative Odd Number");
		assertEquals("Odd",demo.oddEven(5),"Positive Odd Number");
		assertEquals("Even",demo.oddEven(20),"Positive Even Number");
		assertEquals("Even",demo.oddEven(-10),"Negative Even Number");
		assertEquals("Even",demo.oddEven(0),"Zero as Number");
	}

}
