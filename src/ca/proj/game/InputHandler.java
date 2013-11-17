package ca.proj.game;

import java.awt.Menu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InputHandler implements KeyListener {
	public static int lookDir;
	
	public InputHandler(Game game) {
		game.addKeyListener(this);
	}
	
	public class Key {
		private boolean pressed = false;
		
		public boolean isPressed() {
			return pressed;
		}
		
		public void toggle(boolean isPressed) {
			pressed = isPressed;
		}
	}
	
	//MOVEMENT
	public Key up = new Key();
	public Key down = new Key();
	public Key left = new Key();
	public Key right = new Key();
	
	//ACTIONS
	public Key coords = new Key();
	
	public Key eins = new Key();
	public Key zwei = new Key();
	//DOOR
	public Key enter = new Key();
	//PICK UP
	public Key investigate = new Key();
	//MENU
	public Key escape = new Key();
	

	public void keyPressed(KeyEvent e) {
		toggleKey(e.getKeyCode(), true);
	}

	
	public void keyReleased(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}


	public void keyTyped(KeyEvent e) {
		
	}
	
	public void toggleKey(int keyCode, boolean isPressed) {
		//MOVEMENT
		if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) { 
			lookDir = 0;
			up.toggle(isPressed); }
		
		
		if(keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) { 
			lookDir = 1;
			down.toggle(isPressed); }
	
		
		if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) { 
			lookDir = 2;
			left.toggle(isPressed); }
		
		
		if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) { 
			lookDir = 3;
			right.toggle(isPressed); }
		
		//COORDS
		if(keyCode == KeyEvent.VK_K) {
			System.out.println("X:"+Game.player.x+" Y:"+Game.player.y);
			coords.toggle(isPressed); }
		
		//DOOR
		if(keyCode == KeyEvent.VK_ENTER) { 
			enter.toggle(isPressed); }
		//INVESTIGATE
		if(keyCode == KeyEvent.VK_I) { 
			investigate.toggle(isPressed);}
		//RESET LEVEL
		if(keyCode == KeyEvent.VK_R) { 
			Game.startLevel("/levels/level_1.png", 390, 390);}
		//MENU / ESCAPE
		//if(keyCode == KeyEvent.VK_ESCAPE) { 
		//	Menu.main(null);}
		
		
	}
	

}