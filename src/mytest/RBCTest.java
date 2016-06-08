package mytest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RBCTest {
	
	RBC rbc = new RBC();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAMethod() {
		
		// case	1: !first && second && third								OptionOne
		assertEquals("!first && second && third must be 1",1, rbc.AMethod(false, true, true));
		
		// case 2: !first && second && !third && !second --- invalid		OptionTwo
		
		// case 3: !first && second && !third && second						OptionOne
		assertEquals(" !first && second && !third && second must be 1",1, rbc.AMethod(false, true, false));
		
		// case 4: !first && !second										OptionOne
		assertEquals("!first && !second must be 1",1, rbc.AMethod(false, false, true));
		assertEquals("!first && !second must be 1",1, rbc.AMethod(false, false, false));
		
		
		// case 5: first && !third && !second								OptionTwo
		assertEquals("first && !third && !second must be 2",2, rbc.AMethod(true, false, false));
		
		// case 6: first && third && !second								OptionTwo
		assertEquals("first && third && !second must be 2",2, rbc.AMethod(true, false, true));
		
		// case 7: true true false			OptionTwo
		assertEquals("case 7 must be 2",2, rbc.AMethod(true, true, false));
		// case 8: true true true			OptionOne
		assertEquals("case 8",1, rbc.AMethod(true, true, true));
	}

}
