package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String input=JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
double input1 = Integer.parseInt(input);
		// Ask the user how many dimes they have, and convert their answer
String input2=JOptionPane.showInputDialog("how many dimes do you have");

double input3 = Integer.parseInt(input2);
		// Ask the user how many quarters they have, and convert their answer
String input4=JOptionPane.showInputDialog("how many quarters do you have");

double input5 = Integer.parseInt(input4);
		// Calculate how much money the user has.  Hint: Use a double variable 
input1=(input1 * .05);
input3=(input3 * .1);
input5=(input5 * .25);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null,input1+input3+input5);
	}
}

