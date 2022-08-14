package src.StartingOutWithJava.Chapter2;

import javax.swing.JOptionPane;

/*
 * Write a program that computes the tax and the tip on a restaurant bill. The program
 * should ask the user to enter the charge for the meal. The tax should be 8 percent of the 
 * meal charge. The tip should be 15 percent of the total after adding the tax. Display the meal
 * charge, tax amount, tip amount, and total bill on the screen.
 */

public class RestaurantBillProgram {
	
	public static void main(String[] args){
		
		String inputString;
		
		double bill;
		double total;
		
		double tax = 0.08;
		double tip = 0.15;
		
		double totalPlusTax;
		double total2;
		double totalPlusTip;
		
				
		inputString = JOptionPane.showInputDialog("How much is the bill? ");
		
		bill = Double.parseDouble(inputString);
			
		totalPlusTax = bill * tax;
		total2 = bill + totalPlusTax;
		totalPlusTip = (total2 * tip);
			
		total = totalPlusTax + totalPlusTip + bill;
		
		
		JOptionPane.showMessageDialog(null, "Hello, Your bill is $ " + bill + " Tax total is $ " 
		+ totalPlusTax + " Tip is $ " + totalPlusTip + " Your total is " + total);		
		
	}	

}
