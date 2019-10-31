/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mypizzadelivery;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class Menu {
	ArrayList<Pizza> menuPizzas;
	
	public Menu() {
		menuPizzas = new ArrayList<>();
	}

	public Pizza getPizzaFromMenu(int id) {
		Pizza retValPizza = null;
		for  (Pizza p: menuPizzas) {
			if (p.getId() == id) {
				retValPizza = p;
				return  retValPizza;
			}
		}
		return  retValPizza;
	}
	
	public void initMenuFromFile(String filename) {
		//3;Sunshine; Ham and pineapple, a popular choice;87
		//int id, String pizzaName, String pizzaContent, double pris
		String line = "";
		File fh = new File(filename);
		try {
			
			Scanner myScanner = new Scanner(fh);
			while(myScanner.hasNextLine()){
				line = myScanner.nextLine();
				String[] lineArr = line.split(";");
				try {
					Pizza tmpPizza = new Pizza(Integer.parseInt(lineArr[0]), lineArr[1], lineArr[2], Double.parseDouble(lineArr[3]));
					System.out.println(tmpPizza);
					menuPizzas.add(tmpPizza);
					
				} catch (Exception e) {
					System.out.println("Error: " + e);
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("Errr");
		}
		}
		
		public void printMenu() {
			for (Pizza p : menuPizzas) {
				System.out.println(p);
			}
		}
		
		
}
