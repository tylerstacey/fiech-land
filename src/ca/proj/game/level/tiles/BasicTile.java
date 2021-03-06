package ca.proj.game.level.tiles;

import ca.proj.game.gfx.Screen;
import ca.proj.game.level.Level;

/**
 * 
 * BasicTile.java is a tile in the game that the player can walk on.
 * 
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
public class BasicTile extends Tile {
	
	protected int tileId;
	protected int tileColour;

	/**
	 * Creates a new basic tile.
	 * 
	 * @param id the id of the tile.
	 * @param x the x coordinate of the tile on the level
	 * @param y the y coordinate of the tile on the level
	 * @param tileColour the colour of the tile
	 * @param levelColour the color of the corresponding pixel on a level's image
	 */
	public BasicTile(int id, int x, int y, int tileColour, int levelColour ) {
		super(id, false, false, levelColour);
		this.tileId = x + y * 32;
		this.tileColour = tileColour;
	
	}

	/* (non-Javadoc)
	 * @see ca.proj.game.level.tiles.Tile#tick()
	 */
	@Override
	public void tick(){
	}
	
	/* (non-Javadoc)
	 * @see ca.proj.game.level.tiles.Tile#render(ca.proj.game.gfx.Screen, ca.proj.game.level.Level, int, int)
	 */
	@Override
	public void render(Screen screen, Level level, int x, int y) {
		screen.render(x, y, tileId, tileColour, 0x00, 1);
	}
	
}
