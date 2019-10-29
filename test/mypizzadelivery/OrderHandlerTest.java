package mypizzadelivery;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class OrderHandlerTest {
	Pizza pizza1;
	Pizza pizza2;
	Order myOrder;
	OrderHandler myOrderHandler;
	
	@Before
	public void setUp() {
		pizza1 = new Pizza(1, "Margherita", "mozzarella and cheddar cheese with tomato sauce and herbs", 76);
		pizza2 = new Pizza(2, "Pepperoni", "Hot and spicy pepperoni with mixed peppers", 78);
		myOrder = new Order(34);
		myOrder.addPizza(pizza1);
		myOrder.addPizza(pizza2);
		myOrderHandler = new OrderHandler();
		
	}
	
	@Test
	public void testSomeMethod() throws IOException {
		myOrderHandler.submitOrderToActualOrders(myOrder);
		myOrderHandler.editOrder(myOrder);
		// TODO review the generated test code and remove the default call to fail.
		int actual = 34;
		int expected = 33;
		assertEquals(expected, actual);
	}
	
}
