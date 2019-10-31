/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mypizzadelivery;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class Alonso {
	int exitValue;
	int choice;
	Menu menu;
	String menuFile;
	Scanner myScanner;
	OrderHandler myOrderHandler;
	NewOrderUI newOrderUI;
	
	public Alonso() {
		this.exitValue = 7;
		this.menuFile = "Data/MenuTest.txt";
		myScanner = new Scanner(System.in);
		menu = new Menu();
		myOrderHandler = new OrderHandler();
	}
	
	public void runProgram() throws FileNotFoundException {
		while (choice != exitValue) {
			System.out.println("------ Main menu ------");
			System.out.println("1) init pizzas");
			System.out.println("2) show pizzalist");
			System.out.println("3) order pizza");
			System.out.println("4) show list of  actual orders");
			System.out.println("5) remove order from ordered list");
			System.out.println("6) show history ");
			System.out.println("7) exit program");
			choice = myScanner.nextInt();
			switch(choice) {
				case 1:
					initializeMenu();
					break;
				case 2:
					showPizzas();
					break;
				case 3:
					newOrder();
					break;
				case 4:
					showAllOrders();
					break;
				case 5:
					removeOrderFromList();
					break;
				case 6:
					showOrderHistory();
					break;
				case 7:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Exit");
					
			}
		}
	}
	public void initializeMenu() {
		try {
		menu.initMenuFromFile(menuFile);
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	public void showPizzas() {
		menu.printMenu();
	}
	public void newOrder() {
		newOrderUI = new NewOrderUI();
		newOrderUI.runOrderMenu();
		ArrayList<String> retVal = newOrderUI.finalizeOrderUI();
		System.out.println("new order vals:" + retVal.toString());
		Order newOrder = handleOrderFromUI(retVal);
		myOrderHandler.addOrderToOrderList(newOrder);
	}

	public Order handleOrderFromUI(ArrayList<String> retValFromUI) {
		Order newOrder = new Order();
		newOrder.setCustomer(retValFromUI.get(0));
		newOrder.setPhoneNumber(retValFromUI.get(1));
		newOrder.setPickupMinutes(Integer.parseInt(retValFromUI.get(2)));
		String pizzaLine = retValFromUI.get(3);
		pizzaLine = pizzaLine.substring(1,pizzaLine.length()-1);
		String[] pizzaArr = pizzaLine.split(",");
		for (String s: pizzaArr) {
			s=s.trim();
			Pizza tmpPizza = menu.getPizzaFromMenu(Integer.parseInt(s));
			if (tmpPizza != null) {
				newOrder.addPizza(tmpPizza);
			}
		}
		return newOrder;
	}

	public void showAllOrders() {
		System.out.println(myOrderHandler.toString());
	}
	public void showOrderHistory() {
		menu.printMenu();
	}
	public void removeOrderFromList() {


		menu.printMenu();
	}
	public void runStats() {
		menu.printMenu();
	}
}