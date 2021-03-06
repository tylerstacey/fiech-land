package ca.proj.game;

/**
 * 
 * Key.java is used to represent key presses from the user.
 * 
 * Copyright (C) 2013 Tyler Stacey, Mark Gauci, Ryan Martin, Mike Singleton
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
public class Key {
	private boolean pressed = false;

	/**
	 * Please add a description.
	 * 
	 * @return add a description
	 */
	public boolean isPressed() {
		return pressed;
	}

	/**
	 * Please add a description.
	 * 
	 * @param isPressed add a description
	 */
	public void toggle(boolean isPressed) {
		pressed = isPressed;
	}
}