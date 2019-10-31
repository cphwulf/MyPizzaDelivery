/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypizzadelivery;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class NewOrderUITest {
	Menu myMenu;
	
	
	@Before
	public void setUp() {
		myMenu = new Menu();
		myMenu.initMenuFromFile("Data/MenuTest.txt");
	}

	/**
	 * Test of runOrderMenu method, of class NewOrderUI.
	 */
	@Test
	public void testRunOrderMenu() {
		System.out.println("runOrderMenu");
		NewOrderUI myNewOrderUI = new NewOrderUI();
		myNewOrderUI.runOrderMenu();
		assertTrue(1==1);
		// TODO review the generated test code and remove the default call to fail.
	}
	
}
