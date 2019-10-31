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
public class Statistics {
	String sourceFilename;
	String destFilename;


	public Statistics(String filename) {
		this.sourceFilename = filename;
		this.destFilename = "Data/statistics";
	}
	public Statistics() {
		this.sourceFilename = "Data/allorderstest";
		this.destFilename = "Data/stattest";
	}


	public double computeTurnOver(int daysFromToday) throws FileNotFoundException {
		//38;[1;Margherita;76.0;@13;Blazing Saddles;78.0;@2;Pepperoni;78.0;@];22:57;2019-10-30;232.0
		double retVal = 0.0;
		ArrayList<String> res = getSourceFile(sourceFilename);
		for (String s: res) {
			String[] lineArr = s.split(";");
			retVal += Double.parseDouble(lineArr[lineArr.length-1]);
		}
		return retVal;
	}
	public int[] computeMostPopularPizza(int daysFromToday) throws FileNotFoundException {
		int[] popArr = new int[30];
		ArrayList<String> res = getSourceFile(sourceFilename);
		for (String s: res) {
			String[] lineArr = s.split("\\[");
			String pizzaString = lineArr[1].split("\\]")[0];
			String[] pizzaArr = pizzaString.split("@");
			for (int i=0;i<pizzaArr.length;i++) {
				int idx = Integer.parseInt(pizzaArr[i].split(";")[0]);
				popArr[idx]++;
			}
		}

		return popArr;
	}
	
	public void writeResultToFile(String reString) {

	}
	public ArrayList<String> getSourceFile(String filename) throws FileNotFoundException {
		ArrayList<String> result = new ArrayList<>();
		File fh = new File(filename);
		Scanner myScanner = new Scanner(fh);
		while (myScanner.hasNextLine()){
			result.add(myScanner.nextLine());
		}
		return result;
	}
}
