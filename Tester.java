import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tester {
    @Test
    public void testAddition1() {
		Calculator calculator = new Calculator();
    	assertEquals(2, calculator.add(1, 1));
	}

	@Test
    public void testAddition2() {
		Calculator calculator = new Calculator();
    	assertEquals(6, calculator.add(3, 4));
	}

    @Test
    public void testSubtraction1() {
		Calculator calculator = new Calculator();
    	assertEquals(2, calculator.subtract(5,3));
	}

	@Test
    public void testSubtraction2() {
		Calculator calculator = new Calculator();
    	assertEquals(5, calculator.subtract(12,8));
	}

}
