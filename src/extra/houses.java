package extra;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	public static void main(String[] args) {
		Robot robo = new Robot();
		
		robo.setX(0);
		robo.setY(600);
		
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
	}

}
