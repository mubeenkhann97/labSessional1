package countString;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCountBits {

	@Test
	public void testCountZeros() throws Exception{
		int zeros = 2,ones = 2;
		assertEquals("expected zeros ",zeros,countBits.countZerosOrOnes("00mubeen",0));
		assertEquals("expected ones ",ones,countBits.countZerosOrOnes("11mubeen",1));
	}
	
	 @Test(expected=AssertionError.class)
	    public void testAssertionsEnabled() {
	        assert false; // make sure assertions are enabled with VM argument: -ea
	    }

}
