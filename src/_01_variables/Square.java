package _01_variables;

import org.jointheleague.graphical.robot.Robot;

public class Square {
public static void main(String[] args) {
	Robot mega = new Robot(); 
	
	mega.setSpeed(200);
	mega.penDown();

	mega.setPenWidth(150);
	mega.hide();
	for(int i=0; i<4; i++) {
	mega.setRandomPenColor();
	mega.move(250);
	mega.turn(90);
	}
}
}
