/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypizzadelivery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thor
 */

public class OrderHandler {

	Order order;
	String filename;

	public OrderHandler() {
		this.filename = "Data/ActualOrders";

	}

	public void orderInitializer() {
		this.order = new Order();
	}

	public void submitOrderToActualOrders(Order myOrder) throws IOException {
		// åbne fil med aktuelle ordrer i appendmode
		// tilføje ordren til filen
		// luk
//		38;3;Sunshine; ;87;13:02
//Order{submitTime=null, id=34, orderedPizzas={id: 1,Name: Margherita,Pris: 76.0}{id: 2,Name: Pepperoni,Pris: 78.0}}
		File fh = new File(filename);
		FileWriter fw = new FileWriter(fh,true);
		BufferedWriter bw = new BufferedWriter(fw);
		String orderLine = myOrder.toString();
		bw.write(orderLine);
		bw.close();
	}
}
