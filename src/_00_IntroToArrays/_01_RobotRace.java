package _00_IntroToArrays;

import static org.junit.jupiter.api.Assumptions.assumingThat;

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
		boolean reached = false;
		while(!reached) {
			for(int j = 0; j < 5; j++) {
				robots[j].move((int) (Math.random()*50));
				robots[j].setSpeed(100);
				if(robots[j].getY() <= 0) {
					reached = true;
				}
			}
		}
		//7. declare that robot the winner and throw it a party!
		for(int i = 0; i < 5; i++) {
			if(robots[i].getY() <= 0){
				System.out.println("Robot " + i + " is the winner!");
			}
			robots[i].sparkle();
			robots[i].clear();
		}
		//8. try different races with different amounts of robots.
    		Robot[] nextRobots = new Robot[3];
    		for(int i = 0; i < 3; i++) {
    			nextRobots[i] = new Robot();
    			nextRobots[i].setX((i + 1) * 100);
    			nextRobots[i].setY(500);
    			nextRobots[i].setAngle(0);
    		}
    		boolean reached1 = false;
    		while(!reached1) {
    			for(int i = 0; i < 3; i++) {
    				nextRobots[i].move((int) (Math.random()*50));
    				nextRobots[i].setSpeed(100);
    				if(nextRobots[i].getY() <= 0) {
    					reached1 = true;
    					System.out.println("Robot " + i + " is the winner!");
    				}
    				nextRobots[i].clear();
    			}
    		}
	    //9. make the robots race around a circular track.
    		Robot[] circle = new Robot[3];
    		for(int i = 0; i < 3; i++) {
    			circle[i] = new Robot();
    			circle[i].setX(150);
    			circle[i].setY(250);
    			circle[i].setAngle(0);
    		}
    		int circle1 = 0;
    		int circle2 = 0; 
    		int circle3 = 0;
    		while((circle1 <= 360) && (circle2 <= 360) && (circle3 <= 360)) {
    			for(int i = 0; i < 3; i++) {
    				double move = Math.random() * 25;
    				for(int j = 0; j < move; j++) {
    					circle[i].move(10);
    					circle[i].turn(2);
    					circle[i].setSpeed(100);
    					if(i == 0) {
    						circle1 += 2;
    					}
    					else if(i == 1) {
    						circle2 += 2;
    					}
    					else if(i == 2) {
    						circle3 += 2;
    					}
    				}
    				if(circle1 >= 360) {
    					System.out.println("Robot 0 is the winner!");
    				}
    				else if(circle2 >= 360) {
    					System.out.println("Robot 1 is the winner!");
    				}
    				else if(circle3 >= 360) {
    					System.out.println("Robot 2 is the winner!");
    				}
    			}
    		}
	}
}
