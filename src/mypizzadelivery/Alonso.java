/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mypizzadelivery;

import java.io.FileNotFoundException;
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
	
	public Alonso() {
		this.exitValue = 7;
		this.menuFile = "Data/Menu2.txt";
		myScanner = new Scanner(System.in);
		menu = new Menu();
	}
	
	public void runProgram() throws FileNotFoundException {
		while (choice != exitValue) {
			System.out.println("------ Main menu ------");
			System.out.println("1) init pizzas");
			System.out.println("2) show pizzalist");
			System.out.println("3) order pizza");
			System.out.println("4) show list of  ordered pizzas");
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
		menu.printMenu();
	}
	public void showAllOrders() {
		menu.printMenu();
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