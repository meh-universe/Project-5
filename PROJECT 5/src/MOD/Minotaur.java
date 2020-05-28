package MOD;

public class Minotaur {

	// INSTANCE VARIABLES
	public boolean _isAliveMinotaur = true;
	private Position _curPos;

	// ACCESSOR METHODS
	public Position getPosition() { 
		return _curPos;	
	}

	// SETTER METHOD
	public void setPosition(Position p) {
		_curPos = p;
	}

	// CONSTRUCTOR
	public Minotaur(Maze z) {
        _curPos = new Position(z.getMinotaur().getRow(), z.getMinotaur().getCol());
    }

	/**
	 * This method checks if the Minotaur is dead or alive.
	 * @return true if the Minotaur is alive, false otherwise.
	 */
	public boolean isAliveMinotaur() {
		return _isAliveMinotaur;
	}

	/**
	 * This method kills the Minotaur by setting its isAliveMinotaur() status to false.
	 */
	public void killMinotaur() {
		_isAliveMinotaur = false;
	}

	/**
	 * Thishis method checks is the Minotaur can move depending the location of the walls in the maze
	 * @param d the direction of the Minotaur
	 * @param z the Maze
	 * @return true if the Minotaur can move, false otherwise.
	 */
	public boolean moveMinotaur(DirectionMinotaur d, Maze z) {
		if (d == DirectionMinotaur.Up) {
			if (_curPos.getRow() - 1 >= 0 && !z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() - 1, _curPos.getCol());
				return true;
			}
		} 
		else if (d == DirectionMinotaur.Down) {
			if (_curPos.getRow() + 1 < z.getMaze().length && !z.getMaze()[_curPos.getRow() + 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() + 1, _curPos.getCol());
				return true;
			}
		} 
		else if (d == DirectionMinotaur.Right) {
			if (_curPos.getCol() + 1 < z.getMaze()[_curPos.getRow()].length && !z.getMaze()[_curPos.getRow()][_curPos.getCol() + 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() + 1);
				return true;
			}
		} 
		else {
			if (_curPos.getCol() - 1 >= 0 && !z.getMaze()[_curPos.getRow()][_curPos.getCol() - 1]) {
				_curPos = new Position(_curPos.getRow(), _curPos.getCol() - 1);
				return true;
			}
		}
		return false;
	}
}