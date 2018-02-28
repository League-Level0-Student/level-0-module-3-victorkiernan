//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob  = new Robot();
		rob.penDown();
		rob.miniaturize();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 10000; i++) {
		String color=		JOptionPane.showInputDialog("What color should the shape be?");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("red")) {
	rob.setPenColor(255, 0, 0);
} 
else if (color.equalsIgnoreCase("green")) {
	rob.setPenColor(0, 255, 0);
} else if (color.equalsIgnoreCase("blue")) {
	rob.setPenColor(0, 0, 255);
} 
else {
rob.setRandomPenColor();	
}
		
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		;
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int p = 0; p < 360; p++) {
		rob.move(2);
rob.turn(1);
rob.setPenWidth(p);		}
	}
}

}