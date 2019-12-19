package fracCalc;

import java.util.Scanner;

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1{

public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Please enter your equation (enter quit to quit): ");
	String equation = console.nextLine();
	
	while (!equation.toLowerCase().equals("quit")) {
		String results = produceAnswer(equation);
		System.out.println(results);
		System.out.print("Please enter your equation (quit to quit): ");
		equation = console.nextLine();

	}

	console.close();

	System.out.print("Fraction Calculator is Closed!");

}




	private static String produceAnswer(String equation) {
	// TODO Auto-generated method stub
	return null;
}






	@Test public void testCheckpoint1_1() {  FracCalcTestALL.assertForEarlyCheckpoints("6_5/8", "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint1_2() {FracCalcTestALL.assertForEarlyCheckpoints("20", "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint1_3() {FracCalcTestALL.assertForEarlyCheckpoints("27/21", "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}
}
