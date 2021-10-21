package week1_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

class UsingForJUnit {

	UsingFor obj;
	@BeforeEach
	void setUp() {
		obj=new UsingFor();
	}
	
	@RepeatedTest(5)
	void performTests() {
		assertEquals(1,obj.sumUptoN(1),"+ve Number");
		assertEquals(55,obj.sumUptoN(10),"+ve Number");
		assertEquals(0,obj.sumUptoN(0),"zero");
		assertEquals(0,obj.sumUptoN(-5),"-ve Number");
		assertEquals(0,obj.sumUptoN(-31),"+ve Number");
	}

}
