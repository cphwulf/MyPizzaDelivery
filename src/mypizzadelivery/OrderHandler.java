package mypizzadelivery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author thor
 */

public class OrderHandler {
	
	private LocalDateTime initTime;
	private String filename = "Data/AllOrders";
	private ArrayList<Order> orders;
	
	public OrderHandler() {
		orders = new ArrayList<>();
		initTime = LocalDateTime.now();
	}
	
	public void addOrderToOrderList(Order order) {
		this.orders.add(order);
	}
	
	public int getSizeOfList() {
		return orders.size();
	}
	
	public void markOrderCompleted(Order myOrder) throws IOException {
		// åbne fil med aktuelle ordrer i appendmode
		// tilføje ordren til filen
		// luk
		removeOrderFromActualOrders(myOrder);
		writeOrderToAllOrders(myOrder);
	}
	
	public void removeOrderFromActualOrders(Order myOrder) {
		orders.remove(myOrder);
	}
	
	public void writeOrderToAllOrders(Order myOrder) throws IOException {
		String orderLine = "";
		orderLine += myOrder.getOrderId() + ";";
		orderLine += myOrder.toString();
		File fh = new File(filename);
		FileWriter fw = new FileWriter(fh,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(orderLine);
		bw.close();
	}
	
	public String toString() {
		String msg = "";
		for (Order o : orders) {
			msg += "OrdreID: " + o.getOrderId();
			msg += o.toString();
		}
		return msg;
		
	}
}
