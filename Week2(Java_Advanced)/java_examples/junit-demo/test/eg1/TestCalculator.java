package eg1;

//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown()");
	}

	@Test
	void testAdd() {
		assertEquals(8, Calculator.add(5, 3), "Incorrect Addition.");
	}

	// when negative arguments
	@Test
	void testAddPositiveNumber_WhenNegativeArguments() {
		try {
			Calculator.addPositiveNumbers(-5, -3);
			fail("No exception thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Negative number not allowed", e.getMessage());
		}
	}
	
	// when positive arguments
	@Test
	void testAddPositiveNumber_WhenPositiveNumbers() {
		assertEquals(8, Calculator.addPositiveNumbers(5, 3));
	}
	
	// check for large number
	// result is not a large number
}
