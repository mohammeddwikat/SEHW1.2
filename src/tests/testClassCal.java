package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import testclass.cal;

class testClassCal {

	@Test
	public void test() {
		cal c = new cal();
		assertEquals(404, c.add(402, 2));
		assertEquals(404, c.subtract(406, 2));
		assertEquals(404, c.mul(202, 2));
		assertEquals(404, c.div(808, 2));
	}

	@Test
	public void testAdd_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		cal c = new cal();
		// Act
		int result = c.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);
	}


	@Test
	public void testAdd_BothNumbersAreNegative_ShouldReturnNegativeNumber() {
		// Arrange
		int a = -10;
		int b = -20;
		cal c = new cal();
		// Act
		int result = c.add(a, b);
		// Assert
		Assert.assertTrue(result < 0);
	}

}
