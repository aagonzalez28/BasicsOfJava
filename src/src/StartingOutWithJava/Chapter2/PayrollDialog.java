/**
 * 
 */
package src.StartingOutWithJava.Chapter2;

import javax.swing.JOptionPane;

/**
 * This program demonstrates using dialogs
 * with JOptionPane.
 */
public class PayrollDialog {
	
	public static void main(String[] args) {
		
		String inputString;
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		name = JOptionPane.showInputDialog("What is your name? ");
		
		inputString = JOptionPane.showInputDialog("How many hours did you work this week ? ");
		
		hours = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("What is your hourly pay rate? ");
		
		payRate = Double.parseDouble(inputString);
		
		grossPay = hours * payRate;
		
		JOptionPane.showMessageDialog(null, "Hello " + name + ". Your gross pay is $" + grossPay);
		
//		greetings();
//		
//		numberInput();
		
	}
	
	public static void greetings() {
		
		JOptionPane.showMessageDialog(null, "Greetings Earthling.");
		
	}
	
	public static void numberInput() {// 98
		
		String inputString = JOptionPane.showInputDialog("Enter a number ");
		
		int number = Integer.parseInt(inputString);
		
		JOptionPane.showMessageDialog(null, "Your number is " + number);

		
	}

}
