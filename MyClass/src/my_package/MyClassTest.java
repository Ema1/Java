package my_package;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyClassTest {

	int [] a;
	@Before
	public void setUp() throws Exception {
		a = new int[]{2,3,4,5,6};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSearch() {
		boolean val = (new MyClass()).search(a, 3);
		assertFalse(val);
		
	}
	
	@Test
	public final void testSearchNoItem() {
		boolean val = (new MyClass()).search(a, 7);
		assertFalse(val);
	}
}
