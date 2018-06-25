package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i < 5; i++) {
			robots[i] = new Robot();
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for(int i = 0; i < 5; i++) {
			robots[i].setX(i*100);
			robots[i].setY(500);
			robots[i].setAngle(0);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		int random;
		for(int i = 0; i < 5; i++) {
			random = (int) (Math.random()*50);
			robots[i].move(random);
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		for(int i = 0; i < 5; i++) {
			while(robots[i].getY() > 0) {
				for(int j = 0; j < 5; j++) {
					robots[j].move((int) (Math.random()*50));
					robots[j].setSpeed(100);
				}
			}
		}
		//7. declare that robot the winner and throw it a party!
		for(int i = 0; i < 5; i++) {
			if(robots[i].getY() <= 0) {
				System.out.println("Robot" + i + "is the winner!");
			}
			robots[i].sparkle();
			robots[i].clear();
		}
		//8. try different races with different amounts of robots.
    		Robot[] nextRobots = new Robot[10];
    		for(int i = 0; i < 10; i++) {
    			while(nextRobots[i].getY() > 0) {
    				for(int j = 0; j < 10; j++) {
    					nextRobots[j].move((int) (Math.random()*50));
    				}
    			}
    			System.out.println("Robot" + i + "is the winner!");
    		}
	    //9. make the robots race around a circular track.
    		Robot[] circle = new Robot[5];
    		for(int i = 0; i < 5; i++) {
    			nextRobots[i].
    		}
	}
}
