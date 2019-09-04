import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test1 {
 cucumber c;
	@Before
	public void setUp() throws Exception {
		c=new cucumber();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Calculator() {
		assertEquals(4,c.add(2,2));
	}

}
