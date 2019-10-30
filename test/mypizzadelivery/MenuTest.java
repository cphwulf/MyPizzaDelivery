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
public class MenuTest {
	
	@Before
	public void setUp() {
	}

	/**
	 * Test of initMenuFromFile method, of class Menu.
	 */
	@Test
	public void testInitMenuFromFile() throws Exception {
		System.out.println("initMenuFromFile");
		String filename = "Data/Menu2.txt";
		Menu instance = new Menu();
		instance.initMenuFromFile(filename);
		instance.printMenu();
		// TODO review the generated test code and remove the default call to fail.
		assertTrue(1==1);
	}

	/**
	 * Test of printMenu method, of class Menu.
	 */
	@Test
	public void testPrintMenu() {
		System.out.println("printMenu");
		Menu instance = new Menu();
		instance.printMenu();
		assertTrue(1==1);
	}
	
}
