package MOD;

public class Player {

	// INSTANCE VARIABLES
	private Position _curPos;
	private boolean isAlivePlayer = true;
	private boolean pickUp = false;
	public boolean isUsed = false;

	// CONSTRUCTOR
	public Player(Maze z) {
		_curPos = new Position(z.getStart().getRow(), z.getStart().getCol());
	}

	// ACCESSOR METHOD
	public Position getPosition() {
		return _curPos;
	}

	// SETTER METHODS
	public void setPosition(Position p) {
		_curPos = p;
	}

	/**
	 * This method checks if the player is dead or alive.
	 * @return true if the player is alive, false otherwise.
	 */
	public boolean isAlivePlayer() {
		return isAlivePlayer;
	}

	/**
	 * This method kills the player by setting its isAlivePlayer() status to false.
	 */
	public void killPlayer() {
		isAlivePlayer = false;
	}

	/**
	 * This method checks if the player has successfully picked up teh sword from the maze.
	 * @param p the player object
	 * @param l the sword object
	 * @return true if the player picked the sword up, false otherwise.
	 */
	public boolean isPickUp(Player p, Sword l) {
		if((p.getPosition().getRow() == l.getPosition().getRow() && p.getPosition().getCol() == l.getPosition().getCol()))
			pickUp = true;

		return pickUp;
	}

	/**
	 * This method checks is the player can move depending the location of the walls in the maze
	 * @param d the direction of the player
	 * @param z the Maze
	 * @return true if the player can move, false otherwise.
	 */
	public boolean move(DirectionPlayer d, Maze z) {
		if (d == DirectionPlayer.Up) {
			if (_curPos.getRow() - 1 >= 0 && !z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() - 1, _curPos.getCol());
				return true;
			}
		} 
		else if (d == DirectionPlayer.Down) {
			if (_curPos.getRow() + 1 < z.getMaze().length && !z.getMaze()[_curPos.getRow() + 1][_curPos.getCol()]) {
				_curPos = new Position(_curPos.getRow() + 1, _curPos.getCol());
				return true;
			}
		} 
		else if (d == DirectionPlayer.Right) {
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