package src.StartingOutWithJava.Chapter2;

import javax.swing.JOptionPane;

/**
 * This program demonstrates using dialogs
 * with JOptionPane.
 */
public class NameDialog {
	
	public static void main(String[] args) {
		
		String firstName;
		String middleName;
		String lastName;
		
		firstName = JOptionPane.showInputDialog("What is your First Name? ");
		middleName = JOptionPane.showInputDialog("What is your Middle Name? ");
		lastName = JOptionPane.showInputDialog("What is your Last Name? ");
		
		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName + " " + lastName);
		
		System.exit(0);
	}

}
