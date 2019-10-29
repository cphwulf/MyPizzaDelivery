package mypizzadelivery;

import Util.IdFactory;
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
	String submitTime;
	int id;
	ArrayList<Pizza> orderedPizzas;

	public Order(int id) {
		this.id = id;
		orderedPizzas = new ArrayList<>();
	}

	public  Order() {
		this.id = IdFactory.getOrderId();
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
	
	
}
