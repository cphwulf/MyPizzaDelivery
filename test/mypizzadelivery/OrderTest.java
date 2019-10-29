package mypizzadelivery;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class OrderTest {
	/*
	34;1;Margherita;76;10:30
	34;2;Pepperoni;78;10:30
	35;3;Sunshine; ;87;11:2
	*/
	Pizza pizza1;
	Pizza pizza2;
	Order myOrder;

	
	@Before
	public void setUp() {
		pizza1 = new Pizza(1, "Margherita", "mozzarella and cheddar cheese with tomato sauce and herbs", 76);
		pizza2 = new Pizza(2, "Pepperoni", "Hot and spicy pepperoni with mixed peppers", 78);
		//myOrder = new Order(34,"10:30",orderedPizzas);
	}
	
	@Test
	public void testSomeMethod() {
		myOrder = new Order(34);
		myOrder.addPizza(pizza1);
		myOrder.addPizza(pizza2);
		///myOrder.submitOrder();
		//TODO: hent fil og læs første tal på sidste linje
		int expected = 34;
		int actual = myOrder.getOrderId();
		assertEquals(expected, actual);
	}
	
}
