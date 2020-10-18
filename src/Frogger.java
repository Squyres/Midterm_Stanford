import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class Frogger extends GraphicsProgram {
	
	private static final int SQUARE_SIZE = 75;
	private static final int ROWS = 3;
	private static final int COLUMNS = 7;
	private static final int APP_WIDTH = COLUMNS * SQUARE_SIZE;
	private static final int APP_HEIGHT = ROWS * SQUARE_SIZE;
	private static GImage frog;
	private static double frogX;
	private static double frogY;
	
	public void run() {
		
		frog = new GImage("frog.png");
		frogX = (COLUMNS / 2 + .5) * SQUARE_SIZE;
		frogY = (ROWS - .5) * SQUARE_SIZE;
		add(frog, frogX -frog.getWidth() / 2,frogY -frog.getHeight() / 2);
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e) {
		double mouseX = e.getX();
		double mouseY = e.getY();
		if(Math.abs(mouseX -frogX) > Math.abs(mouseY - frogY)) {
			if(mouseX > frogY) {
				moveFrog(SQUARE_SIZE, 0);
			} else {
				moveFrog(-SQUARE_SIZE, 0);
			}
		} else {
			if(mouseY > frogY) {
				moveFrog(0, SQUARE_SIZE);
			} else {
				moveFrog(0, -SQUARE_SIZE);
			}
		}
	}
	private void moveFrog(double moveX, double moveY) {
		if(inWorld(frogX + moveX, frogY + moveY)) {
			frogX += moveX;
			frogY += moveY;
			frog.move(moveX, moveY);
		}
	}
	private boolean inWorld(double x, double y) {
		return(x >= 0 && x <= COLUMNS * SQUARE_SIZE && y >= 0 && y <= ROWS * SQUARE_SIZE);
	}
}
