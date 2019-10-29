package mypizzadelivery;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class PizzaTest {
	Pizza myPizza;
	
	@Before
	public void setUp() {
		//25;Four Seasons; Pepperoni, ham and pineapple, mixed peppers, mushrooms and onion;78
		myPizza = new Pizza(25,"Four Seasons","Pepperoni, ham and pineapple, mixed peppers, mushrooms and onion",78);
	}

	@Test
	public void testSomeMethod() {
		int expected = 25;
		int actual = myPizza.getId();
		assertEquals(expected, actual);
	}
	
}
