/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mypizzadelivery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class NewOrderUI {
	public Scanner myScanner;
	private int choice;
	private int exitVal;
	HashMap<String, String> uiFeedBack;
	ArrayList<Pizza> orderedPizzas;
	ArrayList<Integer> orderedPizzaNums;
	private String phoneNumber;
	private String customerName;
	private String pickupMinutes;
	
	
	public NewOrderUI() {
		myScanner = new Scanner(System.in);
		choice = 0;
		exitVal = 6;
		uiFeedBack = new HashMap<>();
		orderedPizzas = new ArrayList<>();
		orderedPizzaNums = new ArrayList<>();
		
	}
	
	public void printOderOptions() {
		System.out.println("Order pizza. Ask for:");
		System.out.println("1) Customer phonenumber");
		System.out.println("2) Customer Name");
		System.out.println("3) pizza number ");
		System.out.println("4) edit pizzas ");
		System.out.println("5) pickuptime (mins from now)");
		System.out.println("6) Accept order (show total price)");
		System.out.println("7) Return  to main options");
	}
	
	
	public void runOrderMenu() {
		printOderOptions();
		//choice = myScanner.nextInt();
		while(choice !=exitVal) {
			System.out.println("Enter option:");
			choice = myScanner.nextInt();
			myScanner.nextLine();
			switch(choice) {
				case 1:
					System.out.println("Enter phonenumber:");
					phoneNumber = myScanner.nextLine();
					uiFeedBack.put("phoneNumber", phoneNumber);
					break;
				case 2:
					System.out.println("Enter Name:");
					customerName = myScanner.nextLine();
					uiFeedBack.put("customerName", customerName);
					break;
				case 3:
					System.out.println("Enter pizzaNumber:");
					orderedPizzaNums.add(myScanner.nextInt());
					myScanner.nextLine();
					uiFeedBack.put("pizzaNumber", phoneNumber);
					break;
				case 4:
					System.out.println("Enter pizzaNumber to remove:");
					orderedPizzaNums.remove(myScanner.nextInt());
					myScanner.nextLine();
					break;
				case 5:
					System.out.println("Enter pickuptime:");
					pickupMinutes = myScanner.nextLine();
					uiFeedBack.put("pickupMinutes", pickupMinutes);
					break;
				case 6:
					System.out.println("Accept order");
					printOrder();
					String response = myScanner.nextLine();
					if (response.equals(choice)) {
						choice=exitVal;
					} else {
						System.out.println("Go edit menu");
					}
					break;
				case 7:
					System.out.println("Exit order menu");
					choice = exitVal;
					break;
				default:
					System.out.println("Not a number in the menu");
					break;
			}
		}
		
	}
	
	public void printOrder() {
		System.out.println("Name:" + customerName);
		System.out.println("Phone:" + phoneNumber);
		System.out.println("pickuptime:" + pickupMinutes);
		System.out.println("PizzaNums:" + orderedPizzaNums.toString());
	}
	
	public ArrayList<String> finalizeOrderUI() {
		ArrayList<String> retVal = new ArrayList<>();
		retVal.add(customerName);
		retVal.add(phoneNumber);
		retVal.add(pickupMinutes);
		retVal.add(orderedPizzaNums.toString());
		return retVal;
	}
	
}
