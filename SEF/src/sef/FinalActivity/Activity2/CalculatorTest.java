package sef.FinalActivity.Activity2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.*;
import org.junit.jupiter.api.TestInfo;


import static org.junit.Assert.*;

public class CalculatorTest extends TestCase {
    private Calculator theCalculator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        theCalculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

    @Test
    public void testGetSum() {

        int a = 5;
        int b = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (theCalculator.add(a, b)));
        assertEquals(15, (theCalculator.add(b, a)));

        a = -5;
        b = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(5, (theCalculator.add(a, b)));
        assertEquals(5, (theCalculator.add(b, a)));

        a = -5;
        b = -10;
        //	Checks the sum of two (2) negative values
        assertEquals(-15, (theCalculator.add(a, b)));
        assertEquals(-15, (theCalculator.add(b, a)));
    }

    @Test
    public void testGetDifference() {

        int a = 3;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(1, (theCalculator.subtract(a, b)));
        //	Checks if b is greater than a
        assertEquals(-1, (theCalculator.subtract(b, a)));

        a = 5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(9, (theCalculator.subtract(a, b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-9, (theCalculator.subtract(b, a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (theCalculator.subtract(a, b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (theCalculator.subtract(b, a)));
    }

    @Test
    public void testGetProduct() {

        double a = 5;
        double b = 10;
        //	Checks the product of two (2) positive values
        assertEquals(50, (theCalculator.multiply(a, b)), 0);
        assertEquals(50, (theCalculator.multiply(b, a)), 0);

        a = -5;
        b = 10;
        //	Checks the product of a postive value and a negative value
        assertEquals(-50, (theCalculator.multiply(a, b)), 0);
        assertEquals(-50, (theCalculator.multiply(b, a)), 0);

        a = -3;
        b = -10;
        //	Checks the product of two (2) negative values
        assertEquals(30, (theCalculator.multiply(a, b)), 0);
        assertEquals(30, (theCalculator.multiply(b, a)), 0);
    }

    @Test
    public void testGetQuotient() {

        double a = 10;
        double b = 5;
        //	Checks if b is lesser than a
        assertEquals(2, (theCalculator.divide(a, b)), 0);
        //	Checks if b is greater than a
        assertEquals(0.5, (theCalculator.divide(b, a)), 0);

        a = 9;
        b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (theCalculator.divide(a, b)), 0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.33, (theCalculator.divide(b, a)), 0.007);

        a = -10;
        b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (theCalculator.divide(a, b)), 0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.5, (theCalculator.divide(b, a)), 0);
    }

    @Test
    public void testThrowException() {

        try {

            theCalculator.add(2, 1);
            theCalculator.subtract(3, 3);
            theCalculator.multiply(0, 1);
            theCalculator.divide(1, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        } catch (Error e) {
            fail();
        }
    }
}