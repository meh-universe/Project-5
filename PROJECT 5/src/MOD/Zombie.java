package MOD;

public class Zombie {

	// INSTANCE VARIABLE
	public boolean _isAliveZombie = true;
	private Position _curPos;
	private boolean _facingLeft = true;

	// CONSTRUCTOR
	public Zombie(Maze z) {
		_curPos = new Position(z.getZombie().getRow(), z.getZombie().getCol());
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
	public boolean isAliveZombie() {
		return _isAliveZombie;
	}

	/**
	 * This method kills the Zombie by setting its isAliveMinotaur() status to false.
	 */
	public void killZombie() {
		_isAliveZombie = false;
	}

	/**
	 * This method checks is the Zombie can move back and forth depending the location of the walls in the maze
	 * @param z the Maze
	 * @return true if the Zombie can move, false otherwise.
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