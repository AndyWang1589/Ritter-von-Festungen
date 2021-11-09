/*
 * [Tile.java]
 * This file contains the class for a Tile object.
 * Author: Andy Wang
 * Started on 28 Dec 2018
 */

/** All classes used in the game other than Main */
package gameClasses;

/**
 * Tile represents an in-game platform, on which the Player can stand and collide.
 * @author Andy Wang
 * @since 21 Dec 2018
 */
public class Tile extends Entity {
    public static final int TILE_LENGTH = 43; //does not apply to borders
    
    /**
     * This constructor initializes the Tile, with its name being set to "Tile".
     * @param x The x position.
     * @param y The y position.
     * @param cranberry The Tile's Sprite (wanna Sprite Cranberry?).
     * @param stage The stage the Tile is drawn on.
     */
    Tile (int x, int y, Sprite cranberry, Stage stage) {
        super (x, y, cranberry, stage);
    } 
    /**
     * This constructor initializes the Tile, along with a custom name.
     * @param x The x position.
     * @param y The y position.
     * @param spr The Tile's Sprite.
     * @param name The custom name of the Tile.
     * @param stage The stage the Tile is drawn on.
     */
    Tile (int x, int y, Sprite spr, String name, Stage stage) {
        super (x, y, spr, name, stage);
    }
}