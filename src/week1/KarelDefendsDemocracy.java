package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while(frontIsClear()) {
			move();
			checkChad();
			
		}
	}
	// checkChad is method for checking ballot boxes /
	
	private void checkChad() {
		if(noBeepersPresent()) {
			turnLeft();
			move();
			turnAround();
			while(beepersPresent()) {
				pickBeeper();
			}
			move();
			move();
			turnAround();
			while(beepersPresent()) {
				pickBeeper();
			}
			move();
			turnRight();
			}
		else {
			turnLeft();
			move();
			turnAround();
			while(noBeepersPresent()) {
				putBeeper();
			}
			move();
			move();
			turnAround();
			while(noBeepersPresent()) {
				putBeeper();
			}
			move();
			turnRight();
			}
	}
	}

		