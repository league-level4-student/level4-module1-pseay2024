package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice)
		{
		case "Sunday":
			JOptionPane.showMessageDialog(null, "WHY");
			break;
		case "Monday":
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "OK");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Understandable");
			break;
		case "Thursday":
		case "Friday":
		case "Saturday":
			JOptionPane.showMessageDialog(null, "I get it");
			break;
		default:
			JOptionPane.showMessageDialog(null, "what");
			break;
		}
	}
}
