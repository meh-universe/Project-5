package CONT;

import MOD.*;
import VIEW.Frame;

public class Overseer10 {

	// INSTANCE VARIABLE
	Frame _f;
	Player _p;
	Minotaur _mtar;
	Rat _r;
	Zombie _zm;
	Sword _s;
	Position e_;
	Maze _z;
	static boolean x;

	// CONSTRUCTOR
	public Overseer10() {
		x = true; 
		_z = new Maze(9);
		_p = new Player(_z);
		_mtar = new Minotaur(_z);
		_r = new Rat(_z);
		_zm = new Zombie(_z);
		_s = new Sword(_z);
		Position _e = new Maze(9).getEnd();
		_f = new Frame(_z, _p, _mtar, _r, _zm, _s, _e);

	}

	/**
	 * This method checks if this is level 10
	 * @return true if this is level 10, false otherwise.
	 */
	public static boolean level10() {
		return x;
	}
}