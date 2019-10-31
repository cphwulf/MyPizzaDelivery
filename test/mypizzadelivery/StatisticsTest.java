package mypizzadelivery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class StatisticsTest {
	String destFile;
	String sourceFile;
	Scanner myScanner;
	BufferedWriter bw;
	
	
	@Before
	public void setUp() throws FileNotFoundException, IOException {
		destFile = "Data/stattest";
		sourceFile = "Data/allorderstest";
		File fhD = new File(destFile);
		File fhS = new File(sourceFile);
		myScanner = new Scanner(fhS);
		FileWriter fw = new FileWriter(fhD,true);
		bw = new BufferedWriter(fw);
	}

	/**
	 * Test of computeTurnOver method, of class Statistics.
	 */
	@Test
	public void testComputeTurnOver() throws Exception {
		System.out.println("computeTurnOver");
		int daysFromToday = 0;
		Statistics myStat = new Statistics();
		double expResult = 0.0;
		double result = myStat.computeTurnOver(daysFromToday);
		assertEquals(expResult, result, 0.0);
	}

	/**
	 * Test of computeMostPopularPizza method, of class Statistics.
	 */
	@Test
	public void testComputeMostPopularPizza() throws FileNotFoundException {
		// terminal grep -o
		System.out.println("computeMostPopularPizza");
		int daysFromToday = 0;
		Statistics myStat = new Statistics();
		int expResult = 0;
		int[] result = myStat.computeMostPopularPizza(daysFromToday);
		System.out.println(Arrays.toString(result));
		assertEquals(expResult, result);
	}

}
