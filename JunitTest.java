package com.star.Flip;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

	public class JunitTest{

	public class CalculatorTest {
	    Calculator calculator = new Calculator();

	    @Test
	    public void testSum() {
	        assertEquals(5, calculator.sum(2, 3));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(2, calculator.subtract(5, 3));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(6, calculator.multiply(2, 3));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(2, calculator.divide(6, 3));
	    }

	    @Test(expected = ArithmeticException.class)
	    public void testDivideByZero() {
	        calculator.divide(6, 0);
	    }
}
	
}