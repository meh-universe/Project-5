package MOD;

public class Rat {

	// INSTANCE VARIABLES
	public boolean _isAliveRat = true;
	private Position _curPos;
	private boolean _facingLeft = true;

	// CONSTRUCTORS
	public Rat(Maze z) {
		_curPos = new Position(z.getRat().getRow(), z.getRat().getCol());
	}

	// ACCESSOR METHOD
	public Position getPosition() { 
		return _curPos;	
	}

	// SETTER METHOD
	public Position setPosition(Position p) { 
		return _curPos = p;	
	}

	/**
	 * This method checks if the Rat is dead or alive.
	 * @return true if the Rat is alive, false otherwise.
	 */
	public boolean isAliveRat() {
		return _isAliveRat;
	}

	/**
	 * This method kills the Rat by setting its isAliveMinotaur() status to false.
	 */
	public void killRat() {
		_isAliveRat = false;
	}

	/**
	 * This method checks is the Rat can move back and forth depending the location of the walls in the maze
	 * @param z the Maze
	 * @return true if the rat can move, false otherwise.
	 */
	public void move(Maze z) {
		if (_facingLeft) {
			if (!z.getMaze()[_curPos.getRow()][_curPos.getCol() - 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() - 1);
			} 
			else {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() + 1);
				_facingLeft = false;
			}
		} 
		else {
			if (!z.getMaze()[_curPos.getRow()][_curPos.getCol() + 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() + 1);
			} 
			else {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() - 1);
				_facingLeft = true;
			}

		}
	}	
	
}