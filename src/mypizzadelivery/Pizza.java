/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypizzadelivery;

/**
 *
 * @author thor
 */
public class Pizza {
	////25;Four Seasons; Pepperoni, ham and pineapple, mixed peppers, mushrooms and onion;78
	int id;
	String pizzaName;
	String pizzaContent;
	double pris;

	public Pizza(int id, String pizzaName, String pizzaContent, double pris) {
		this.id = id;
		this.pizzaName = pizzaName;
		this.pizzaContent = pizzaContent;
		this.pris = pris;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getPizzaContent() {
		return pizzaContent;
	}

	public void setPizzaContent(String pizzaContent) {
		this.pizzaContent = pizzaContent;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	@Override
	public String toString() {
		String msg = "";

		msg = "id:" + id + ", Name:" + pizzaName + ", Content:" + pizzaContent + ", price:" + pris;
		return msg;
	}
	

	
}
