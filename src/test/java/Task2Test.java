import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Task2Test {
Task2 obj;
int x,y;
	@Before
	public void setUp() throws Exception 
	{
	x= 3;
	y=2;
	obj= new Task2();
	}

	@Test
	public void testmultiply() {
		assertEquals(6,obj.multiply(x,y));
	}

}