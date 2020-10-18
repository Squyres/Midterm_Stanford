import stanford.karel.*;


public class BorderKarel extends SuperKarel {

	public void run() {
		turnLeft();
		move();
		turnRight();
		for(int i = 0; i < 4; i ++) {
			drawRow();
		}
	}
	public void drawRow() {
		move();
		while(noBeepersPresent() == true) {
			if(frontIsBlocked() == true) break;
			putBeeper();
			move();
		}
		turnAround();
		move();
		turnRight();
	}
}