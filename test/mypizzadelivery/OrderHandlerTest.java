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
	Pizza pizza3;
	Pizza pizza4;
	Pizza pizza5;
	Pizza pizza6;
	Pizza pizza7;
	Pizza pizza8;
	Order myOrder1;
	Order myOrder2;
	Order myOrder3;
	OrderHandler myOrderHandler;
	
	@Before
	public void setUp() {
		myOrderHandler = new OrderHandler();
		pizza1 = new Pizza(1, "Margherita", "mozzarella and cheddar cheese with tomato sauce and herbs", 76);
		pizza2 = new Pizza(2, "Pepperoni", "Hot and spicy pepperoni with mixed peppers", 78);
		pizza4 = new Pizza(3,"Sunshine", "Ham and pineapple",87);
		pizza7 = new Pizza(13,"Blazing Saddles"," Topped with beans and sausage",78);
		myOrder1 = new Order(34);
		myOrder1.addPizza(pizza1);
		myOrder1.addPizza(pizza2);
		myOrder2 = new Order(35);
		myOrder2.addPizza(pizza1);
		myOrder2.addPizza(pizza1);
		myOrder2.addPizza(pizza2);
		myOrder3 = new Order(36);
		myOrder3.addPizza(pizza1);
		myOrder3.addPizza(pizza7);
	}
	
	
	/**
	 * Test of submitOrderToActualOrders method, of class OrderHandler.
	 */
	@Test
	public void testSubmitOrderToActualOrders() throws Exception {
		System.out.println("submitOrderToActualOrders");
	//	myOrderHandler.submitOrderToActualOrders(myOrder1);
		// TODO review the generated test code and remove the default call to fail.
		int actual = 34;
		int expected = 33;
		assertEquals(expected, actual);
	}

	/**
	 * Test of addOrderToOrderList method, of class OrderHandler.
	 */
	@Test
	public void testAddOrderToOrderList() {
		System.out.println("addordertolist");
		myOrderHandler.addOrderToOrderList(myOrder1);
		int actual = myOrderHandler.getSizeOfList();
		int expected = 1;
		assertEquals(expected, actual);
	}

	/**
	 * Test of getSizeOfList method, of class OrderHandler.
	 */
	@Test
	public void testGetSizeOfList() {
		System.out.println("getSizeOfList");
		OrderHandler instance = new OrderHandler();
		int expResult = 0;
		int result = instance.getSizeOfList();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of markOrderCompleted method, of class OrderHandler.
	 */
	@Test
	public void testMarkOrderCompleted() throws Exception {
		System.out.println("markOrderCompleted");
		System.out.println("---");
		myOrderHandler.addOrderToOrderList(myOrder1);
		myOrderHandler.addOrderToOrderList(myOrder2);
		myOrderHandler.addOrderToOrderList(myOrder3);
		System.out.println(myOrderHandler);
		System.out.println("---");
		myOrderHandler.markOrderCompleted(myOrder1);
		System.out.println(myOrderHandler);
		// TODO review the generated test code and remove the default call to fail.
		int actual = myOrderHandler.getSizeOfList();
		int expected = 2;
		assertEquals(expected, actual);
	}

	/**
	 * Test of toString method, of class OrderHandler.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		OrderHandler instance = new OrderHandler();
		String expResult = "";
		String result = instance.toString();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
