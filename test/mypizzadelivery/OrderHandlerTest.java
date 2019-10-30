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
	

	/**
	 * Test of orderInitializer method, of class OrderHandler.
	 */
	@Test
	public void testOrderInitializer() {
		System.out.println("orderInitializer");
		OrderHandler instance = new OrderHandler();
		instance.orderInitializer();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of submitOrderToActualOrders method, of class OrderHandler.
	 */
	@Test
	public void testSubmitOrderToActualOrders() throws Exception {
		System.out.println("submitOrderToActualOrders");
		myOrderHandler.submitOrderToActualOrders(myOrder);
		// TODO review the generated test code and remove the default call to fail.
		int actual = 34;
		int expected = 33;
		assertEquals(expected, actual);
	}
	
}
