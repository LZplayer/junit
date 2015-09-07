import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class jisuanTest {
	private jisuan calculator=new jisuan();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
		
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8,calculator.getResult());
		
	}

}