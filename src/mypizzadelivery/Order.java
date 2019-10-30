package mypizzadelivery;

import Util.IdFactory;
import java.time.LocalTime;
import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;


/**
 *
 * @author thor
 */
public class Order {
	/*
	34;1;Margherita;76;10:30
	34;2;Pepperoni;78;10:30
	*/
	private String submitTime;
	private int id;
	private ArrayList<Pizza> orderedPizzas;

	public Order(int id) {
		this.id = id;
		orderedPizzas = new ArrayList<>();
	}

	public  Order() {
		this.id = IdFactory.getOrderId();
		orderedPizzas = new ArrayList<>();
	}

	public void addPizza(Pizza pizza) {
		orderedPizzas.add(pizza);
	}

	public int getOrderId() {
		return id;
	}

	public void setSubmitTime(String timeString) {
		this.submitTime = timeString;
	}

	public ArrayList<Pizza> getOrderedPizzas() {
		return orderedPizzas;
	}

	@Override
	public String toString() {
		//34;2;Pepperoni;78;10:30
		LocalTime myLocalTime = LocalTime.now();
		String retValString = "";
		String tmpString = "[";
		for (Pizza pizza :  orderedPizzas) {
			tmpString += pizza.getId() +";"; 
			tmpString += pizza.getPizzaName() +";"; 
			tmpString += pizza.getPris() + ";"; 
			tmpString += "@" ;
		}
		tmpString += "];"+myLocalTime.getHour()+":"+myLocalTime.getMinute()+"\n";
		return tmpString;
	}
	
}
