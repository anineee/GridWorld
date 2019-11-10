package HelloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testMain() {
		assertEquals(true, new HelloWorld().str.equals("Hello, world!"));
	}

}
