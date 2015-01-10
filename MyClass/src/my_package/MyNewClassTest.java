package my_package;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyNewClassTest {
	
	int c;
	@Before
	public void setUp() throws Exception {
		c=30;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testadd() {
		
		boolean val = (new MyNewClass()).add(15, 15, c);
		assertTrue(val);
			
		
	}

}
