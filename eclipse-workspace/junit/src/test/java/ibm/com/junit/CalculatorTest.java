package ibm.com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before class");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After class");
	}

	@Test
	void testsum() {
		int expected=6;
		Calculator calculator = new Calculator();
		int actual = calculator.sum(4, 2) ;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	void testdivide() {
		int expected=2;
		Calculator calculator = new Calculator();
		int actual = calculator.divide(4, 2) ;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	void testdivideByZeroException() {
		System.out.println("divide");
		Calculator calculator = new Calculator();
		
		ArithmeticException Exception = assertThrows(ArithmeticException.class,() -> calculator.divide(10,0),
				"Exception divide() to throw, but it disn't");
		
		assertEquals("/ by zero", Exception.getMessage());
		//fail("Not yet implemented");
		
	}
	
	@Test
	void TestSlowMethodPerformance() {
		Calculator calculator = new Calculator();
		assertTimeout(Duration.ofMillis(101), () -> calculator.getConnection());
	
	}

}
