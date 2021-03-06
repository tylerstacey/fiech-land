package ca.proj.game.menus;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import ca.proj.game.Game;

/**
 * 
 * MilitaryActionMenu.java 
 * Copyright (C) 2013 
 * Tyler Stacey, Mark Gauci, Ryan Martin, Mike Singleton
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
public class MilitaryActionMenu extends JFrame {

	private JButton troopSkirmish = new JButton();
	private JButton borderDefense = new JButton();
	private JButton borderPatrol = new JButton();
	private JButton secretOperations = new JButton();
	private JButton mainMenu = new JButton();
	
	//Random number generator
	static Random militaryGen = new Random();
	
	//Holds random number
	private double random;
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT,
			BufferedImage.TYPE_INT_RGB);

	/**
	 * Creates a new military action menu frame.
	 * 
	 * @param title the title of the frame
	 */
	public MilitaryActionMenu(String title) {

		super(title);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 650;
		int frameHeight = 500;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setResizable(false);
		Container cp = getContentPane();
		BoxLayout boxLayout = new BoxLayout(cp, BoxLayout.Y_AXIS);
		cp.setLayout(boxLayout);

		Dimension buttonSize = new Dimension(305, 40);
		Dimension minSize = new Dimension(0, 5);
		Dimension prefSize = new Dimension(0, 5);
		Dimension maxSize = new Dimension(0, 5);
		
		//First Military Action Button - Troop Skirmish
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		troopSkirmish.setMinimumSize(buttonSize);
		troopSkirmish.setPreferredSize(buttonSize);
		troopSkirmish.setMaximumSize(buttonSize);
		troopSkirmish.setAlignmentX(Component.CENTER_ALIGNMENT);
		troopSkirmish.setText("Troop Skirmish");
		troopSkirmish.setMargin(new Insets(2, 2, 2, 2));
		troopSkirmish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performMilitaryAction(15, 0.50);
			}
		});
		troopSkirmish.setBackground(Color.WHITE);
		troopSkirmish.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(troopSkirmish);
				
		//Second Military Action Button - Border Defense
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		borderDefense.setMinimumSize(buttonSize);
		borderDefense.setPreferredSize(buttonSize);
		borderDefense.setMaximumSize(buttonSize);
		borderDefense.setAlignmentX(Component.CENTER_ALIGNMENT);
		borderDefense.setText("Border Defense");
		borderDefense.setMargin(new Insets(2, 2, 2, 2));
		borderDefense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performMilitaryAction(5, 0.75);
			}
		});
		borderDefense.setBackground(Color.WHITE);
		borderDefense.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(borderDefense);
	
		//Third Military Action Button - Border Patrol
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		borderPatrol.setMinimumSize(buttonSize);
		borderPatrol.setPreferredSize(buttonSize);
		borderPatrol.setMaximumSize(buttonSize);
		borderPatrol.setAlignmentX(Component.CENTER_ALIGNMENT);
		borderPatrol.setText("Border Patrol");
		borderPatrol.setMargin(new Insets(2, 2, 2, 2));
		borderPatrol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performMilitaryAction(10, 0.60);
			}
		});
		borderPatrol.setBackground(Color.WHITE);
		borderPatrol.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(borderPatrol);
				
		//Fourth Military Action Button - Secret Operations
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		secretOperations.setMinimumSize(buttonSize);
		secretOperations.setPreferredSize(buttonSize);
		secretOperations.setMaximumSize(buttonSize);
		secretOperations.setAlignmentX(Component.CENTER_ALIGNMENT);
		secretOperations.setText("Secret Operations");
		secretOperations.setMargin(new Insets(2, 2, 2, 2));
		secretOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performMilitaryAction(25, 0.25);
			}
		});
		secretOperations.setBackground(Color.WHITE);
		secretOperations.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(secretOperations);
				
		//Main Menu Button
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		mainMenu.setMinimumSize(buttonSize);
		mainMenu.setPreferredSize(buttonSize);
		mainMenu.setMaximumSize(buttonSize);
		mainMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainMenu.setText("Back to the Main Menu");
		mainMenu.setMargin(new Insets(2, 2, 2, 2));
		mainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				mainMenu_ActionPerformed(evt);
			}
		});
		mainMenu.setBackground(Color.WHITE);
		mainMenu.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(mainMenu);
		
		for (Component j : cp.getComponents() ){
			if (j instanceof JButton){
				j.setFont(new Font("Sans", Font.BOLD, 14));
			}
			
		}
		cp.setBackground(new Color(0x3399FF));
		setVisible(true);
	}
		
	// Perform Main Menu Action
	public void mainMenu_ActionPerformed(ActionEvent evt) { 
		//Close Military Menu
		closeMenu();
	}
	
	/**
	 * Performs a military action with a specific chance of success. Happiness gained is equal to the specified score multiplier multiplied by the Game.players military attribute. Costs one action point.
	 * 
	 * @param mult the multiplier that decides how many happiness points the Game.player gets
	 * @param percentChance	the chance the action succeeds
	 */
	public void performMilitaryAction(int mult, double percentChance){
		//Generate the random percentage needed out of 100
		random = militaryGen.nextDouble();
		if (Game.player.getActionPoints() > 0) {
			//	This action has a chance of success
			if (random <= percentChance) {
				/*	If successful, happiness variable will be set to mult * Military Focus value,
				 *	a message to the Game.player will tell them how many happiness points they've
				 *	gained and decrement the Game.players action points by 1.
				 */
				Game.player.setHappiness(Game.player.getHappiness() + Game.player.getMilitary() * mult);
				System.out.println(">> You have " + Game.player.getHappiness() + " happiness points.");
			} else {
				/*	If unsuccessful, still decrement action points, tell the Game.player that
				 *	they've gained no points, and decrement action points by 1.
				 */
				System.out.println("Action failed. No happiness gained");
			}
		}
		else System.out.println("You don't have enough action points");
		Game.player.setActionPoints(Game.player.getActionPoints()-1);
	}
	
	/**
	 * Closes the menu.
	 */
	public void closeMenu() {
		WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
	}
}
