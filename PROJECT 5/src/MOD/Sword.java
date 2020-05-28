package MOD;

import MOD.*;

public class Sword {
	// INSTANCE VARIABLE
	private Position _curPos;

	// CONSTRUCTOR
	public Sword(Maze z) {
		_curPos = new Position(z.getSword().getRow(), z.getSword().getCol());
	}

	// ACCESSOR METHOD
	public Position getPosition() { 
		return _curPos;	
	}

	// SETTER METHOD
	public void delete(Position p, Player pl, Sword l) {
		if(pl.isPickUp(pl, l))
			_curPos = new Position(0, 0);
	}

	public void setPosition(Position position) {
	}
}
