package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot robo = new Robot();
	static Random rand = new Random();
	public static void main(String[] args) {
		int r = rand.nextInt(500);
		
		Robot.setWindowColor(Color.black);
		
		robo.setX(5);
		robo.setY(600);
		
		robo.setPenWidth(10);
		robo.penDown();
		robo.setSpeed(10000);
		
		
		
			flatHouse(1, "large", 100, 0, 0);
			flatHouse(1, "small", 100, 0, 0);
			flatHouse(1, "medium", 100, 0, 0);
			flatHouse(1, "small", 100, 0, 0);
			flatHouse(1, "large", 100, 0, 0);
			flatHouse(1, "medium", 100, 0, 0);
			flatHouse(1, "large", 100, 0, 0);
			flatHouse(1, "medium", 100, 0, 0);
			flatHouse(1, "small", 100, 0, 0);
	}
	public static void flatHouse (int num, String h, int r, int g, int b) {
		for (int i = 0; i < num; i++) {
			int height = 10;
	if (h.equals("small")) {
		height = 60;
	}
	else if (h.equals("medium")) {
		height = 120;
	}
	else if (h.equals("large")) {
		height = 250;
	}

		robo.setPenColor(r, g, b);
		robo.move(height);
		
		if (h.equals("large")) {
			drawFlatRoof();
		}
		else {
			drawPointyRoof();
		}
		
		robo.move(height);
		robo.setPenColor(0, 100, 0);
		robo.turn(270);
		robo.move(50);
		robo.turn(270);
		}
	
	}
	public static void drawPointyRoof () {
		robo.turn(45);
		robo.move(50);
		robo.turn(90);
		robo.move(50);
		robo.turn(45);
	}
	public static void drawFlatRoof () {
		robo.turn(90);
		robo.move(50);
		robo.turn(90);
	}
}
