/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author thor
 */
public class IdFactory {
	private static int orderId;

	public static int getOrderId() {
		return  orderId++;
	}
	
}
