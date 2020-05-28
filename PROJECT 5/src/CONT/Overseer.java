package CONT;

import MOD.*;
import VIEW.Frame;

public class Overseer {

	// INSTANCE VARIABLES
	Frame _f;
	Player _p;
	Minotaur _mtar;
	Rat _r;
	Zombie _zm;
	Sword _s;
	Position e_;
	Maze _z;
	public static boolean x;

	// CONSTRUCTOR
	public Overseer() {
		x = true; 
		_z = new Maze(0);
		_p = new Player(_z);
		_mtar = new Minotaur(_z);
		_r = new Rat(_z);
		_zm = new Zombie(_z);
		_s = new Sword(_z);
		Position _e = new Maze(0).getEnd();
		_f = new Frame(_z, _p, _mtar, _r, _zm, _s, _e);
	}

	/**
	 * This method checks if this is level 1
	 * @return true if this is level 1, false otherwise.
	 */
	public static boolean level1() {
		return x;
	}
}