package elseif;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
String a1=	JOptionPane.showInputDialog("Are you happy? Yes or no.");
	if (a1.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
	}
	else {
	String a2=	JOptionPane.showInputDialog(null, "Do you want to be happy?");
	if (a2.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
	}
	else {
		JOptionPane.showMessageDialog(null, "CHANGE SOMETHING!!!!");
	}
	}
}
}
