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
 * WealthActionMenu.java 
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
public class WealthActionMenu extends JFrame {

	private JButton piggyBank = new JButton();
	private JButton freeTradeAgreement = new JButton();
	private JButton foreignTradeMission = new JButton();
	private JButton buyStocks = new JButton();
	private JButton mainMenu = new JButton();
	
	//Random number generator
	static Random wealthGen = new Random();
	
	//Holds random number
	private double random;
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT,
			BufferedImage.TYPE_INT_RGB);

	/**
	 * Creates a new wealth action menu frame.
	 * 
	 * @param title the title of the frame
	 */
	public WealthActionMenu(String title) {

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

		//First Wealth Action Button - Put Money in the Piggy Bank
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		piggyBank.setMinimumSize(buttonSize);
		piggyBank.setPreferredSize(buttonSize);
		piggyBank.setMaximumSize(buttonSize);
		piggyBank.setAlignmentX(Component.CENTER_ALIGNMENT);
		piggyBank.setText("Put Money in the Piggy Bank");
		piggyBank.setMargin(new Insets(2, 2, 2, 2));
		piggyBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performWealthAction(15, 0.50);
			}
		});
		piggyBank.setBackground(Color.WHITE);
		piggyBank.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(piggyBank);
				
		//Second Wealth Action Button - Free Trade Agreement
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		freeTradeAgreement.setMinimumSize(buttonSize);
		freeTradeAgreement.setPreferredSize(buttonSize);
		freeTradeAgreement.setMaximumSize(buttonSize);
		freeTradeAgreement.setAlignmentX(Component.CENTER_ALIGNMENT);
		freeTradeAgreement.setText("Free Trade Agreement");
		freeTradeAgreement.setMargin(new Insets(2, 2, 2, 2));
		freeTradeAgreement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performWealthAction(5, 0.75);
			}
		});
		freeTradeAgreement.setBackground(Color.WHITE);
		freeTradeAgreement.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(freeTradeAgreement);
				
		//Third Wealth Action Button - Foreign Trade Mission
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		foreignTradeMission.setMinimumSize(buttonSize);
		foreignTradeMission.setPreferredSize(buttonSize);
		foreignTradeMission.setMaximumSize(buttonSize);
		foreignTradeMission.setAlignmentX(Component.CENTER_ALIGNMENT);
		foreignTradeMission.setText("Foreign Trade Mission");
		foreignTradeMission.setMargin(new Insets(2, 2, 2, 2));
		foreignTradeMission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performWealthAction(10, 0.60);
			}
		});
		foreignTradeMission.setBackground(Color.WHITE);
		foreignTradeMission.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(foreignTradeMission);
		
		//Fourth Wealth Action Button - Buy Stocks
		cp.add(new Box.Filler(minSize, prefSize, maxSize));
		buyStocks.setMinimumSize(buttonSize);
		buyStocks.setPreferredSize(buttonSize);
		buyStocks.setMaximumSize(buttonSize);
		buyStocks.setAlignmentX(Component.CENTER_ALIGNMENT);
		buyStocks.setText("Buy Stocks");
		buyStocks.setMargin(new Insets(2, 2, 2, 2));
		buyStocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				performWealthAction(25, 0.25);
			}
		});
		buyStocks.setBackground(Color.WHITE);
		buyStocks.setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN,
				Color.BLACK));
		cp.add(buyStocks);
				
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
		
	// Main Menu Action
	public void mainMenu_ActionPerformed(ActionEvent evt) { 
				//Close Wealth Menu
				closeMenu();
	}
	
	/**
	 * Performs a wealth action with a specific chance of success. Happiness gained is equal to the specified score multiplier multiplied by the Game.players wealth attribute. Costs one action point.
	 * 
	 * @param mult the multiplier that decides how many happiness points the Game.player gets
	 * @param percentChance	the chance the action succeeds
	 */
	public void performWealthAction(int mult, double percentChance){
		//Generate the random percentage needed out of 100
		random = wealthGen.nextDouble();
		if (Game.player.getActionPoints() > 0) {
			//	This action has a chance of success
			if (random <= percentChance) {
				/*	If successful, happiness variable will be set to mult * Wealth Focus value,
				 *	a message to the Game.player will tell them how many happiness points they've
				 *	gained and decrement the Game.players action points by 1.
				 */
				Game.player.setHappiness(Game.player.getHappiness() + Game.player.getWealth() * mult);
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
